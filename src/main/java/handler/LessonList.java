package handler;

import java.util.Arrays;
import domain.Lesson;

public class LessonList {
  
  static final int DEFAULT_CAPACITY = 100;
  
  Lesson[] list;
  int size = 0;
  
  public LessonList() {
    this.list = new Lesson[DEFAULT_CAPACITY];
  }
  
  public LessonList(int capacity) {
    if (capacity < DEFAULT_CAPACITY || capacity > 10000)
      this.list = new Lesson[DEFAULT_CAPACITY];
    else 
      this.list = new Lesson[capacity];
  }

  public Lesson[] toArray() {
   
    return Arrays.copyOf(this.list, this.size);
  }

  public void add(Lesson lesson) {
    if (this.size == this.list.length) {
      
      int oldCapacity = this.list.length;
      int newCapacity = oldCapacity + (oldCapacity >> 1);
      this.list = Arrays.copyOf(this.list, newCapacity);
    }
    this.list[this.size++] = lesson;
  }
  
  public Lesson get(int no) {
    for (int i = 0; i < this.size; i++) {
      if (this.list[i].getNo() == no) {
        return this.list[i];
      }
    }
    return null;
  }
}










