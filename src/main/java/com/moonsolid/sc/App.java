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
    
    final int SIZE = 100;                  //����� ������ ����
    Lesson[] lessons = new Lesson[SIZE];   //Lesson �� ������ ������
                                           //���۷����迭 ����
    
    
    int count = 0;                         //ī��Ʈ ����

    for (int i = 0; i < SIZE; i++) {       //0���� �迭�� SIZE���� �ݺ�
      count++;                             //�Է¹��������� count�� �����ְ�
                                           //��¿��� ī��Ʈ��ŭ ����ϱ�
      Lesson lesson = new Lesson();        //���۷����� ������ lesson�̶�� 
                                           //�ν��Ͻ� ����
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

      lessons[i] = lesson;

      System.out.print("��� �Է��Ͻðڽ��ϱ�? (y/n) ");
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


















