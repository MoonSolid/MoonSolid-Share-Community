# 20 - 배열 대신 연결 리스트 자료구조 사용하기

## 

- 연결 리스트(linked list) 자료구조를 구현.
- 중첩 클래스의 활용.

- src/main/java/com/moonsolid/util/LinkedList.java 추가
- src/main/java/com/moonsolid/sc/handler/LessonHandler.java 변경
- src/main/java/com/moonsolid/sc/handler/MemberHandler.java 변경
- src/main/java/com/moonsolid/sc/handler/BoardHandler.java 변경



### 작업1) 연결 리스트 자료구조를 구현.

- LinkedList.java.01
    - 연결 리스트 자료 구조를 구현한 클래스를 정의.


### 작업2) LinkedList 클래스에 제네릭을 적용.

- LinkedList.java
    - ArrayList처럼 특정 타입의 값을 다루도록 제네릭을 적용.


### 작업3) 핸들러 클래스는 ArrayList 대신 LinkedList를 사용.

- LessonHandler.java
    - 수업 데이터를 저장하는 ArrayList를 LinkedList로 교체.
- MemberHandler.java
    - 회원 데이터를 저장하는 ArrayList를 LinkedList로 교체.
- BoardHandler.java
    - 게시글 데이터를 저장하는 ArrayList를 LinkedList로 교체.
