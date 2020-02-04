package com.moonsolid.sc;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;
import com.google.gson.Gson;
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

  static Scanner keyboard = new Scanner(System.in);

  static Deque<String> commandStack = new ArrayDeque<>();
  static Queue<String> commandQueue = new LinkedList<>();

  static List<Board> boardList = new ArrayList<>(); 
  static List<Lesson> lessonList = new ArrayList<>();
  static List<Member> memberList = new ArrayList<>();



  public static void main(String[] args) {

    loadLessonData();
    loadMemberData();
    loadBoardData();

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

    saveLessonData();
    saveMemberData();
    saveBoardData();
  }

  private static void printCommandHistory(Iterator<String> iterator) {
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

  @SuppressWarnings("unchecked")
  private static void loadLessonData() {
    File file = new File("./lesson.ser");


    try (ObjectInputStream in =
        new ObjectInputStream(new BufferedInputStream(new FileInputStream(file)))){
      lessonList = (List<Lesson>) in.readObject();
      System.out.printf("총 %d 개의 수업 데이터를 로딩했습니다.\n",lessonList.size());        

    } catch (Exception e) {
      System.out.println("파일 읽기 중 오류 발생! - " + e.getMessage());
    } 
  }

  private static void saveLessonData() {
    File file = new File("./lesson.ser");


    try (ObjectOutputStream out =
        new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(file)))) {
      out.writeObject(lessonList);
      System.out.printf("총 %d개의 수업 데이터를 저장했습니다\n", lessonList.size());
    } catch (IOException e) {
      System.out.println("파일 쓰기중 오류 발생! - " + e.getMessage());
    }
  }

  @SuppressWarnings("unchecked")
  private static void loadMemberData() {
    File file = new File("./member.ser");

    try (ObjectInputStream in = new ObjectInputStream(new BufferedInputStream(new FileInputStream(file)))) {
      memberList = (List<Member>) in.readObject();
      System.out.printf("총 %d 개의 회원 데이터를 로딩했습니다.\n",memberList.size());

    } catch (Exception e) {
      System.out.println("파일 읽기 중 오류 발생! -" + e.getMessage());
    }
  }

  private static void saveMemberData() {
    File file = new File("./member.ser");


    try (ObjectOutputStream out = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(file)))) {
      out.writeObject(memberList);
      System.out.printf("총 %개의 회원 데이터를 저장했습니다. \n",memberList.size());

    } catch (IOException e) {
      System.out.println("파일 쓰기 중 오류 발생! -" + e.getMessage());
    } 
  }

  @SuppressWarnings("unchecked")
  private static void loadBoardData() {
    File file = new File("./board.ser");

    try (ObjectInputStream in = new ObjectInputStream(new BufferedInputStream(new FileInputStream(file)))){
      boardList = (List<Board>) in.readObject();
      System.out.printf("총 %d 개의 게시글 데이터를 로딩했습니다.\n ",boardList.size());

    } catch (Exception e) {
      System.out.println("파일 읽기 중 오류 발생! - " + e.getMessage());
    }
  }

  private static void saveBoardData() {
    File file = new File("./board.ser");

    try (ObjectOutputStream out = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(file)))) {
      out.writeObject(boardList);;
      System.out.printf("총 %d 개의 게시글 데이터를 저장했습니다.\n",boardList.size());
    } catch(IOException e) {
      System.out.println("파일 쓰기중 오류 발생! -" + e.getMessage());
    } 
  }
}








