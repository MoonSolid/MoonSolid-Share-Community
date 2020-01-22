

# 18 - 제네릭 사용 

- 제네릭 문법을 이용하여 타입 정보를 파라미터로 주고 받기.
- 제네릭 문법으로 특정 타입의 값만 다루도록 제한.



- src/main/java/com/moonsolid/sc/ArrayList.java 변경
- src/main/java/com/moonsolid/sc/handler/LessonHandler.java 변경
- src/main/java/com/moonsolid/sc/handler/MemberHandler.java 변경
- src/main/java/com/moonsolid/sc/handler/BoardHandler.java 변경



### 작업1) ArrayList 클래스에 제네릭을 적용.

- ArrayList.java
    - 다양한 타입의 객체 목록을 다룰 수 있도록 제네릭 문법을 적용.
    - 다른 프로젝트에서 사용할 수 있도록 util 패키지를 만들어 이동.
- LessonHandler.java
    - 제네릭을 적용한 `ArrayList` 클래스를 사용하여 데이터를 처리.
- MemberHandler.java
    - 제네릭을 적용한 `ArrayList` 클래스를 사용하여 데이터를 처리.
- BoardHandler.java
    - 제네릭을 적용한 `ArrayList` 클래스를 사용하여 데이터를 처리.
