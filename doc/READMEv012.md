# 12 - 클래스 필드와 클래스 메서드

## 목표

- class 를 별도 패키지로 분류

## 결과

- domain 패키지 생성 
- domain 패키지에  Board.java , Lesson.java , Member.java     class 생성



## 

### 작업1) 새 게시판을 추가.

- BoardHandler2.java
    - /board2/add`, `/board2/list , /board2/detail 명령을 처리할 클래스를 추가한다.

- BoardHandler3.java
  - /board3/add`, `/board3/list , /board3/detail 명령을 처리할 클래스를 추가한다.

​     

- App.java
    - 새 명령을 처리하는 코드를 추가한다.

실행 결과:

```
명령> /board2/add
번호? 1
내용? 게시글1
저장하였습니다.

명령> /board2/add
번호? 2
내용? 게시글2
저장하였습니다.

명령> /board/add
번호? 100
내용? 게시글100
저장하였습니다.

명령> /board2/list
1, 게시글1                  , 2019-01-01, 0
2, 게시글2                  , 2019-01-01, 0

명령> /board/list
100, 게시글100              , 2019-01-01, 0
```
