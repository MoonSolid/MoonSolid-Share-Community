package com.moonsolid.sc;

import java.sql.Date;
import java.util.Scanner;

public class MemberHandler {

  static class Member {
    int no;
    String name;
    String email;
    String password;
    String photo;
    String tel;
    Date registerDate;
  }

  static final int MEMBER_SIZE = 100;
  static Member[] members = new Member[MEMBER_SIZE];
  static int memberCount = 0;
  static Scanner keyboard;

  static void addMember() {

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

    members[memberCount++] = member;

    System.out.println("�����Ͽ����ϴ�.");


  }

  static void listMember() {

    for (int i = 0; i < memberCount; i++) {
      Member m = members[i];
      System.out.printf("%d,%s,%s,%s,%s\n",
          m.no, m.name, m.email, m.tel, m.registerDate );
    }
  }

}

