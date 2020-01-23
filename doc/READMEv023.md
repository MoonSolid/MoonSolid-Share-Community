# 23 - 인터페이스를 활용하여 객체 사용 규칙 정의



- src/main/java/com/moonsolid/util/List.java 추가
- src/main/java/com/moonsolid/util/ArrayList.java 변경
- src/main/java/com/moonsolid/util/LinkedList.java 변경
- src/main/java/com/moonsolid/sc/handler/LessonHandler.java 변경
- src/main/java/com/moonsolid/sc/handler/MemberHandler.java 변경
- src/main/java/com/moonsolid/sc/handler/BoardHandler.java 변경
- src/main/java/com/moonsolid/sc/App.java 변경

## 

### 1. 데이터 관리 객체를 구분 없이 사용.

- List.java
    - 핸들러와 목록을 다루는 객체 사이의 호출 규칙을 정의.
    - 즉 핸들러가 호출할 메서드의 규칙을 인터페이스로 정의.
- ArrayList.java
    - `List` 인터페이스를 구현.
- LinkedList.java
    - `List` 인터페이스를 구현.
- LessonHandler.java
    - ArrayList 또는 LinkedList를 직접 지정하는 대신에 인터페이스를 필드로 선언.
    - 생성자에서 List 구현체를 공급받도록 변경하여 특정 클래스에 의존하는 코드를 제거.
- MemberHandler.java
    - ArrayList 또는 LinkedList를 직접 지정하는 대신에 인터페이스를 필드로 선언.
    - 생성자에서 List 구현체를 공급받도록 변경하여 특정 클래스에 의존하는 코드를 제거.
- BoardHandler.java
    - ArrayList 또는 LinkedList를 직접 지정하는 대신에 인터페이스를 필드로 선언.
    - 생성자에서 List 구현체를 공급받도록 변경하여 특정 클래스에 의존하는 코드를 제거.
- App.java
    - 핸들러를 생성할 때 List 구현체를 넘겨.
