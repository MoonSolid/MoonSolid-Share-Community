package com.moonsolid.sc;

import java.util.Scanner;

public class App2 {
  public static void main(String[] args) {
	 Scanner keyboard = new Scanner(System.in);
	 
	 System.out.print("번호? ");
	 int no = keyboard.nextInt();
	 keyboard.nextLine();
	 
	 System.out.print("이름? ");
	 String name = keyboard.nextLine();
	 
	 System.out.print("이메일? ");
	 String email = keyboard.nextLine();
	 
	 System.out.print("암호? ");
	 String password = keyboard.nextLine();
	 
	 System.out.print("사진? ");
	 String photo = keyboard.nextLine();
	 
	 System.out.print("전화? ");
	 String tel = keyboard.nextLine();
	 
	 System.out.print("가입일? ");
	 String registeredDate = keyboard.nextLine();
	 
	 keyboard.close();
	 
	 System.out.println();

	 System.out.printf("번호는 %d\n", no);
	 System.out.printf("이름은 %s\n", name);
	 System.out.printf("이메일은 %s\n", email);
	 System.out.printf("암호는 %s\n", password);
	 System.out.printf("사진은 %s\n", photo);
	 System.out.printf("전화는 %s\n", tel);
	 System.out.printf("가일일은 %s\n", registeredDate);
	 
	 
  }
}







