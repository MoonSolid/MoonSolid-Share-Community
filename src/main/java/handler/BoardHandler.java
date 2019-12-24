package handler;

import java.sql.Date;
import java.util.Scanner;
import domain.Board;

public class BoardHandler {



   Board[] boards = new Board[BOARD_SIZE];
   int boardCount = 0;

  static final int BOARD_SIZE = 100;
  public static Scanner keyboard;





  public static void addBoard(BoardHandler boardhandler) {
    Board board = new Board();

    System.out.print("번호? ");
    board.no = keyboard.nextInt();
    keyboard.nextLine();

    System.out.print("내용? ");
    board.title = keyboard.nextLine();

    board.date = new Date(System.currentTimeMillis());
    board.viewCount = 0;

    boardhandler.boards[boardhandler.boardCount++] = board;
    System.out.println("저장하였습니다."); 
  }

  

  public static void detailBoard(BoardHandler boardhandler) {
    System.out.print("게시물 번호? ");
    int no = keyboard.nextInt();
    keyboard.nextLine();
    
    Board board = null;
    for (int i = 0; i < boardhandler.boardCount; i++) {   
      if (boardhandler.boards[i].no == no) {
        board = boardhandler.boards[i];
        break;
      }
    }
    if (board == null) {
      System.out.println("게시물 번호가 유효하지 않습니다. ");
      return;
    }
    System.out.printf("번호: %d\n", board.no);
    System.out.printf("제목: %s\n", board.title);
    System.out.printf("등록일: %s\n", board.date);
    System.out.printf("조회수: %d\n", board.viewCount);
  }
  
  public static void listBoard(BoardHandler boardhandler) {

    for (int i = 0; i < boardhandler.boardCount; i++) {
      Board b = boardhandler.boards[i];
      System.out.printf("%d, %s , %s,%d\n",
          b.no, b.title, b.date, b.viewCount);
    }
  }
  
}
