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
			
			System.out.print("번호? ");
			lesson.no = keyboard.nextInt();
			keyboard.nextLine();
			
			System.out.print("수업명? ");
			lesson.title = keyboard.nextLine();
			
			System.out.print("설명? ");
			lesson.description = keyboard.nextLine();
			
			System.out.print("시작일? ");
			lesson.startDate = Date.valueOf(keyboard.next()); 
			
			System.out.print("종료일? ");
			lesson.endDate = Date.valueOf(keyboard.next());
			
			System.out.print("총수업시간? ");
			lesson.totalHours = keyboard.nextInt();
			keyboard.nextLine();
			
			System.out.print("일수업시간? ");
			lesson.dayHours = keyboard.nextInt();
			keyboard.nextLine();
			
			lessons[i] = lesson;
			
			
			
		}
		
	}
}

















