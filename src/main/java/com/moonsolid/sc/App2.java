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

		int count = 0; //�Է¹��� ����ŭ �ݺ��ϱ����� count ������ ����


		for (int i = 0; i <SIZE; i++) {  //0���� �迭�� �����ŭ �ݺ� i++��
			                             //�Է¹�����ŭ �迭�� ���� ����
			count++;                     //count�Է¹��������� count����  
			System.out.print("��ȣ? ");
			no[i] = keyboard.nextInt();    //�迭�� i��°�� �Է°�����
			keyboard.nextLine();

			System.out.print("�̸�? ");
			name[i] = keyboard.nextLine();

			System.out.print("�̸���? ");
			email[i] = keyboard.nextLine();

			System.out.print("��ȣ? ");
			password[i] = keyboard.nextLine();

			System.out.print("����? ");
			photo[i] = keyboard.nextLine();

			System.out.print("��ȭ? ");
			tel[i] = keyboard.nextLine();

			registereDate[i] = new Date(System.currentTimeMillis()); //�ð�����
			
            System.out.print("��� �Է��Ͻðڽ��ϱ�?(y/n) ");
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










