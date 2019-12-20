package com.moonsolid.sc;

import java.sql.Date;
import java.util.Scanner;

public class App3 {
	
	static final int SIZE = 5734;
	static Board[] board = new Board[SIZE];
	static int count = 0;
	
	public static void main(String[] args) {

		inputBoards();
		
        System.out.println();		
		
		printBoards();
		
		
	}
	static void InputBoard() {
		Scanner keyboard = new Scanner(System.in);
		String response;
		
		for (int i = 0; i < size; i++) {
			Board b = new Board();
			
			System.out.print("번호? ");
			b.no = keyboard.nextInt();
			keyboard.nextLine();
			
			System.out.print("내용? ");
			b.title = keyboard.nextLine();
			
			b.date = new Date(System.currentTimeMillis());
			b.viewCount = 0;
			
			boards[i] = b;
			
			count++;
			
			System.out.println();
			
			System.out.print("계속 입력하시겠습니까? (y/n)");
			response = keyboard.nextLine();
			if (!response.equalsIgnoreCase("y")) {
				break;
			}
		}
		keyboard.close();
	}
}	










