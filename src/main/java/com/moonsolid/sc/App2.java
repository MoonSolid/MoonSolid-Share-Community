package com.moonsolid.sc;

import java.sql.Date;
import java.util.Scanner;

public class App2 {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		final int SIZE = 100;

		int[] no = new int[SIZE];
		String[] name = new String[SIZE];
		String[] email = new String[SIZE];
		String[] password = new String[SIZE];
		String[] photo = new String[SIZE];
		String[] tel = new String[SIZE];
        Date[] registereDate = new Date[SIZE];

		int count = 0; //입력받은 값만큼 반복하기위해 count 변수를 선언


		for (int i = 0; i <SIZE; i++) {  //0부터 배열의 사이즈만큼 반복 i++은
			                             //입력받은만큼 배열에 값을 저장
			count++;                     //count입력받을때마다 count증가  
			System.out.print("번호? ");
			no[i] = keyboard.nextInt();    //배열의 i번째에 입력값저장
			keyboard.nextLine();

			System.out.print("이름? ");
			name[i] = keyboard.nextLine();

			System.out.print("이메일? ");
			email[i] = keyboard.nextLine();

			System.out.print("암호? ");
			password[i] = keyboard.nextLine();

			System.out.print("사진? ");
			photo[i] = keyboard.nextLine();

			System.out.print("전화? ");
			tel[i] = keyboard.nextLine();

			registereDate[i] = new Date(System.currentTimeMillis()); //시간변수
			
            System.out.print("계속 입력하시겠습니까?(y/n) ");
            String response = keyboard.nextLine();
            if (!response.equalsIgnoreCase("y"))
            	break;
		}
			keyboard.close();

			System.out.println();

			for (int i = 0; i < count; i++) {
				System.out.printf("%d, %s , %s       , %s     , %s\n",
			no[i], name[i], email[i],     tel[i],  registereDate[i]  );
				

		}
	}
}   










