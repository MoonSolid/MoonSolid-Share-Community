package handler;

import java.sql.Date;
import java.util.Scanner;
import domain.Board;

public class BoardHandler2 {



  static final int BOARD_SIZE = 100;
  static Board[] boards = new Board[BOARD_SIZE];
  static int boardCount = 0;
  public static Scanner keyboard;






  public static void addBoard() {
    Board board = new Board();

    System.out.print("��ȣ? ");
    board.no = keyboard.nextInt();
    keyboard.nextLine();

    System.out.print("����? ");
    board.title = keyboard.nextLine();

    board.date = new Date(System.currentTimeMillis());
    board.viewCount = 0;

    boards[boardCount++] = board;
    System.out.println("�����Ͽ����ϴ�."); 
  }

  

  public static void detailBoard() {
    System.out.print("�Խù� ��ȣ? ");
    int no = keyboard.nextInt();
    keyboard.nextLine();
    
    Board board = null;
    for (int i = 0; i < boardCount; i++) {   
      if (boards[i].no == no) {
        board = boards[i];
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
  
  public static void listBoard() {

    for (int i = 0; i < boardCount; i++) {
      Board b = boards[i];
      System.out.printf("%d, %s , %s,%d\n",
          b.no, b.title, b.date, b.viewCount);
    }
  }
  
}
