package com.moonsolid.sc;

import java.sql.Date;
import java.util.Scanner;

public class App3 {
  public static void main (String[] args) {

    Scanner keyboard = new Scanner(System.in);

    class Board {
      int no;
      String title;
      Date date;
      int viewCount;
    }

    final int SIZE = 100;

    Board[] boards = new Board[SIZE];

    String response;

    int count = 0;

    for (int i = 0; i< 100; i++) {
      Board board = new Board();

      System.out.print("��ȣ? ");
      board.no = keyboard.nextInt();
      keyboard.nextLine();

      System.out.print("����? ");
      board.title = keyboard.nextLine();

      board.date = new Date(System.currentTimeMillis());
      board.viewCount = 0;

      boards[i] = board;

      count++;

      System.out.println();
      
      System.out.print("��� �Է��Ͻðڽ��ϱ�? (Y/N) ");
      response = keyboard.nextLine();
      if (!response.equalsIgnoreCase("y")) {
        break;
      }
    }
     keyboard.close();
     
     System.out.println();
     
     for (int i = 0; i < count; i++) {
       Board board = boards[i];
       System.out.printf("%d,%s,%s,%d\n",
           board.no,board.title,board.date,board.viewCount);
     }
  }
}	










