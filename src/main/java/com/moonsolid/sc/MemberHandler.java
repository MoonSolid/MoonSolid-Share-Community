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

    members[memberCount++] = member;

    System.out.println("저장하였습니다.");


  }

  static void listMember() {

    for (int i = 0; i < memberCount; i++) {
      Member m = members[i];
      System.out.printf("%d,%s,%s,%s,%s\n",
          m.no, m.name, m.email, m.tel, m.registerDate );
    }
  }

}

