# 21 - 스택 자료구조 구현

## 

- 스택(stack) 자료구조를 구현



- src/main/java/com/moonsolid/util/Stack.java 추가
- src/main/java/com/moonsolid/sc/App.java 변경

### 1. 스택 자료구조를 구현.

- Stack.java
    - 제네릭을 적용.
    - 객체 복제가 가능하도록 Cloneable 인터페이스를 구현.


### 2. 사용자가 입력한 명령어를 스택에 보관.

- App.java
    - 사용자가 입력한 명령어를 Stack에 보관.


### 3. 사용자가 입력한 명령을 최신순으로 출력하는 `history` 명령을 추가.

- App.java
    - 명령어 내역을 출력하는 printCommandHistory()를 정의.
    - `history` 명령을 처리하는 분기문을 추가.

#### 실행 결과


```
명령> history
history
/board/detail
/member/list
/lesson/add
/lesson/list
:  <== 키보드에서 ‘q’가 아닌 다른 문자키를 누른다.
/board/add
/member/list
/member/list
/board/add
/board/add
:q  <== 키보드에서 ‘q’ 키를 누른다.
명령>

```
