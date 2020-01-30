package com.moonsolid.sc.handler;

import java.util.Iterator;
import java.util.List;
import com.moonsolid.sc.domain.Lesson;

public class LessonListCommand implements Command {
  
  List<Lesson> lessonList;
  
  
  public LessonListCommand(List<Lesson> list) {
    this.lessonList = list;
  }
  

  @Override
  public void execute() {
   
    Iterator<Lesson> iterator = lessonList.iterator();
    
    while (iterator.hasNext()) {
      Lesson l = iterator.next();
      System.out.printf("%d, %s, %s ~ %s, %d\n",
          l.getNo(), l.getTitle(), 
          l.getStartDate(), l.getEndDate(), l.getTotalHours());
    }
  }
  
}




