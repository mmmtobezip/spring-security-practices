#### SecurityFilterChain(DefaultSecurityFilterChain)

1. Spring Security에서 지원하는 Filter Chain
2. 특정 요청(URL 패턴)에 대해 순서대로 연결(chain)된 보안 필터들을 적용
3. 인터페이스 SecurityFilterChain의 구현체는 DefaultSecurityFilterChain로 직접 구현보다 비교적 쉽게 URL 패턴과 필터 체인을 설정할 수 있다.



#### FilterChainProxy

1. DelegatingFilterProxy로 부터 보안 처리를 위임받은 Spring Security의 Filter Bean
2. 특정 요청(URL 또는 URL패턴)에 매핑된 SecurityFilterChain 들의 List로 구성
3. 앞의 DeleteGatingFilterProxy로 부터의 모든 요청을 받은 후, 특정 요청과 매핑된 SecurityFilterChain를 작동시키는 보안 FilterChain의 프록시(Proxy)
4. Spring Security 설정은 FilterChainProxy Bean 설정을 의미 



#### 예제1: FilterChainProxy Bean 설정1: 인터페이스 SecurityFilterChain 직접 구현

1. Filter Chain 0: "/assets/**" -> []
2. Filter Chain 1: "/**"        -> [MySecurityFilter01, MySecurityFilter02, MySecurityFilter03] 
3. 설정: ex02.config.SecurityConfig01
4. 테스트: ex02.config.SecurityConfig01Test




#### 예제2: FilterChainProxy Bean 설정2: DefaultSecurityFilterChain 사용

1. Filter Chain 0: "/assets/**" -> []
2. Filter Chain 1: "/**"        -> [MySecurityFilter01, MySecurityFilter02, MySecurityFilter03]
3. 설정: ex02.config.SecurityConfig02
4. 테스트: ex02.config.SecurityConfig02Test



#### 예제3: FilterChainProxy Bean 설정3: Spring Security Filter 사용

1. Filter Chain 0: "/assets/**" -> []
2. Filter Chain 1: "/**"        -> [DisableEncodeUrlFilter, WebAsyncManagerIntegrationFilter, SecurityContextPersistenceFilter, MySecurityFilter04]
3. 설정: ex02.config.SecurityConfig03
4. 테스트: ex02.config.SecurityConfig03Test