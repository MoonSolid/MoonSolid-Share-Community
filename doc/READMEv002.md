# 02 - `이클립스 IDE`로 프로젝트전환

##목표

- `그레이들`을 이용하여 `이클립스 IDE`용 프로젝트로 전환.
- `이클립스` 워크스페이스로 프로젝트를 가져오기.
- `이클립스`에서 빌드하고 실행.


- ~/git/eomcs-study/eomcs-java-project/build.gradle (변경)

이클립스 IDE로 import 한 후 애플리케이션을 실행.

### 작업1) 그레이들의 빌드 스크립트 파일에 이클립스 플러그인을 추가.

build.gradle 파일에 'eclipse' 플러그인을 추가.

```
plugins {
    id 'java'
    id 'application'
    id 'eclipse'
}
```

### 작업2) 이클립스 IDE에서 사용할 프로젝트 설정 파일을 생성.

```
[~/git/eomcs-study/eomcs-java-project]$ gradle eclipse
```

