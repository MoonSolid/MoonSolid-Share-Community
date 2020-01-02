package handler;

import java.sql.Date;
import java.util.Scanner;
import domain.Board;

public class BoardHandler {
  
  ArrayList boardList;
  
  Scanner input;
  
  
  public BoardHandler(Scanner input) {
    this.input = input;
    boardList = new ArrayList();
  }
  
  public BoardHandler(Scanner input, int capacity) {
    this.input = input;
    boardList = new ArrayList(capacity);
  }
  
  public void listBoard() {
    Object[] arr = this.boardList.toArray();
    for (Object obj : arr) {
      Board b = (Board) obj;
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
    
    boardList.add(board);
    
    System.out.println("�����Ͽ����ϴ�.");
  }
  
  public void detailBoard() {
    System.out.print("�Խù� �ε���? ");
    int index = input.nextInt();
    input.nextLine(); // ���� ���� ���� ���� ����
    
    Board board = (Board) this.boardList.get(index);
    
    if (board == null) {
      System.out.println("�Խù� �ε����� ��ȿ���� �ʽ��ϴ�.");
      return;
    }
    
    System.out.printf("��ȣ: %d\n", board.getNo());
    System.out.printf("����: %s\n", board.getTitle());
    System.out.printf("�����: %s\n", board.getDate());
    System.out.printf("��ȸ��: %d\n", board.getViewCount());
  }

}









