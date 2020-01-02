# 16 - UI 코드와 데이터 처리 코드를 분리

## 목표

- 캡슐화 기법을 이용하여 데이터 처리 코드를 별개의 클래스로 분리.
- 배열 복제를 통해 배열의 크기를 늘리기.

  

## 결과

- src/main/java/com/moonsolid/sc/handler/LessonList.java 추가
- src/main/java/com/moonsolid/sc/handler/MemberList.java 추가
- src/main/java/com/moonsolid/sc/handler/BoardList.java 추가
- src/main/java/com/moonsolid/sc/handler/LessonHandler.java 변경
- src/main/java/com/moonsolid/sc/handler/MemberHandler.java 변경
- src/main/java/com/moonsolid/sc/handler/BoardHandler.java 변경

## 

### 작업1) LessonHandler에서 데이터 처리 코드를 분리.

- LessonList.java
    - `LessonHandler`에서 데이터 처리 코드를 이 클래스로 옮긴다.
    - Lesson 데이터 배열을 리턴하는 toArray() 메서드를 정의한다.
    - Lesson 데이터를 저장하는 add() 메서드를 정의한다.
    - 기본 생성자와 배열의 초기 크기를 설정하는 생성자를 정의한다.  
- LessonHandler.java
    - `LessonList` 클래스를 사용하여 데이터를 처리한다.

### 작업2) MemberHandler에서 데이터 처리 코드를 분리.

- MemberList.java
    - `MemberHandler`에서 데이터 처리 코드를 이 클래스로 옮긴다.
    - 회원 데이터 배열을 리턴하는 toArray() 메서드를 정의한다.
    - 회원 데이터를 저장하는 add() 메서드를 정의한다.
    - 기본 생성자와 배열의 초기 크기를 설정하는 생성자를 정의한다.  
- MemberHandler.java
    - `MemberList` 클래스를 사용하여 데이터를 처리한다.

### 작업3) BoardHandler에서 데이터 처리 코드를 분리.

- BoardList.java
    - `BoardHandler`에서 데이터 처리 코드를 이 클래스로 옮긴다.
    - 게시물 데이터 배열을 리턴하는 toArray() 메서드를 정의한다.
    - 게시물 데이터를 저장하는 add() 메서드를 정의한다.
    - 기본 생성자와 배열의 초기 크기를 설정하는 생성자를 정의한다.  
- BoardHandler.java
    - `BoardList` 클래스를 사용하여 데이터를 처리한다.
