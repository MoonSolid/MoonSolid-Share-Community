package com.moonsolid.sc;

import java.util.Scanner;
import handler.BoardHandler;
import handler.LessonHandler;
import handler.MemberHandler;



public class App {
  static Scanner keyboard = new Scanner(System.in);

  public static void main(String[] args) {   

    LessonHandler ���Լ��� = new LessonHandler(keyboard);

    MemberHandler ȸ�� = new MemberHandler(keyboard);

    BoardHandler �Խ���1 = new BoardHandler(keyboard);
    BoardHandler �Խ���2 = new BoardHandler(keyboard);
    BoardHandler �Խ���3 = new BoardHandler(keyboard);

    String command;

    do {
      System.out.print("���> ");
      command = keyboard.nextLine();

      switch (command) {
        case "/lesson/add":

          ���Լ���.addLesson();

          break;
        case "/lesson/list":

          ���Լ���.listLesson();

          break;

        case "/member/add":

          ȸ��.addMember();

          break;

        case "/member/list":

          ȸ��.listMember();


          break;

        case "/board/add":

          �Խ���1.addBoard();

          break;
        case "/board/list":

          �Խ���1.listBoard();

          break;

        case "/board/detail":

          �Խ���1.detailBoard();

          break;

        case "/board2/add":

          �Խ���2.addBoard();

          break;
        case "/board2/list":

          �Խ���2.listBoard();

          break;

        case "/board2/detail":

          �Խ���2.detailBoard();

          break;

        case "/board3/add":

          �Խ���3.addBoard();

          break;
        case "/board3/list":

          �Խ���3.listBoard();

          break;

        case "/board3/detail":

          �Խ���3.detailBoard();

          break;


        default:
          if (!command.equalsIgnoreCase("quit")) {
            System.out.println("������ �� ���� ����Դϴ�.");
          }

      }

    } while (!command.equalsIgnoreCase("quit"));

    System.out.println("�ȳ�!");

    keyboard.close();

  }














}



















