package handler;

import java.util.Arrays;
import domain.Board;

public class BoardList {
  
  static final int DEFAULT_CAPACITY = 3;
  
  Board[] list;
  int size = 0;
  
  public BoardList() {
    this.list = new Board[DEFAULT_CAPACITY];
  }
  
  public BoardList(int capacity) {
    if (capacity < DEFAULT_CAPACITY || capacity > 10000)
      this.list = new Board[DEFAULT_CAPACITY];
    else 
      this.list = new Board[capacity];
  }

  public Board[] toArray() {
   
    return Arrays.copyOf(this.list, this.size);
  }

  public void add(Board board) {
    if (this.size == this.list.length) {
     
      int oldCapacity = this.list.length;
      int newCapacity = oldCapacity + (oldCapacity >> 1);
  
      this.list = Arrays.copyOf(this.list, newCapacity);
      System.out.printf("�� �迭�� %d �� �����Ͽ���!", newCapacity);
    }
    this.list[this.size++] = board;
  }
  
  public Board get(int no) {
    for (int i = 0; i < this.size; i++) {
      if (this.list[i].getNo() == no) {
        return this.list[i];
      }
    }
    return null;
  }
}










