package handler;

import java.sql.Date;
import java.util.Scanner;
import domain.Member;

public class MemberHandler {
  
  ArrayList memberList;

  Scanner input;

  public MemberHandler(Scanner input) {
    this.input = input;
    memberList = new ArrayList();
  }
  
  public MemberHandler(Scanner inpt, int capacity) {
    this.input = input;
    memberList = new ArrayList(capacity);
  }
  
  public void listMember() {
    Object[] arr = this.memberList.toArray();
    for (Object obj : arr) {
      Member m = (Member) obj;
      System.out.printf("%d, %s, %s, %s, %s\n", 
          m.getNo(), m.getName(), m.getEmail(), 
          m.getTel(), m.getRegisteredDate());
    }
  }

  public void addMember() {
    Member member = new Member();

    System.out.print("��ȣ? ");
    member.setNo(input.nextInt());
    input.nextLine(); // �ٹٲ� ��ȣ ���ſ�

    System.out.print("�̸�? ");
    member.setName(input.nextLine());

    System.out.print("�̸���? ");
    member.setEmail(input.nextLine());

    System.out.print("��ȣ? ");
    member.setPassword(input.nextLine());

    System.out.print("����? ");
    member.setPhoto(input.nextLine());

    System.out.print("��ȭ? ");
    member.setTel(input.nextLine());

    member.setRegisteredDate(new Date(System.currentTimeMillis()));
    
    memberList.add(member);
    
    System.out.println("�����Ͽ����ϴ�.");
  }
}
