package com.moonsolid.sc;

import java.util.Scanner;

public class App2 {
  public static void main(String[] args) {
	 Scanner keyboard = new Scanner(System.in);
	 
	 System.out.print("��ȣ? ");
	 int no = keyboard.nextInt();
	 keyboard.nextLine();
	 
	 System.out.print("�̸�? ");
	 String name = keyboard.nextLine();
	 
	 System.out.print("�̸���? ");
	 String email = keyboard.nextLine();
	 
	 System.out.print("��ȣ? ");
	 String password = keyboard.nextLine();
	 
	 System.out.print("����? ");
	 String photo = keyboard.nextLine();
	 
	 System.out.print("��ȭ? ");
	 String tel = keyboard.nextLine();
	 
	 System.out.print("������? ");
	 String registeredDate = keyboard.nextLine();
	 
	 keyboard.close();
	 
	 System.out.println();

	 System.out.printf("��ȣ�� %d\n", no);
	 System.out.printf("�̸��� %s\n", name);
	 System.out.printf("�̸����� %s\n", email);
	 System.out.printf("��ȣ�� %s\n", password);
	 System.out.printf("������ %s\n", photo);
	 System.out.printf("��ȭ�� %s\n", tel);
	 System.out.printf("�������� %s\n", registeredDate);
	 
	 
  }
}







