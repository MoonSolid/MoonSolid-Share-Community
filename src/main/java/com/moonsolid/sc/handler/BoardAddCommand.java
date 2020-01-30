// listBoard() 메서드 변경
package com.moonsolid.sc.handler;

import java.sql.Date;
import java.util.Iterator;
import java.util.List;
import com.moonsolid.sc.domain.Board;
import com.moonsolid.sc.util.Prompt;

public class BoardAddCommand implements Command {

  List<Board> boardList;

  Prompt prompt;

  public BoardAddCommand(Prompt prompt, List<Board> list) {
    this.prompt = prompt;
    this.boardList = list;
  }


  @Override
  public void execute() {
    Board board = new Board();

    board.setNo(prompt.inputInt("번호? "));
    board.setTitle(prompt.inputString("내용? "));
    board.setDate(new Date(System.currentTimeMillis()));
    board.setViewCount(0);

    this.boardList.add(board);

    System.out.println("저장하였습니다.");
  }
}









