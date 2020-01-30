// listBoard() 메서드 변경
package com.moonsolid.sc.handler;

import com.moonsolid.sc.util.Prompt;

public class HelloCommand implements Command {


  Prompt prompt;

  public HelloCommand(Prompt prompt) {
    this.prompt = prompt;
  }


  @Override
  public void execute() {
    
  String name = prompt.inputString("이름? ");

    System.out.printf("%s님 반갑습니다",name);
  }
}









