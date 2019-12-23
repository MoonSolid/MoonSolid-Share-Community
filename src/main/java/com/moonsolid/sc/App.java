package com.moonsolid.sc;

import java.sql.Date;
import java.util.Scanner;



public class App {

  public static void main(String[] args) {

    Scanner keyboard = new Scanner(System.in);

    class Lesson {        //설계도 작성
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
      System.out.print("명령> ");
      command = keyboard.nextLine();

      switch (command) {
        case "/lesson/add":
          Lesson lesson = new Lesson();


          System.out.print("번호? ");
          lesson.no = keyboard.nextInt();
          keyboard.nextLine();

          System.out.print("수업명? ");
          lesson.title = keyboard.nextLine();

          System.out.println("설명? ");
          lesson.description = keyboard.nextLine();

          System.out.println("시작일? ");
          lesson.startDate = Date.valueOf(keyboard.next());

          System.out.println("종료일? ");
          lesson.endDate = Date.valueOf(keyboard.next());

          System.out.println("총수업시간? " );
          lesson.totalHours = keyboard.nextInt();

          System.out.println("일수업시간? ");
          lesson.dayHours = keyboard.nextInt();
          keyboard.nextLine();

          lessons[lessonCount++] = lesson;
          System.out.println("저장하였습니다.");


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

          System.out.print("번호? ");
          member.no = keyboard.nextInt();    //배열의 i번째에 입력값저장
          keyboard.nextLine();

          System.out.print("이름? ");
          member.name = keyboard.nextLine();

          System.out.print("이메일? ");
          member.email = keyboard.nextLine();

          System.out.print("암호? ");
          member.password = keyboard.nextLine();

          System.out.print("사진? ");
          member.photo = keyboard.nextLine();

          System.out.print("전화? ");
          member.tel = keyboard.nextLine();

          member.registerDate = new Date(System.currentTimeMillis()); //시간변수

          members[memberCount++] = member;
          System.out.println("저장하였습니다.");

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

          System.out.print("번호? ");
          board.no = keyboard.nextInt();
          keyboard.nextLine();

          System.out.print("내용? ");
          board.title = keyboard.nextLine();

          board.date = new Date(System.currentTimeMillis());
          board.viewCount = 0;

          boards[boardCount++] = board;
          System.out.println("저장하였습니다."); 
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
            System.out.println("실행할 수 없는 명령입니다.");
          }

      }

    } while (!command.equalsIgnoreCase("quit"));

    System.out.println("안녕!");

    keyboard.close();
  }

}





















