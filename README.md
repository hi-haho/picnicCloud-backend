# 백엔드 API 문서


## 개요
본 프로젝트는 미취학 아동의 부모를 위한 웹 플랫폼으로, 문화 시설, 전시회, 교육적 이벤트 등의 활동과 자원을 제공합니다.

백엔드는 Spring Boot, JPA, QueryDsl을 사용하여 구축되었으며, JWT, Interceptor를 통한 인증 및 권한 관리 시스템을 구현하였습니다.

데이터베이스는 MariaDB를 사용하여 사용자 데이터, 활동, 장소 정보를 관리합니다.

사용자는 회원가입, 로그인 후 활동을 공유하고, 전시회 정보 및 추천 활동을 확인할 수 있습니다.


# 시연 영상
[최종 프로젝트 시연 영상](https://youtu.be/dDrlWtAIX2A?si=-zXEgvjY2UaclCGQ)

---


## 사용 기술
### 백엔드
- 백엔드: Spring Boot
- 데이터베이스: MariaDB
- ORM: JPA, QueryDSL
- 인증: JWT (JSON Web Token)
- API 테스트 도구: Postman, Swagger
- 기타: Spring Security, Interceptor


---


## 개발 환경
- IDE: IntelliJ, VS Code
- 형상 관리: Git
- API 테스트 도구: Postman, Swagger
- 데이터베이스 관리: MariaDB
- 문서화: Notion, Google Sheets

---

# 프로젝트 클론
git clone https://github.com/your-repository.git


---

## 인증 관리

- JWT (JSON Web Token): 사용자가 로그인 후 얻은 JWT 토큰을 통해 인증 및 권한을 관리합니다.
- Interceptor: JWT 토큰을 검증하여 요청을 처리하기 전에 사용자 권한을 확인합니다.

-----

## 기능
#### 1. 사용자 관리
회원가입: 사용자가 웹사이트에 회원가입할 수 있도록 지원합니다.
로그인: 사용자 인증을 위한 JWT 기반 로그인 시스템.
마이페이지: 로그인한 사용자의 정보를 조회하고 수정할 수 있습니다.
#### 2. 문화 시설 및 활동 정보
문화시설 목록 조회: 박물관, 미술관 등 유아 동반이 가능한 문화시설 정보를 제공합니다.
활동 정보 조회: 문화시설에서 진행 중인 활동 및 이벤트에 대한 정보를 제공합니다.
#### 3. 게시판 기능
게시글 작성 및 수정: 부모들이 문화 시설 및 활동 정보를 공유할 수 있도록 게시글을 작성합니다.
게시글 목록 조회: 다른 사용자가 작성한 게시글을 조회할 수 있습니다.
#### 4. 전시회 및 일정 관리
전시회 일정 조회: 다가오는 전시회 및 일정 정보를 제공합니다.
