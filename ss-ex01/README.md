#### DelegatingFilterProxy

1. Servlet Context에 설정되는 서블릿 필터
2. 웹애플리케이션에 대한 모든 요청(request)을 받아 Spring Application Context의 Filter Bean를 동작시키는 프락시(proxy): Proxy Design Pattern
3. Spring Security 에서는 Application Context의 Filter Bean에게 보안(인증+권한)과 관련된 처리를 위임(delegation)


#### 예제1: 웹애플리케이션: tomcat에서 실행하기

1. Ex01WebApplicationInitializer: DelegatingFilterProxy 등록
2. AppConfig: MyFilter Bean 등록
3. /hello 접근하여 MyFilter Bean 작동 확인: Cookie("MyFilter", "Works") 


#### 예제2: Test Case: MockMvc 사용
1. ex01.filter.MyFilterTest