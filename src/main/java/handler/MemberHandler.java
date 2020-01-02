package handler;

import java.sql.Date;
import java.util.Scanner;
import domain.Member;

public class MemberHandler {
  
  // �ν��Ͻ� �ʵ� = ��-����ƽ �ʵ�
  // => ���������� �����ؾ� �ϴ� ����
  // => new ����� ���� �����ȴ�.
  //
  Member[] members;
  int memberCount = 0;

  public Scanner input;

  // Ŭ���� �ʵ� = ����ƽ �ʵ�
  // => �����ϴ� ���� 
  // => Ŭ������ �޸𸮿� �ε��� �� �ڵ����� �����ȴ�.
  //
  static final int MEMBER_SIZE = 100;
  
  public MemberHandler(Scanner input) {
    this.input = input;
    this.members = new Member[MEMBER_SIZE];
  }
  
  public void listMember() {
    for (int i = 0; i < this.memberCount; i++) {
      Member m = this.members[i];
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
    
    this.members[this.memberCount++] = member;
    System.out.println("�����Ͽ����ϴ�.");
  }
}
