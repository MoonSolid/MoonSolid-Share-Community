package com.moonsolid.sc;

import java.sql.Date;
import java.util.Scanner;

public class App2 {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		class Member {
		  int no;
		  String name;
		  String email;
		  String password;
		  String photo;
		  String tel;
		  Date registerDate;
		}
		
		final int SIZE = 100;

		
		Member[] members = new Member[SIZE];
		
		int count = 0; //�Է¹��� ����ŭ �ݺ��ϱ����� count ������ ����


		for (int i = 0; i <SIZE; i++) {  //0���� �迭�� �����ŭ �ݺ� i++��
			                             //�Է¹�����ŭ �迭�� ���� ����
			count++;                     //count�Է¹��������� count����  
			
			Member member = new Member();
			
			
			System.out.print("��ȣ? ");
			member.no = keyboard.nextInt();    //�迭�� i��°�� �Է°�����
			keyboard.nextLine();

			System.out.print("�̸�? ");
			member.name = keyboard.nextLine();

			System.out.print("�̸���? ");
			member.email = keyboard.nextLine();

			System.out.print("��ȣ? ");
			member.password = keyboard.nextLine();

			System.out.print("����? ");
			member.photo = keyboard.nextLine();

			System.out.print("��ȭ? ");
			member.tel = keyboard.nextLine();

			member.registerDate = new Date(System.currentTimeMillis()); //�ð�����
			
			members[i] = member;
			
            System.out.print("��� �Է��Ͻðڽ��ϱ�?(y/n) ");
            String response = keyboard.nextLine();
            if (!response.equalsIgnoreCase("y"))
            	break;
		}
			keyboard.close();

			System.out.println();

			for (int i = 0; i < count; i++) {
			  Member member= members[i];
				System.out.printf("%d, %s , %s , %s , %s\n",
				    member.no, member.name, member.email,
				    member.tel, member.registerDate);
				

		}
	}
}   










