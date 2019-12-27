package com.moonsolid.sc;

import java.util.Scanner;
import handler.BoardHandler;
import handler.LessonHandler;
import handler.MemberHandler;



public class App {
  static Scanner keyboard = new Scanner(System.in);

  public static void main(String[] args) {   

    LessonHandler 정규수업 = new LessonHandler(keyboard);

    MemberHandler 회원 = new MemberHandler(keyboard);

    BoardHandler 게시판1 = new BoardHandler(keyboard);
    BoardHandler 게시판2 = new BoardHandler(keyboard);
    BoardHandler 게시판3 = new BoardHandler(keyboard);

    String command;

    do {
      System.out.print("명령> ");
      command = keyboard.nextLine();

      switch (command) {
        case "/lesson/add":

          정규수업.addLesson();

          break;
        case "/lesson/list":

          정규수업.listLesson();

          break;

        case "/member/add":

          회원.addMember();

          break;

        case "/member/list":

          회원.listMember();


          break;

        case "/board/add":

          게시판1.addBoard();

          break;
        case "/board/list":

          게시판1.listBoard();

          break;

        case "/board/detail":

          게시판1.detailBoard();

          break;

        case "/board2/add":

          게시판2.addBoard();

          break;
        case "/board2/list":

          게시판2.listBoard();

          break;

        case "/board2/detail":

          게시판2.detailBoard();

          break;

        case "/board3/add":

          게시판3.addBoard();

          break;
        case "/board3/list":

          게시판3.listBoard();

          break;

        case "/board3/detail":

          게시판3.detailBoard();

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



















