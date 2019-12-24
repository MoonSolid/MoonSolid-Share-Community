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
   
    
    LessonHandler ���Լ��� = new LessonHandler();
    
    MemberHandler ȸ�� = new MemberHandler();
    
    BoardHandler �Խ���1 = new BoardHandler();
    BoardHandler �Խ���2 = new BoardHandler();
    BoardHandler �Խ���3 = new BoardHandler();

    String command;

    do {
      System.out.print("���> ");
      command = keyboard.nextLine();

      switch (command) {
        case "/lesson/add":

          LessonHandler.addLesson(���Լ���);

          break;
        case "/lesson/list":

          LessonHandler.listLesson(���Լ���);

          break;

        case "/member/add":

          MemberHandler.addMember(ȸ��);

          break;

        case "/member/list":

          MemberHandler.listMember(ȸ��);


          break;

        case "/board/add":

          BoardHandler.addBoard(�Խ���1);

          break;
        case "/board/list":

          BoardHandler.listBoard(�Խ���1);

          break;
          
        case "/board/detail":

          BoardHandler.detailBoard(�Խ���1);

          break;
          
        case "/board2/add":

          BoardHandler.addBoard(�Խ���2);

          break;
        case "/board2/list":

          BoardHandler.listBoard(�Խ���2);

          break;
          
        case "/board2/detail":

          BoardHandler.detailBoard(�Խ���2);

          break;
          
        case "/board3/add":

          BoardHandler.addBoard(�Խ���3);

          break;
        case "/board3/list":

          BoardHandler.listBoard(�Խ���3);

          break;
          
        case "/board3/detail":

          BoardHandler.detailBoard(�Խ���3);

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



















