# 28_1  -

## 1.파일 입출력 API의 활용 

## 2.CSV문자열을 객체로 전환하는 기능을 도메인 객체로 이전 

 

###  1: 수업 데이터를 파일에 보관.

src/main/java/com/moonsolid/sc/App.java 변경

- App.java
    - 애플리케이션을 실행했을 때 파일에서 수업 데이터를 읽어오는 `loadLessonData()`를 정의.
    - 애플리케이션을 종료할 때 수업 데이터를 파일에 저장하는 `saveLessonData()`를 정의.
    - 수업 데이터를 저장할 ArrayList 객체는 위에서 만든 메서드에서 접근할 수 있도록 스태틱 필드로 전환.

###  2: 수업데이터를 CSV 문자열로 다루는 코드를 Lesson클래스로 옮긴다.  

- Lesson.java
  - 수업데이터를 CSV 문자열로 다루는 코드를 Lesson클래스로 옮긴다.  
  - CSV 문자열을 가지고 Lesson객체를 생성하는 valueOf() 를 추가한다.
  - Lesson객체를 가지고 CSV 문자열을 리턴하는 toCsvString() 를 추가한다.



###  3: 회원데이터를 파일에 보관.

src/main/java/com/moonsolid/sc/App.java 변경

- App.java
  - 애플리케이션을 실행했을 때 파일에서 회원 데이터를 읽어오는 `loadMemberData()`를 정의.
  - 애플리케이션을 종료할 때 회원 데이터를 파일에 저장하는 `saveMemberData()`를 정의.
  - 회원 데이터를 저장할 ArrayList 객체는 위에서 만든 메서드에서 접근할 수 있도록 스태틱 필드로 전환.

###  4: 회원데이터를 CSV 문자열로 다루는 코드를 Member클래스로 옮긴다.  

- Member.java
  - 게시물 데이터를 CSV 문자열로 다루는 코드를 Member클래스로 옮긴다.  
  - CSV 문자열을 가지고 Member객체를 생성하는 valueOf() 를 추가한다.
  - Member객체를 가지고 CSV 문자열을 리턴하는 toCsvString() 를 추가한다.

###  5: 게시글데이터를 파일에 보관.

src/main/java/com/moonsolid/sc/App.java 변경

- App.java
  - 애플리케이션을 실행했을 때 파일에서 게시글데이터를 읽어오는 `loadBoardData()`를 정의.
  - 애플리케이션을 종료할 때 게시글데이터를 파일에 저장하는 `saveBoardData()`를 정의.
  - 게시글데이터를 저장할 ArrayList 객체는 위에서 만든 메서드에서 접근할 수 있도록 스태틱 필드로 전환.

###  6: 게시글데이터를 CSV 문자열로 다루는 코드를 Board클래스로 옮긴다.  

- Board.java
  - 게시글데이터를 CSV 문자열로 다루는 코드를 Board클래스로 옮긴다.  
  - CSV 문자열을 가지고 Board객체를 생성하는 valueOf() 를 추가한다.
  - Board객체를 가지고 CSV 문자열을 리턴하는 toCsvString() 를 추가한다.





