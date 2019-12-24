# 13 - 인스턴스 필드와 인스턴스 메서드 추가

## 목표

- 인스턴스 필드와 인스턴스 메서드를 사용.

  

  

## 결과

- src/main/java/com/moonsolid/sc/handler/BoardHandler.java 변경
- src/main/java/com/moonsolid/sc/handler/LessonHandler.java 변경
- src/main/java/com/moonsolid/sc/handler/MemberHandler.java 변경
- src/main/java/com/moonsolid/sc/handler/BoardHandler2.java 삭제
- src/main/java/com/moonsolid/sc/handler/BoardHandler3.java 삭제
- src/main/java/com/moonsolid/sc/App.java 변경

## 

### 작업1) 인스턴스 멤버를 활용하여 새 게시판을 추가.

- BoardHandler.java
    - 게시판 마다 게시글을 개별적으로 다룰 수 있도록 필드를 인스턴스 멤버로 전환.
    - 인스턴스 필드를 다루기 위해 클래스 메서드를 인스턴스 메서드로 전환.
- App.java (App.java.01)
    - `BoardHandler` 클래스의 변화에 맞추어 코드를 변경한다.
- BoardHandler2.java
- BoardHandler3.java
    - 삭제한다.

### 작업2) 핸들러의 스태틱 멤버를 인스턴스 필드와 인스턴스 메서드로 전환.

- LessonHandler.java
    - 필드와 메서드를 인스턴스 멤버로 전환.
- MemberHandler.java    
    - 필드와 메서드를 인스턴스 멤버로 전환.
- App.java
    - `LessonHandler`와 `MemberHandler` 클래스의 변화에 맞추어 코드를 변경.
