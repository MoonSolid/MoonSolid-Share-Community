# 26 - `커맨드(Command)` 디자인 패턴을 적용

- `Command` 디자인 패턴을 활용.

- src/main/java/com/moonsolid/sc/handler/Command.java 추가
- src/main/java/com/moonsolid/sc/handler/LessonAddCommand.java 추가
- src/main/java/com/moonsolid/sc/handler/LessonListCommand.java 추가
- src/main/java/com/moonsolid/sc/handler/LessonDetailCommand.java 추가
- src/main/java/com/moonsolid/sc/handler/LessonUpdateCommand.java 추가
- src/main/java/com/moonsolid/sc/handler/LessonDeleteCommand.java 추가
- src/main/java/com/moonsolid/sc/handler/MemberAddCommand.java 추가
- src/main/java/com/moonsolid/sc/handler/MemberListCommand.java 추가
- src/main/java/com/moonsolid/sc/handler/MemberDetailCommand.java 추가
- src/main/java/com/moonsolid/sc/handler/MemberUpdateCommand.java 추가
- src/main/java/com/moonsolid/sc/handler/MemberDeleteCommand.java 추가
- src/main/java/com/moonsolid/sc/handler/BoardAddCommand.java 추가
- src/main/java/com/moonsolid/sc/handler/BoardListCommand.java 추가
- src/main/java/com/moonsolid/sc/handler/BoardDetailCommand.java 추가
- src/main/java/com/moonsolid/sc/handler/BoardUpdateCommand.java 추가
- src/main/java/com/moonsolid/sc/handler/BoardDeleteCommand.java 추가
- src/main/java/com/moonsolid/sc/handler/LessonHandler.java 삭제
- src/main/java/com/moonsolid/sc/handler/MemberHandler.java 삭제
- src/main/java/com/moonsolid/sc/handler/BoardHandler.java 삭제
- src/main/java/com/moonsolid/sc/App.java 변경

### 1. 메서드를 호출하는 쪽과 실행 쪽 사이의 규칙을 정의.

- Command.java
    - `App` 클래스와 명령을 처리하는 클래스 사이의 호출 규칙을 정의한다.

### 2. 명령을 처리하는 각 메서드를 객체로 분리.

- LessonHandler.java
    - 수업 CRUD 각 기능을 `Command` 규칙에 따라 객체로 분리한다.
- MemberHandler.java
    - 수업 CRUD 각 기능을 `Command` 규칙에 따라 객체로 분리한다.
- BoardHandler.java
    - 수업 CRUD 각 기능을 `Command` 규칙에 따라 객체로 분리한다.
- App.java (App.java.01)
    - 명령어가 입력되면 `Command` 규칙에 따라 객체를 실행한다.
    - `/board2/xxx` 명령 처리는 삭제한다.

###  3: `Map`으로 `Command` 객체를 관리.

- App.java
    - 명령어를 `key`, `Command` 객체를 `value`로 하여 Map에 저장한다.
    - 각 명령에 대해 조건문으로 분기하는 부분을 간략하게 변경한다.

###  4: `/hello` 명령을 추가.

```
명령> /hello
이름? 홍길동
홍길동님 반갑습니다.

명령>
```

### 
