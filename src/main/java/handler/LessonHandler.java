package handler;

import java.sql.Date;
import java.util.Scanner;
import domain.Lesson;

public class LessonHandler {

  

   Lesson[] lessons;
   int lessonCount = 0;

  
  static final int LESSON_SIZE = 100;
  
  
  public Scanner input;
  
  public LessonHandler(Scanner input) {
    this.input = input;
    this.lessons = new Lesson[LESSON_SIZE];
  }

  public void addLesson() {

    Lesson lesson = new Lesson();

    System.out.print("번호? ");
    lesson.no = input.nextInt();
    input.nextLine();

    System.out.print("수업명? ");
    lesson.title = input.nextLine();

    System.out.println("설명? ");
    lesson.description = input.nextLine();

    System.out.println("시작일? ");
    lesson.startDate = Date.valueOf(input.next());

    System.out.println("종료일? ");
    lesson.endDate = Date.valueOf(input.next());

    System.out.println("총수업시간? " );
    lesson.totalHours = input.nextInt();

    System.out.println("일수업시간? ");
    lesson.dayHours = input.nextInt();
    input.nextLine();

    this.lessons[this.lessonCount++] = lesson;
    System.out.println("저장하였습니다.");
  }

  public void listLesson() {


    for (int i = 0; i < this.lessonCount; i++) {
      Lesson l = this.lessons[i];
      System.out.printf("%d,%s,%s~%s,%d\n",
          l.no, l.title, l.startDate, l.endDate, l.totalHours );

    }
  }
}
