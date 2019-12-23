package com.moonsolid.sc;

import java.sql.Date;
import java.util.Scanner;



public class App {

  public static void main(String[] args) {

    Scanner keyboard = new Scanner(System.in);

    class Lesson {        //���赵 �ۼ�
      int no;
      String title;
      String description;
      Date startDate;
      Date endDate;
      int totalHours;
      int dayHours;
    }

    final int LESSON_SIZE = 100;
    Lesson[] lessons = new Lesson[LESSON_SIZE];
    int lessonCount = 0;


    class Member {
      int no;
      String name;
      String email;
      String password;
      String photo;
      String tel;
      Date registerDate;
    }

    final int MEMBER_SIZE = 100;
    Member[] members = new Member[MEMBER_SIZE];
    int memberCount = 0;

    class Board {
      int no;
      String title;
      Date date;
      int viewCount;
    }

    final int BOARD_SIZE = 100;
    Board[] boards = new Board[BOARD_SIZE];
    int boardCount = 0;


    String command;

    do {
      System.out.print("���> ");
      command = keyboard.nextLine();

      switch (command) {
        case "/lesson/add":
          Lesson lesson = new Lesson();


          System.out.print("��ȣ? ");
          lesson.no = keyboard.nextInt();
          keyboard.nextLine();

          System.out.print("������? ");
          lesson.title = keyboard.nextLine();

          System.out.println("����? ");
          lesson.description = keyboard.nextLine();

          System.out.println("������? ");
          lesson.startDate = Date.valueOf(keyboard.next());

          System.out.println("������? ");
          lesson.endDate = Date.valueOf(keyboard.next());

          System.out.println("�Ѽ����ð�? " );
          lesson.totalHours = keyboard.nextInt();

          System.out.println("�ϼ����ð�? ");
          lesson.dayHours = keyboard.nextInt();
          keyboard.nextLine();

          lessons[lessonCount++] = lesson;
          System.out.println("�����Ͽ����ϴ�.");


          break;
        case "/lesson/list":

          for (int i = 0; i < lessonCount; i++) {
            Lesson l = lessons[i];
            System.out.printf("%d,%s,%s~%,%d\n",
                l.no, l.title, l.startDate, l.endDate, l.totalHours );
          }
          break;

        case "/member/add":

          Member member = new Member();

          System.out.print("��ȣ? ");
          member.no = keyboard.nextInt();    //�迭�� i��°�� �Է°�����
          keyboard.nextLine();

          System.out.print("�̸�? ");
          member.name = keyboard.nextLine();

          System.out.print("�̸���? ");
          member.email = keyboard.nextLine();

          System.out.print("��ȣ? ");
          member.password = keyboard.nextLine();

          System.out.print("����? ");
          member.photo = keyboard.nextLine();

          System.out.print("��ȭ? ");
          member.tel = keyboard.nextLine();

          member.registerDate = new Date(System.currentTimeMillis()); //�ð�����

          members[memberCount++] = member;
          System.out.println("�����Ͽ����ϴ�.");

          break;

        case "/member/list":

          for (int i = 0; i < memberCount; i++) {
            Member m = members[i];
            System.out.printf("%d,%s,%s,%s,%s\n",
                m.no, m.name, m.email, m.tel, m.registerDate );
          }

          break;

        case "/board/add":

          Board board = new Board();

          System.out.print("��ȣ? ");
          board.no = keyboard.nextInt();
          keyboard.nextLine();

          System.out.print("����? ");
          board.title = keyboard.nextLine();

          board.date = new Date(System.currentTimeMillis());
          board.viewCount = 0;

          boards[boardCount++] = board;
          System.out.println("�����Ͽ����ϴ�."); 
          break;
        case "/board/list":

          for (int i = 0; i < boardCount; i++) {
            Board b = boards[i];
            System.out.printf("%d, %s , %s,%d\n",
                b.no, b.title, b.date, b.viewCount);
          }

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





















