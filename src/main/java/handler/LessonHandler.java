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

    System.out.print("��ȣ? ");
    lesson.setNo(input.nextInt());
    input.nextLine();

    System.out.print("������? ");
    lesson.setTitle(input.nextLine());

    System.out.println("����? ");
    lesson.setDescription( input.nextLine());

    System.out.println("������? ");
    lesson.setStartDate(Date.valueOf(input.next()));

    System.out.println("������? ");
    lesson.setEndDate(Date.valueOf(input.next()));

    System.out.println("�Ѽ����ð�? " );
    lesson.setTotalHours(input.nextInt());

    System.out.println("�ϼ����ð�? ");
    lesson.setDayHours(input.nextInt());
    input.nextLine();

    this.lessons[this.lessonCount++] = lesson;
    System.out.println("�����Ͽ����ϴ�.");
  }

  public void listLesson() {


    for (int i = 0; i < this.lessonCount; i++) {
      Lesson l = this.lessons[i];
      System.out.printf("%d,%s,%s~%s,%d\n",
          l.getNo(), l.getTitle(), l.getStartDate(), l.getEndDate(), l.getTotalHours());

    }
  }
}
