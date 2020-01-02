# 15 - 인스턴스 연산자와 메서드

## 목표

- 메서드를 활용하여 인스턴스 값을 다루는 연산자를 정의.
- 셋터/겟터 생성.

## 결과

- src/main/java/com//moonsolid/sc/Lesson.java 변경
- src/main/java/com/moonsolid/sc/domain/Member.java 변경
- src/main/java/com/moonsolid/sc/domain/Board.java 변경
- src/main/java/com/moonsolid/sc/handler/LessonHandler.java 변경
- src/main/java/com/moonsolid/sc/handler/MemberHandler.java 변경
- src/main/java/com/moonsolid/sc/handler/BoardHandler.java 변경

## 

### 작업1) Lesson 인스턴스의 값을 다룰 연산자를 정의.

- Lesson.java
    - 인스턴스 변수(필드)를 비공개(private)로 전환.
    - 값을 설정하고 리턴해주는 세터/게터를 정의.
- LessonHandler.java
    - Lesson 인스턴스에 값을 넣고 꺼낼 때 세터/겟터를 사용.

### 작업2) Member 인스턴스의 값을 다룰 연산자를 정의.

- Member.java
    - 인스턴스 변수(필드)를 비공개(private)로 전환.
    - 값을 설정하고 리턴해주는 세터/게터를 정의.
- MemberHandler.java
    - Member 인스턴스에 값을 넣고 꺼낼 때 세터/겟터를 사용.

### 작업3) Board 인스턴스의 값을 다룰 연산자를 정의.

- Board.java
    - 인스턴스 변수(필드)를 비공개(private)로 전환.
    - 값을 설정하고 리턴해주는 세터/게터를 정의.
- BoardHandler.java
    - Board 인스턴스에 값을 넣고 꺼낼 때 세터/겟터를 사용.
