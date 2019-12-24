# 01 - 자바 애플리케이션 프로젝트 만들기

## 목표

- `그레이들`을 이용하여 프로젝트 디렉토리를 구성.
- `그레이들`로 프로젝트를 빌드하고 실행.
- `아파치 메이븐` 프로젝트의 디렉토리 구조 생성


자바 애플리케이션 프로젝트 폴더를 준비.


### 작업1) 프로젝트 디렉토리를 준비.

로컬 Git 저장소에 자바 프로젝트 폴더를 생성.

```
[~/git/eomcs-study]$ mkdir java-project
[~/git/eomcs-study]$ cd eomcs-java-project
```

프로젝트 폴더를 자바 애플리케이션 프로젝트로 초기화.
```
[~/git/eomcs-study/eomcs-java-project]$ gradle init
```

자바 소스 파일 외의 기타 파일을 보관할 디렉토리 생성

```
[~/git/eomcs-study/eomcs-java-project]$ cd src/main
[~/git/eomcs-study/eomcs-java-project/src/main]$ mkdir resources
[~/git/eomcs-study/eomcs-java-project/src/main]$ cd ../test
[~/git/eomcs-study/eomcs-java-project/src/test]$ mkdir resources
```

### 작업2) '그레이들'의 빌드 스크립트 파일을 편집.

build.gradle 파일에 다음 설정을 추가한다.

```
tasks.withType(JavaCompile) {
    options.encoding = 'UTF-8'
    sourceCompatibility = '1.8'
    targetCompatibility = '1.8'
}
```

### 작업3) 프로젝트를 빌드.

```
[~/git/eomcs-study/eomcs-java-project]$ gradle build
```

### 작업4) 프로젝트를 실행.

```
[~/git/eomcs-study/eomcs-java-project]$ gradle run
```
