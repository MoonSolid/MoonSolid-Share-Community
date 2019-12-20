package com.moonsolid.sc;

import java.sql.Date;
import java.util.Scanner;

public class App3 {

	static final int SIZE = 5734;
	static Board[] boards = new Board[SIZE];
	static int count = 0;

	public static void main(String[] args) {

		inputBoards();
		
		System.out.println();		
		
		printBoards();

	}

	static void inputBoards() {
		Scanner keyboard = new Scanner(System.in);
		String response;

		for (int i = 0; i < SIZE; i++) {
			Board b = new Board();

			System.out.print("��ȣ? ");
			b.no = keyboard.nextInt();
			keyboard.nextLine();

			System.out.print("����? ");
			b.title = keyboard.nextLine();

			b.date = new Date(System.currentTimeMillis());
			b.viewCount = 0;

			boards[i] = b;

			count++;

			System.out.println();

			System.out.print("��� �Է��Ͻðڽ��ϱ�? (y/n) ");
			response = keyboard.nextLine();
			if (!response.equalsIgnoreCase("y")) {
				break;
			}
		}
		keyboard.close();
	}

	static void printBoards() {
		for (int i = 0; i < count; i++) {
			Board b = boards[i];
			System.out.printf("%d, %s, %s, %d\n",
					b.no, b.title, b.date, b.viewCount);
		}
	}
}	










