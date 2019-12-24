package com.moonsolid.sc;

import java.util.Scanner;
import handler.BoardHandler;
import handler.LessonHandler;
import handler.MemberHandler;



public class App {
  static Scanner keyboard = new Scanner(System.in);

  public static void main(String[] args) {


    LessonHandler.keyboard = keyboard;
    MemberHandler.keyboard = keyboard;
    BoardHandler.keyboard = keyboard;
   
    
    LessonHandler 정규수업 = new LessonHandler();
    
    MemberHandler 회원 = new MemberHandler();
    
    BoardHandler 게시판1 = new BoardHandler();
    BoardHandler 게시판2 = new BoardHandler();
    BoardHandler 게시판3 = new BoardHandler();

    String command;

    do {
      System.out.print("명령> ");
      command = keyboard.nextLine();

      switch (command) {
        case "/lesson/add":

          LessonHandler.addLesson(정규수업);

          break;
        case "/lesson/list":

          LessonHandler.listLesson(정규수업);

          break;

        case "/member/add":

          MemberHandler.addMember(회원);

          break;

        case "/member/list":

          MemberHandler.listMember(회원);


          break;

        case "/board/add":

          BoardHandler.addBoard(게시판1);

          break;
        case "/board/list":

          BoardHandler.listBoard(게시판1);

          break;
          
        case "/board/detail":

          BoardHandler.detailBoard(게시판1);

          break;
          
        case "/board2/add":

          BoardHandler.addBoard(게시판2);

          break;
        case "/board2/list":

          BoardHandler.listBoard(게시판2);

          break;
          
        case "/board2/detail":

          BoardHandler.detailBoard(게시판2);

          break;
          
        case "/board3/add":

          BoardHandler.addBoard(게시판3);

          break;
        case "/board3/list":

          BoardHandler.listBoard(게시판3);

          break;
          
        case "/board3/detail":

          BoardHandler.detailBoard(게시판3);

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



















