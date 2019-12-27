package handler;

import java.sql.Date;
import java.util.Scanner;
import domain.Member;

public class MemberHandler {



   Member[] members;
   int memberCount = 0;
  
  
   static final int MEMBER_SIZE = 100;
   public Scanner input; 
   
   public MemberHandler(Scanner input) {
     this.input = input;
     this.members = new Member[MEMBER_SIZE];
   }
   

   public void addMember() {

    Member member = new Member();

    System.out.print("��ȣ? ");
    member.no = input.nextInt();    //�迭�� i��°�� �Է°�����
    input.nextLine();

    System.out.print("�̸�? ");
    member.name = input.nextLine();

    System.out.print("�̸���? ");
    member.email = input.nextLine();

    System.out.print("��ȣ? ");
    member.password = input.nextLine();

    System.out.print("����? ");
    member.photo = input.nextLine();

    System.out.print("��ȭ? ");
    member.tel = input.nextLine();

    member.registerDate = new Date(System.currentTimeMillis()); //�ð�����

    this.members[this.memberCount++] = member;

    System.out.println("�����Ͽ����ϴ�.");


  }

  public void listMember() {

    for (int i = 0; i < this.memberCount; i++) {
      Member m = this.members[i];
      System.out.printf("%d,%s,%s,%s,%s\n",
          m.no, m.name, m.email, m.tel, m.registerDate );
    }
  }

}

