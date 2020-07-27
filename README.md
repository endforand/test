# KakaoPay 사전테스트 과제 2번
-------------------------------------------
###### 쿠폰 발급 및 관리 시스템
  * http://localhost:8080/KakaoPay/main.jsp        
  * 쿠폰 발급        
      -Table COUPON
        coupon_num |   name   |  tel_no  |  valid_dt  |  use_yn |   
      -------------|----------|----------|------------|---------|
         varchar   |  varchar | varchar  |  varchar   | varchar |
      
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
 
 ###### DEV     
 framework : Spring   
 languge : JAVA    
 DB : Sqlite    
 
 -------------------------------------------
 
 ###### 성능 테스트      
 부하 테스트       시간당 몇 TPS 부하 테스트 할 것인가 기준를 기준으로 부하 코드 작성 및 테스트
 스트레스 테스트    최대 Connection 수치 유지 관련 테스트 
 
 
 -------------------------------------------
 
 **기생성된 쿠폰번호      
 - 생성된 모든 쿠폰번호를 모두 사용하느 즉시 신규 쿠폰 발급되지 않는 문젝 생길 있음.      
    - 모색 방안 : Triger로 쿠폰번호 여유분 체크하는 ondemend Monitor batch 생성        
                제한선까지 다달았을 때 쿠폰번호만 생성하는 실시간 배치가 수행하는 기능 제공
 
