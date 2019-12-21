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
    
    final int SIZE = 100;                  //상수로 사이즈 설정
    Lesson[] lessons = new Lesson[SIZE];   //Lesson 의 정보를 저장할
                                           //레퍼런스배열 생성
    
    
    int count = 0;                         //카운트 설정

    for (int i = 0; i < SIZE; i++) {       //0부터 배열의 SIZE까지 반복
      count++;                             //입력받을때마다 count를 더해주고
                                           //출력에서 카운트만큼 출력하기
      Lesson lesson = new Lesson();        //레퍼런스를 저장할 lesson이라는 
                                           //인스턴스 생성
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

      lessons[i] = lesson;

      System.out.print("계속 입력하시겠습니까? (y/n) ");
      String response = keyboard.nextLine();
      if(!response.equalsIgnoreCase("y")) 
        break;
    }
    System.out.println();

    for (int i = 0; i < count; i++) {
      Lesson lesson = lessons[i];
      System.out.printf("%d, %s, %s~%s, %d\n",
          lesson.no, lesson.title,
          lesson.startDate, lesson.startDate ,lesson.endDate,
          lesson.totalHours);


    }

    keyboard.close();
  }

}


















