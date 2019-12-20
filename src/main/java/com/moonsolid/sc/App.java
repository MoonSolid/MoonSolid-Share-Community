package com.moonsolid.sc;

import java.sql.Date;
import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		class Lesson {
			int no;
			String title;
			String description;
			Date startDate;
			Date endDate;
			int totalHours;
			int dayHours;
		}
		
		final int SIZE = 100;
		
		Lesson[] lessons = new Lesson[SIZE];
		
		int count = 0;
		
		for (int i = 0; i < SIZE; i++) {
			count ++;
			
			Lesson lesson = new Lesson();
			
			System.out.print("��ȣ? ");
			lesson.no = keyboard.nextInt();
			keyboard.nextLine();
			
			System.out.print("������? ");
			lesson.title = keyboard.nextLine();
			
			System.out.print("����? ");
			lesson.description = keyboard.nextLine();
			
			System.out.print("������? ");
			lesson.startDate = Date.valueOf(keyboard.next()); 
			
			System.out.print("������? ");
			lesson.endDate = Date.valueOf(keyboard.next());
			
			System.out.print("�Ѽ����ð�? ");
			lesson.totalHours = keyboard.nextInt();
			keyboard.nextLine();
			
			System.out.print("�ϼ����ð�? ");
			lesson.dayHours = keyboard.nextInt();
			keyboard.nextLine();
			
			lessons[i] = lesson;
			
			
			
		}
		
	}
}

















