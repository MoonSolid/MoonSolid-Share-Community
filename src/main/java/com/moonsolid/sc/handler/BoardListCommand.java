// listBoard() 메서드 변경
package com.moonsolid.sc.handler;

import java.sql.Date;
import java.util.Iterator;
import java.util.List;
import com.moonsolid.sc.domain.Board;
import com.moonsolid.sc.util.Prompt;

public class BoardListCommand implements Command {
  
  List<Board> boardList;
  
  
  public BoardListCommand(List<Board> list) {
    this.boardList = list;
  }
  
  @Override
  public void execute() {
    Iterator<Board> iterator = boardList.iterator();
    
    while (iterator.hasNext()) {
      
      Board b = iterator.next();
      
      System.out.printf("%d, %s, %s, %d\n", 
          b.getNo(), b.getTitle(), b.getDate(), b.getViewCount());
    }
  }

}









