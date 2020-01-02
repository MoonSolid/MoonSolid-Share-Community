package handler;

import java.sql.Date;
import java.util.Scanner;
import domain.Board;

public class BoardHandler {
  
 
  Board[] boards;
  int boardCount = 0;
  
 
  Scanner input;
  
  
  static final int BOARD_SIZE = 100;
  
  
  public BoardHandler(Scanner input) {
   
    this.input = input;
    this.boards = new Board[BOARD_SIZE];
  }
  
  public BoardHandler(Scanner input, int capacity) {
    this.input = input;
    if (capacity < BOARD_SIZE || capacity > 10000)
      this.boards = new Board[BOARD_SIZE];
    else 
      this.boards = new Board[capacity];
  }
  
  
  public void listBoard() {
    for (int i = 0; i < this.boardCount; i++) {
      Board b = this.boards[i];
      System.out.printf("%d, %s, %s, %d\n", 
          b.getNo(), b.getTitle(), b.getDate(), b.getViewCount());
    }
  }

  public void addBoard() {
    Board board = new Board();
    
    System.out.print("��ȣ? ");
    board.setNo(input.nextInt());
    input.nextLine(); // �ٹٲ� ��ȣ ���ſ�

    System.out.print("����? ");
    board.setTitle(input.nextLine());

    board.setDate(new Date(System.currentTimeMillis()));
    board.setViewCount(0);
    
    this.boards[this.boardCount++] = board;
    System.out.println("�����Ͽ����ϴ�.");
  }
  
  public void detailBoard() {
    System.out.print("�Խù� ��ȣ? ");
    int no = input.nextInt();
    input.nextLine(); 
    
    Board board = null;
    for (int i = 0; i < this.boardCount; i++) {
      if (this.boards[i].getNo() == no) {
        board = this.boards[i];
        break;
      }
    }
    
    if (board == null) {
      System.out.println("�Խù� ��ȣ�� ��ȿ���� �ʽ��ϴ�.");
      return;
    }
    
    System.out.printf("��ȣ: %d\n", board.getNo());
    System.out.printf("����: %s\n", board.getTitle());
    System.out.printf("�����: %s\n", board.getDate());
    System.out.printf("��ȸ��: %d\n", board.getViewCount());
  }

}









