package handler;

import java.sql.Date;
import java.util.Scanner;
import domain.Board;

public class BoardHandler {



  Board[] boards;
  int boardCount = 0;

  static final int BOARD_SIZE = 100;


  Scanner input;

  
   public BoardHandler (Scanner input) {
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


  public void addBoard( ) {
    Board board = new Board();

    System.out.print("��ȣ? ");
    board.no = input.nextInt();
    input.nextLine();

    System.out.print("����? ");
    board.title = input.nextLine();

    board.date = new Date(System.currentTimeMillis());
    board.viewCount = 0;

    this.boards[this.boardCount++] = board;
    System.out.println("�����Ͽ����ϴ�."); 
  }



  public void detailBoard( ) {
    System.out.print("�Խù� ��ȣ? ");
    int no = input.nextInt();
    input.nextLine();

    Board board = null;
    for (int i = 0; i < this.boardCount; i++) {   
      if (this.boards[i].no == no) {
        board = this.boards[i];
        break;
      }
    }
    if (board == null) {
      System.out.println("�Խù� ��ȣ�� ��ȿ���� �ʽ��ϴ�. ");
      return;
    }
    System.out.printf("��ȣ: %d\n", board.no);
    System.out.printf("����: %s\n", board.title);
    System.out.printf("�����: %s\n", board.date);
    System.out.printf("��ȸ��: %d\n", board.viewCount);
  }

  public  void listBoard( ) {

    for (int i = 0; i < this.boardCount; i++) {
      Board b = this.boards[i];
      System.out.printf("%d, %s , %s,%d\n",
          b.no, b.title, b.date, b.viewCount);
    }
  }

}
