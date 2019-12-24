package handler;

import java.sql.Date;
import java.util.Scanner;
import domain.Lesson;

public class LessonHandler {

  

  static final int LESSON_SIZE = 100;
  static Lesson[] lessons = new Lesson[LESSON_SIZE];
  static int lessonCount = 0;
  
  public static Scanner keyboard;

  public static void addLesson() {

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
  }

  public static void listLesson() {


    for (int i = 0; i < lessonCount; i++) {
      Lesson l = lessons[i];
      System.out.printf("%d,%s,%s~%s,%d\n",
          l.no, l.title, l.startDate, l.endDate, l.totalHours );

    }
  }
}
