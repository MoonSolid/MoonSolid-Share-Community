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
		
		int count = 0; //입력받은 값만큼 반복하기위해 count 변수를 선언


		for (int i = 0; i <SIZE; i++) {  //0부터 배열의 사이즈만큼 반복 i++은
			                             //입력받은만큼 배열에 값을 저장
			count++;                     //count입력받을때마다 count증가  
			
			Member member = new Member();
			
			
			System.out.print("번호? ");
			member.no = keyboard.nextInt();    //배열의 i번째에 입력값저장
			keyboard.nextLine();

			System.out.print("이름? ");
			member.name = keyboard.nextLine();

			System.out.print("이메일? ");
			member.email = keyboard.nextLine();

			System.out.print("암호? ");
			member.password = keyboard.nextLine();

			System.out.print("사진? ");
			member.photo = keyboard.nextLine();

			System.out.print("전화? ");
			member.tel = keyboard.nextLine();

			member.registerDate = new Date(System.currentTimeMillis()); //시간변수
			
			members[i] = member;
			
            System.out.print("계속 입력하시겠습니까?(y/n) ");
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










