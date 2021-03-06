package com.moonsolid.sc;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Scanner;
import java.util.Set;
import com.moonsolid.sc.context.ApplicationContextListener;
import com.moonsolid.sc.domain.Board;
import com.moonsolid.sc.domain.Lesson;
import com.moonsolid.sc.domain.Member;
import com.moonsolid.sc.handler.BoardAddCommand;
import com.moonsolid.sc.handler.BoardDeleteCommand;
import com.moonsolid.sc.handler.BoardDetailCommand;
import com.moonsolid.sc.handler.BoardListCommand;
import com.moonsolid.sc.handler.BoardUpdateCommand;
import com.moonsolid.sc.handler.Command;
import com.moonsolid.sc.handler.HelloCommand;
import com.moonsolid.sc.handler.LessonAddCommand;
import com.moonsolid.sc.handler.LessonDeleteCommand;
import com.moonsolid.sc.handler.LessonDetailCommand;
import com.moonsolid.sc.handler.LessonListCommand;
import com.moonsolid.sc.handler.LessonUpdateCommand;
import com.moonsolid.sc.handler.MemberAddCommand;
import com.moonsolid.sc.handler.MemberDeleteCommand;
import com.moonsolid.sc.handler.MemberDetailCommand;
import com.moonsolid.sc.handler.MemberListCommand;
import com.moonsolid.sc.handler.MemberUpdateCommand;
import com.moonsolid.sc.util.Prompt;

public class App {

   Scanner keyboard = new Scanner(System.in);

   Deque<String> commandStack = new ArrayDeque<>();
   Queue<String> commandQueue = new LinkedList<>();

   

   Set<ApplicationContextListener> listeners = new HashSet<>();
   
   Map<String,Object> context = new HashMap<>();

   public void addApplicationContextListener(ApplicationContextListener listener) {
     listeners.add(listener);
   }
   
   public void removeApplicationContextListener(ApplicationContextListener listener) {
     listeners.remove(listener);
   }
   
   private void notifyApplicationInitialized() {
     for (ApplicationContextListener listener : listeners) {
       listener.contextInitialized(context);
     }
   }
   
   private void notifyApplicationDestroyed() {
     for (ApplicationContextListener listener : listeners) {
       listener.contextDestroyed(context);
     }
   }
  
  public void service() {

    notifyApplicationInitialized();

    List<Board> boardList = new ArrayList<>(); 
    List<Lesson> lessonList = new ArrayList<>();
    List<Member> memberList = new ArrayList<>();
    
    
   

    Prompt prompt = new Prompt(keyboard);
    HashMap<String, Command> commandMap = new HashMap<>();

    commandMap.put("/board/add",new BoardAddCommand(prompt,boardList));
    commandMap.put("/board/list",new BoardListCommand(boardList)) ;
    commandMap.put("/board/detail",new BoardDetailCommand(prompt,boardList));
    commandMap.put("/board/delete",new BoardDeleteCommand(prompt,boardList));    
    commandMap.put("/board/update",new BoardUpdateCommand(prompt,boardList));

    commandMap.put("/lesson/add",new LessonAddCommand(prompt,lessonList));
    commandMap.put("/lesson/list",new LessonListCommand(lessonList));
    commandMap.put("/lesson/detail",new LessonDetailCommand(prompt,lessonList));
    commandMap.put("/lesson/delete",new LessonDeleteCommand(prompt,lessonList));
    commandMap.put("/lesson/update",new LessonUpdateCommand(prompt,lessonList));


    commandMap.put("/member/add",new MemberAddCommand(prompt,memberList));
    commandMap.put("/member/list",new MemberListCommand(memberList));
    commandMap.put("/member/detail",new MemberDetailCommand(prompt,memberList));
    commandMap.put("/member/delete",new MemberDeleteCommand(prompt,memberList));
    commandMap.put("/member/update",new MemberUpdateCommand(prompt,memberList));

    commandMap.put("/hello", new HelloCommand(prompt));

    String command;

    while (true) {
      System.out.print("\n명령> ");
      command = keyboard.nextLine();

      if (command.length() == 0)
        continue;


      if (command.equals("quit")) {
        System.out.println("안녕");
        break;
      } else if (command.equals("history")) {
        printCommandHistory(commandStack.iterator());
        continue;
      } else if (command.equals("history2")) {
        printCommandHistory(commandQueue.iterator());
        continue;
      } 

      commandStack.push(command);
      commandQueue.offer(command);

      Command commandHandler = commandMap.get(command);      

      if (commandHandler != null) {
        try {
          commandHandler.execute();
        } catch (Exception e) {
          System.out.printf("명령어 실행 중 오류 발생: %s\n", e.getMessage());  
        }
      } else {
        System.out.println("실행할 수 없는 명령입니다.");
      }
    }        

    keyboard.close();

    notifyApplicationDestroyed();
    
  }

  private void printCommandHistory(Iterator<String> iterator) {
    int count = 0;
    while (iterator.hasNext()) {
      System.out.println(iterator.next());
      count++;

      if ((count % 5) == 0) {
        System.out.print(":");
        String str = keyboard.nextLine();
        if (str.equalsIgnoreCase("q")) {
          break;
        }
      }
    }
  }
  
  public static void main(String[] args) {
    App app = new App();
    
    app.addApplicationContextListener(new DataLoaderListener());
    app.addApplicationContextListener(new GreetingListener());
    app.service();
  }
  
}

