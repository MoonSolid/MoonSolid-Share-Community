package com.moonsolid.sc;

import java.sql.Date;
import java.util.Scanner;


public class App {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		final int SIZE = 100;
		
		int[] no = new int[SIZE];
		String[] title = new String[SIZE];
		String[] description = new String[SIZE];
		Date[] startDate = new Date[SIZE];
		Date[] endDate = new Date[SIZE];
		int[] totalHours = new int[SIZE];
		int[] dayHours = new int[SIZE];
		
		int count = 0;
		
		for (int i = 0; i < SIZE; i++) {
			count++;
			
			System.out.print("��ȣ? ");
			no[i] = keyboard.nextInt();
			keyboard.nextLine();
			
			System.out.print("������? ");
			title[i] = keyboard.nextLine();
			
			System.out.println("����? ");
			description[i] = keyboard.nextLine();
			
			System.out.println("������? ");
			startDate[i] = Date.valueOf(keyboard.next());
			
			System.out.println("������? ");
			endDate[i] = Date.valueOf(keyboard.next());
			
			System.out.println("�Ѽ����ð�? " );
			totalHours[i] = keyboard.nextInt();
			
			System.out.println("�ϼ����ð�? ");
			dayHours[i] = keyboard.nextInt();
			keyboard.nextLine();
			
			
			
			System.out.print("��� �Է��Ͻðڽ��ϱ�? (y/n) ");
			String response = keyboard.nextLine();
			if(!response.equalsIgnoreCase("y")) 
				break;
			}
          System.out.println();
          
          for (int i = 0; i < count; i++) {
        	  System.out.printf("%d, %s, %s~%s %d\n",
        no[i], title[i], description[i], startDate[i],endDate[i],
        totalHours[i]);
        					  
        	  
          }
			
			keyboard.close();
		}
		
	}


















