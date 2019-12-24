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

    memberHandler.members[memberHandler.memberCount++] = member;

    System.out.println("�����Ͽ����ϴ�.");


  }

  public static void listMember(MemberHandler memberHandler) {

    for (int i = 0; i < memberHandler.memberCount; i++) {
      Member m = memberHandler.members[i];
      System.out.printf("%d,%s,%s,%s,%s\n",
          m.no, m.name, m.email, m.tel, m.registerDate );
    }
  }

}
