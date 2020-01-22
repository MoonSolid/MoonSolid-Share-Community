package com.moonsolid.sc;

import java.util.Scanner;
import com.moonsolid.sc.handler.BoardHandler;
import com.moonsolid.sc.handler.LessonHandler;
import com.moonsolid.sc.handler.MemberHandler;
import com.moonsolid.sc.util.Prompt;

public class App {

  static Scanner keyboard = new Scanner(System.in);
  
  public static void main(String[] args) {
    
    Prompt prompt = new Prompt(keyboard);
    
    BoardHandler boardHandler = new BoardHandler(prompt);
    LessonHandler lessonHandler = new LessonHandler(prompt);
    MemberHandler memberHandler = new MemberHandler(prompt);

    String command;
    
    do {
      System.out.print("\n명령> ");
      command = keyboard.nextLine();
      
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
        default:
          if (!command.equalsIgnoreCase("quit")) {
            System.out.println("실행할 수 없는 명령입니다.");
          }
      }
      
    } while (!command.equalsIgnoreCase("quit"));
    
    System.out.println("안녕!");
    
    keyboard.close();
  }
}






