
![image](https://user-images.githubusercontent.com/62826521/205022850-1bee1f3f-6302-4447-88e5-978215b107e2.png)


 * 디벨로퍼 회원은 개발사업을 위한 자금을 조달하기 위하여 프로젝트를 등록하고 수정할 수 있다.

 * 금융자문·대주 회원은 대주로 참여할(자금을 대출해 줄) 프로젝트를 탐색하기 위하여 디벨로퍼가 등록한 프로젝트의 목록을 조회하고 그 목록을 여러 조회 조건으로 필터링하여 볼 수 있다.

 * 금융자문·대주 회원은 특정 프로젝트에 대주로 참여하기(대출을 해주기) 위하여 프로젝트에 딜 제안을 보낼 수 있다.

 * 디벨로퍼 회원은 자기 프로젝트에 접수된 제안(금융자문·대주가 보낸)들을 목록으로 확인할 수 있다.

 * 금융자문·대주 회원은 자기가 제안한 목록을 확인할 수 있다.

 

백엔드는 위와 같은 기능을 REST API로 제공합니다.

 

--

 

프로젝트에는 대략 아래와 같은 정보가 담깁니다.

 

 * 프로젝트명: 최대 100글자

 * 조달 금액 : 

 * 딜 클로징 일정 (대출 완료 일정) : 일자

 * 만기 (개월수): 개월수 숫자

 * 카테고리 - 지역별: [서울/경기, 충청, 강원, 영남, 호남, 기타]

 * 카테고리 - 자산유형별: [주거, 오피스, 상업시설, 기타]

 * 태그: 여러 태그가 달릴 수 있고, 검색의 대상이 될 수 있음

 

딜 제안에는 주요하게 아래와 같은 정보가 담깁니다.

 

 * 제안 금액

 * 제안 일시
