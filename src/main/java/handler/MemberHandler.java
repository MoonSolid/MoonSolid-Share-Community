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

    System.out.print("번호? ");
    member.no = input.nextInt();    //배열의 i번째에 입력값저장
    input.nextLine();

    System.out.print("이름? ");
    member.name = input.nextLine();

    System.out.print("이메일? ");
    member.email = input.nextLine();

    System.out.print("암호? ");
    member.password = input.nextLine();

    System.out.print("사진? ");
    member.photo = input.nextLine();

    System.out.print("전화? ");
    member.tel = input.nextLine();

    member.registerDate = new Date(System.currentTimeMillis()); //시간변수

    this.members[this.memberCount++] = member;

    System.out.println("저장하였습니다.");


  }

  public void listMember() {

    for (int i = 0; i < this.memberCount; i++) {
      Member m = this.members[i];
      System.out.printf("%d,%s,%s,%s,%s\n",
          m.no, m.name, m.email, m.tel, m.registerDate );
    }
  }

}

