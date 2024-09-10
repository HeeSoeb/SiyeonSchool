<img src="https://github.com/user-attachments/assets/7297e3be-d422-40e5-9dc4-024cfcef5daf" alt="sis_logo" width="400">


# 📌 프로젝트 소개

학원의 여러 시스템을 하나로 통합하는 <b>그룹웨어</b> 프로그램입니다. 

![intention](https://github.com/user-attachments/assets/b72c6627-fd30-40e6-86ad-fae14c3897ac)

- 수업에 필요한 공간 및 기능을 제공하여, 선생님과 학생들에게 편의를 제공하고,

- 기존에 나눠져있던 여러 시스템을 하나로 통합하여 시너지 효과를 기대합니다.


# ⌚ 개발기간

전체일정 : 2024-07-09 (화) ~ 2024-09-09 (월)

![dev_plan](https://github.com/user-attachments/assets/ab93c65d-6a31-4a27-8311-93916f0396e6)

세부일정 :
- 2024-07-09 (화) ~ 2024-07-15 (월) : 주제, 프로젝트명, 팀명, 팀장 선정
- 2024-07-15 (월) ~ 2024-07-22 (월) : 프로젝트 기획 보고서 제출
- 2024-07-22 (월) ~ 2024-08-05 (월) : 화면 설계 회의 및 보고서 제출
- 2024-08-05 (월) ~ 2024-08-12 (월) : 데이터 설계 회의 및 보고서 제출
- 2024-08-12 (월) ~ 2024-08-16 (금) : 최종보고서, DB 스크립트 파일 제출
- 2024-08-12 (월) ~ 2024-08-31 (금) : 프로젝트 구현 및 디버깅(FE + BE 구현)
- 2024-09-01 (일) ~ 2024-09-06 (금) : 베타테스트 진행 및 오류수정
- 2024-09-07 (일) ~ 2024-09-09 (월) : 프로젝트 최종 발표 및 발표자료 제출


# 🌱 구성원 및 역할

- 💗 조장 : 김동규
- 💛 조원 : 김희섭
- 💙 조원 : 이태형

![role](https://github.com/user-attachments/assets/be4f9d96-f2de-4bc8-9236-95b30fa3315a)

<details>
<summary>실제구현된사항</summary>

![role_real](https://github.com/user-attachments/assets/a450bd31-ce72-493c-a083-ce8fc8dfe4ac)

</details>
<br>

💗 조장 : 김동규

- 메일
    - 메일 목록조회 / 상세조회
    - 메일쓰기 / 내게쓰기 (+ 수신인 검색, 주소록 연동)
    - 메일 답장 / 전체 답장 / 전달
    - 메일 임시저장 / 수정
    - 메일 삭제 / 복구 / 영구삭제
    - 메일 중요표시, 읽음표시
    - 메일 알람
- 주소록
- 수업 게시판
    - 메인화면만 구현
- 도구
    - 메인화면만 구현

💛 조원 : 김희섭

- 홈
- 마이페이지
- 관리자페이지

💙 조원 : 이태형

- 로그인/회원가입
- 일정/할일
- 과제 게시판



# ⚙ 개발환경

- Front-end : HTML5 / CSS3 / JavaScript / jQuery / AJAX
- BackEnd : Java 11, JSP & Servlet
- DBMS : Oracle DB
- Developer Tools : Eclipse / VS Code / SQL Developer
- Server : Apach Tomcat 9.0
- Management : Git, GitHub
- OS : Windows10


# 💡 사용한 라이브러리

- 네이버 스마트에디터2


# ✔ DB 설계

DB Overview

![ERD_overview](https://github.com/user-attachments/assets/4723f86c-68f7-4c5c-a52f-6d0311a8f30f)


<details>
<summary>DB Detail view</summary>

![ERD_detail](https://github.com/user-attachments/assets/77283b65-e7ff-434f-9d76-62761f8c4609)

</details>




# 📽 프로젝트 구현

💗 조장 : 김동규

- 메일

    - 메일 목록조회
![메일_목록조회](https://github.com/user-attachments/assets/a6202549-81ad-4d16-8ff8-c3d800b02d7f)

    - 메일 목록 - 페이징처리
![메일_목록_페이징처리](https://github.com/user-attachments/assets/0cb9b00b-958d-48b3-a6db-58bfedfded9f)

    - 메일 상세조회
![메일_상세조회](https://github.com/user-attachments/assets/a05af9f5-980a-403c-9485-6c6566ff3c3e)

    - 메일쓰기 - 수신인 검색기능
![메일쓰기_수신인검색](https://github.com/user-attachments/assets/331ce8a1-73e0-40f4-ae85-9fdd1bc67da5)

    - 메일쓰기 - 스마트에디터
![메일쓰기_스마트에디터](https://github.com/user-attachments/assets/3ba867a8-53c5-4603-89e0-962b99eea074)

    - 메일 내게쓰기
![메일_내게쓰기](https://github.com/user-attachments/assets/c685c0c3-3b1f-486a-b5c3-c096ef0acc86)

    - 메일 답장
![메일_답장](https://github.com/user-attachments/assets/d8464fda-aeff-4322-9347-f81f7cec83ed)

    - 메일 임시저장 & 보내기
![메일_임시저장](https://github.com/user-attachments/assets/10b822bd-f769-4103-a567-8c3d022797f6)


    - 메일 삭제 / 복구 / 영구삭제
![메일_삭제](https://github.com/user-attachments/assets/80644ebe-7c01-4ce4-bffd-733ec39d50fd)

    - 메일 중요표시 기능
![메일_중요표시](https://github.com/user-attachments/assets/3f2b31fa-fd14-483d-93a9-ccb2a18a8dbc)

    - 메일 읽음표시 기능
![메일_읽음표시](https://github.com/user-attachments/assets/792a5478-e302-424d-ba52-fcc39995d2ef)

    - 메일 알림
![메일_알림](https://github.com/user-attachments/assets/e28e4e32-687c-43ba-8b31-246dd14dd502)



- 주소록
- 수업 게시판
- 도구

💛 조원 : 김희섭

- 홈
- 마이페이지
- 관리자페이지

💙 조원 : 이태형

- 로그인/회원가입
- 일정/할일
- 과제 게시판