# 30 - 직렬화와 역직렬화를 이용하여 객체를 통째로 읽고 쓰기

## 



###  1: ArrayList/LinkedList 객체 단위로 읽고 출력.

- src/main/java/com/moonsolid/sc/App.java 변경
- src/main/java/com/moonsolid/sc/domain/Lesson.java 변경
- src/main/java/com/moonsolid/sc/domain/Member.java 변경
- src/main/java/com/moonsolid/sc/domain/Board.java 변경

- Lesson.java
    - `java.io.Serializable` 인터페이스를 구현한다.
    - `serialVersionUID` 스태틱 변수의 값을 설정한다.
- Member.java
    - `java.io.Serializable` 인터페이스를 구현한다.
    - `serialVersionUID` 스태틱 변수의 값을 설정한다.
- Board.java
    - `java.io.Serializable` 인터페이스를 구현한다.
    - `serialVersionUID` 스태틱 변수의 값을 설정한다.
- App.java (App.java.01)
    - 파일에서 데이터를 읽을 때 ObjectInputStream을 사용한다.
    - 파일에서 데이터를 쓸 때 ObjectOutputStream을 사용한다.
