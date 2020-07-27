# KakaoPay 사전테스트 과제 2번
-------------------------------------------
###### 쿠폰 발급 및 관리 시스템
  * 쿠폰 발급 
      
      -Table COUPON
      coupon_num |   name   |  tel_no  |  valid_dt  |  use_yn  |   
      -----------|----------|----------|------------|----------|
      PK varchar |  varchar | varchar  |  varchar   | varchar  |
      
      이름, 전화번호 입력 후 발급버튼      
      Java.util.Ramdom API를 이용 쿠폰번호 생성    
      이후 COUPON 테이블에 Insert 후 관리    
      
  * 쿠폰 조회
     이름, 전화번호를 넣고 조회    
     해당 사용자에게 발급된 쿠폰 목록이 조회됨    
     만료, 기사용 쿠폰 모두 조회됨    
     
  * 기발급된 쿠폰 취소
     쿠폰번호 또는 개인정보(이름, 전화번호)로 조회    
     
 -------------------------------------------
 
 framework Spring 
 languge JAVA
 DB Sqlite
 
 -------------------------------------------
 
 Test
 시간당 몇 TPS 부하 테스트 할 것인가 정하기 
 
 
