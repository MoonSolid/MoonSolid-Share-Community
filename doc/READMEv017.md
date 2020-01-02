# 17 - 다형성과 형변환 응용

## 학습 목표

- 다형적 변수를 활용하여 다양한 타입의 데이터를 다루기.

  

## 결과

- src/main/java/com/moonsolid/sc/handler/LessonList.java 삭제
- src/main/java/com/moonsolid/sc/handler/MemberList.java 삭제
- src/main/java/com/moonsolid/sc/handler/BoardList.java 삭제
- src/main/java/com/moonsolid/sc/handler/ArrayList.java 추가
- src/main/java/com/moonsolid/sc/handler/LessonHandler.java 변경
- src/main/java/com/moonsolid/sc/handler/MemberHandler.java 변경
- src/main/java/com/moonsolid/sc/handler/BoardHandler.java 변경

## 

### 작업1) Lesson, Member, Board를 모두 다룰 수 있는 List 클래스를 만들기.

- ArrayList.java
    - LessonList, MemberList, BoardList 클래스를 합쳐 한 클래스로 만들기.
- LessonHandler.java
    - `ArrayList` 클래스를 사용하여 데이터를 처리.
- MemberHandler.java
    - `ArrayList` 클래스를 사용하여 데이터를 처리.
- BoardHandler.java
    - `ArrayList` 클래스를 사용하여 데이터를 처리.
