package handler;

import java.sql.Date;
import java.util.Scanner;
import domain.Lesson;

public class LessonHandler {

  

   Lesson[] lessons = new Lesson[LESSON_SIZE];
   int lessonCount = 0;

  
  static final int LESSON_SIZE = 100;
  public static Scanner keyboard;
  
  

  public static void addLesson(LessonHandler lessonHandler) {

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

    lessonHandler.lessons[lessonHandler.lessonCount++] = lesson;
    System.out.println("저장하였습니다.");
  }

  public static void listLesson(LessonHandler lessonHandler) {


    for (int i = 0; i < lessonHandler.lessonCount; i++) {
      Lesson l = lessonHandler.lessons[i];
      System.out.printf("%d,%s,%s~%s,%d\n",
          l.no, l.title, l.startDate, l.endDate, l.totalHours );

    }
  }
}
