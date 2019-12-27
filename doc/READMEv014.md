# 14 - 생성자 추가

##  목표



- 생성자를 이용하여 인스턴스를 사용하기 전에 필요한 값들을 준비.

## 결과

- src/main/java/com/moonsolid/sc/handler/BoardHandler.java 변경
- src/main/java/com/moonsolid/sc/handler/LessonHandler.java 변경
- src/main/java/com/moonsolid/sc/handler/MemberHandler.java 변경
- src/main/java/com/moonsolid/sc/App.java 변경



### 작업1) 핸들러 객체의 필수 입력 값인 keyboard를 설정!

- LessonHandler.java
    - 기본 생성자 대신에 파라미터로 keyboard를 받는 생성자를 추가.
- MemberHandler.java
    - 기본 생성자 대신에 파라미터로 keyboard를 받는 생성자를 추가.
- BoardHandler.java
    - 기본 생성자 대신에 파라미터로 keyboard를 받는 생성자를 추가.
- App.java
    - 핸들러의 인스턴스를 생성할 때 파라미터의 값으로 keyboard 객체를 넘긴다.
