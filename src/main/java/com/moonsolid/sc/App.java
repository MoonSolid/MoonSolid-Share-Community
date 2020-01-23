package com.moonsolid.sc;

import java.util.Scanner;

import com.moonsolid.sc.handler.BoardHandler;
import com.moonsolid.sc.handler.LessonHandler;
import com.moonsolid.sc.handler.MemberHandler;
import com.moonsolid.sc.util.Prompt;
import com.moonsolid.sc.util.Queue;
import com.moonsolid.sc.util.Stack;

public class App {

  static Scanner keyboard = new Scanner(System.in);
  
  static Stack<String> commandStack = new Stack<>();
  static Queue<String> commandQueue = new Queue<>();
  
  public static void main(String[] args) {
    
    Prompt prompt = new Prompt(keyboard);
    
    BoardHandler boardHandler = new BoardHandler(prompt);
    LessonHandler lessonHandler = new LessonHandler(prompt);
    MemberHandler memberHandler = new MemberHandler(prompt);

    String command;
    
    do {
      System.out.print("\n명령> ");
      command = keyboard.nextLine();
      
      if (command.length() == 0)
        continue;
      
       commandStack.push(command);
       commandQueue.offer(command);
      
      switch (command) {
        case "/lesson/add":
          lessonHandler.addLesson();
          break;
        case "/lesson/list":
          lessonHandler.listLesson();
          break;
        case "/lesson/detail":
          lessonHandler.listLesson();
          break;
        case "/lesson/update":
          lessonHandler.listLesson();
          break;
        case "/lesson/delete":
          lessonHandler.listLesson();
            break;
        case "/member/add":
          memberHandler.addMember();
          break;
        case "/member/list":
          memberHandler.listMember();
          break;
        case "/member/detail":
          memberHandler.listMember();
          break;
        case "/member/update":
          memberHandler.listMember();
          break;
        case "/member/delete":
          memberHandler.listMember();
            break;
        case "/board/add":
          boardHandler.listBoard();
          break;
        case "/board/list":
          boardHandler.listBoard();
          break;
        case "/board/detail":
          boardHandler.listBoard();
          break;
        case "/board/update":
          boardHandler.listBoard();
          break;
        case "/board/delete":
          boardHandler.listBoard();
            break;
        case "history":
          printCommandHistory();
          break;
        case "history2":
          printCommandHistory2();
          break;
        default:
          if (!command.equalsIgnoreCase("quit")) {
            System.out.println("실행할 수 없는 명령입니다.");
          }
      }
      
    } while (!command.equalsIgnoreCase("quit"));
    
    System.out.println("안녕!");
    
    keyboard.close();
  }
  
  
  private static void printCommandHistory2() {
    Queue<String> historyQueue = commandQueue.clone();
    int count = 0;

    while (historyQueue.size() > 0) {
      System.out.println(historyQueue.poll());
      
      if ((++count % 5) == 0) {
        System.out.print(":");
        String str = keyboard.nextLine();
        if (str.equalsIgnoreCase("q")) {
          break;
        }
      }
    }
  }
  
  private static void printCommandHistory() {
    Stack<String> historyStack = commandStack.clone();
    int count = 0;
    while (!historyStack.empty()) {
      System.out.println(historyStack.pop());
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
  
}






