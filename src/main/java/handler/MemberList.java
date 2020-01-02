package handler;

import java.util.Arrays;
import domain.Member;

public class MemberList {
  
  static final int DEFAULT_CAPACITY = 100;
  
  Member[] list;
  int size = 0;
  
  public MemberList() {
    this.list = new Member[DEFAULT_CAPACITY];
  }
  
  public MemberList(int capacity) {
    if (capacity < DEFAULT_CAPACITY || capacity > 10000)
      this.list = new Member[DEFAULT_CAPACITY];
    else 
      this.list = new Member[capacity];
  }

  public Member[] toArray() {
   
    return Arrays.copyOf(this.list, this.size);
  }

  public void add(Member member) {
    if (this.size == this.list.length) {
      // ���� �迭�� �Խñ� ��ü�� �� á����, �迭�� �ø���.
      int oldCapacity = this.list.length;
      int newCapacity = oldCapacity + (oldCapacity >> 1);
      this.list = Arrays.copyOf(this.list, newCapacity);
    }
    this.list[this.size++] = member;
  }
  
  public Member get(int no) {
    for (int i = 0; i < this.size; i++) {
      if (this.list[i].getNo() == no) {
        return this.list[i];
      }
    }
    return null;
  }
}










