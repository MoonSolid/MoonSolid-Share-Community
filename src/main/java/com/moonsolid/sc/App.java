package com.moonsolid.sc;

import java.sql.Date;
import java.util.Scanner;



public class App {
  static Scanner keyboard = new Scanner(System.in);

  public static void main(String[] args) {


    LessonHandler.keyboard = keyboard;
    MemberHandler.keyboard = keyboard;
    BoardHandler.keyboard = keyboard;



    String command;

    do {
      System.out.print("���> ");
      command = keyboard.nextLine();

      switch (command) {
        case "/lesson/add":

          LessonHandler.addLesson();

          break;
        case "/lesson/list":

          LessonHandler.listLesson();

          break;

        case "/member/add":

          MemberHandler.addMember();

          break;

        case "/member/list":

          MemberHandler.listMember();


          break;

        case "/board/add":

          BoardHandler.addBoard();

          break;
        case "/board/list":

          BoardHandler.listBoard();

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



















