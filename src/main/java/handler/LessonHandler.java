package handler;

import java.sql.Date;
import java.util.Scanner;
import domain.Lesson;

public class LessonHandler {
  
  LessonList lessonList;
  
  public Scanner input;
  
  public LessonHandler(Scanner input) {
    this.input = input;
    this.lessonList = new LessonList();
  }
  
  public void addLesson() {
    Lesson lesson = new Lesson();
    
    System.out.print("��ȣ? ");
    lesson.setNo(input.nextInt());

    input.nextLine(); 

    System.out.print("������? ");
    lesson.setTitle(input.nextLine());

    System.out.print("����? ");
    lesson.setDescription(input.nextLine());

    System.out.print("������? ");
    lesson.setStartDate(Date.valueOf(input.next()));

    System.out.print("������? ");
    lesson.setEndDate(Date.valueOf(input.next()));

    System.out.print("�Ѽ����ð�? ");
    lesson.setTotalHours(input.nextInt());

    System.out.print("�ϼ����ð�? ");
    lesson.setDayHours(input.nextInt());
    input.nextLine(); 
    
    lessonList.add(lesson);
    
    System.out.println("�����Ͽ����ϴ�.");
  }
  
  public void listLesson() {
    Lesson[] lessons = this.lessonList.toArray();
    for (Lesson l : lessons) {
      System.out.printf("%d, %s, %s ~ %s, %d\n",
          l.getNo(), l.getTitle(), 
          l.getStartDate(), l.getEndDate(), l.getTotalHours());
    }
  }
  
}
