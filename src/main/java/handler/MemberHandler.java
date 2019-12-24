package handler;

import java.sql.Date;
import java.util.Scanner;
import domain.Member;

public class MemberHandler {



   Member[] members = new Member[MEMBER_SIZE];
   int memberCount = 0;
  
  
  static final int MEMBER_SIZE = 100;
  public static Scanner keyboard;

  public static void addMember(MemberHandler memberHandler) {

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

    memberHandler.members[memberHandler.memberCount++] = member;

    System.out.println("저장하였습니다.");


  }

  public static void listMember(MemberHandler memberHandler) {

    for (int i = 0; i < memberHandler.memberCount; i++) {
      Member m = memberHandler.members[i];
      System.out.printf("%d,%s,%s,%s,%s\n",
          m.no, m.name, m.email, m.tel, m.registerDate );
    }
  }

}

