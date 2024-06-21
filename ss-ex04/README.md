## Filters Order & Configuration



#### Configuration01 - Custom SecurityBuilder
1. Test
	- configuration: ex04.config.SecurityConfig01
	- test: ex04.config.SecurityConfig01Test
2. formLogin()
	- FormLoginConfigurer
3. filters order
	<pre>
	01. ChannelProcessingFilter
	02. DisableEncodeUrlFilter                  (default)  1
	03. SecurityContextPersistenceFilter        (default)  2
	04. WebAsyncManagerIntegrationFilter        (default)  3
	05. ConcurrentSessionFilter
	06. HeaderWriterFilter                      (default)  4
	07. CsrfFilter                              (default)  5
	08. HeaderWriter                            (default)  6
	09. UsernamePasswordAuthenticationFilter               7 *
	10. DefaultLoginPageGeneratingFilter                   8 *
	11. DefaultLogoutPageGeneratingFilter                  9 *
	12. CasAuthenticationFilter
	13. BasicAuthenticationFilter               
	14. RequestCacheAwareFilter                 (default)  10
	15. SecurityContextHolderAwareRequestFilter (default)  11
	16. JaasApiIntegrationFilter
	17. RememberMeAuthenticationFilter
	18. AnonymousAuthenticationFilter           (default)  12
	19. SessionManagementFilter                 (default)  13
	20. ExceptionTranslationFilter              (default)  14
	21. FilterSecurityInterceptor
	</pre>


	
#### Configuration02 - Custom SecurityBuilder
1. Test
	- configuration: ex04.config.SecurityConfig02
	- test: ex04.config.SecurityConfig02Test
2. formLogin()
	- FormLoginConfigurer
3. httpBasic()
	- HttpBasicConfigurer
	- configure HTTP Basic authentication  
4. filters order
	<pre>
	01. ChannelProcessingFilter
	02. DisableEncodeUrlFilter                  (default)  1
	03. SecurityContextPersistenceFilter        (default)  2
	04. WebAsyncManagerIntegrationFilter        (default)  3
	05. ConcurrentSessionFilter
	06. HeaderWriterFilter                      (default)  4
	07. CsrfFilter                              (default)  5
	08. HeaderWriter                            (default)  6
	09. UsernamePasswordAuthenticationFilter               7
	10. DefaultLoginPageGeneratingFilter                   8
	11. DefaultLogoutPageGeneratingFilter                  9
	12. CasAuthenticationFilter
	13. BasicAuthenticationFilter                          10 *
	14. RequestCacheAwareFilter                 (default)  11
	15. SecurityContextHolderAwareRequestFilter (default)  12
	16. JaasApiIntegrationFilter
	17. RememberMeAuthenticationFilter
	18. AnonymousAuthenticationFilter           (default)  13
	19. SessionManagementFilter                 (default)  14
	20. ExceptionTranslationFilter              (default)  15
	21. FilterSecurityInterceptor
	</pre>


	
#### Configuration03 - Custom SecurityBuilder 
1. Test
	- configuration: ex04.config.SecurityConfig03
	- test: ex04.config.SecurityConfig03Test
2. formLogin()
	- FormLoginConfigurer
3. httpBasic()
	- HttpBasicConfigurer
	- configure HTTP Basic authentication  
4. authorizeRequests() \[Deprecate\]
	- Access Control
	- Authorization Configurer
5. filters order
	<pre>
	01. ChannelProcessingFilter
	02. DisableEncodeUrlFilter                  (default)  1
	03. SecurityContextPersistenceFilter        (default)  2
	04. WebAsyncManagerIntegrationFilter        (default)  3
	05. ConcurrentSessionFilter
	06. HeaderWriterFilter                      (default)  4
	07. CsrfFilter                              (default)  5
	08. HeaderWriter                            (default)  6
	09. UsernamePasswordAuthenticationFilter               7
	10. DefaultLoginPageGeneratingFilter                   8
	11. DefaultLogoutPageGeneratingFilter                  9
	12. CasAuthenticationFilter
	13. BasicAuthenticationFilter                          10
	14. RequestCacheAwareFilter                 (default)  11
	15. SecurityContextHolderAwareRequestFilter (default)  12
	16. JaasApiIntegrationFilter
	17. RememberMeAuthenticationFilter
	18. AnonymousAuthenticationFilter           (default)  13
	19. SessionManagementFilter                 (default)  14
	20. ExceptionTranslationFilter              (default)  15
	21. FilterSecurityInterceptor                          16  *  [deprecated]
	</pre>



#### Configuration04 - Custom SecurityBuilder
1. Test
	- configuration: ex04.config.SecurityConfig04
	- test: ex04.config.SecurityConfig04Test
2. formLogin()
	- FormLoginConfigurer
3. httpBasic()
	- HttpBasicConfigurer
	- configure HTTP Basic authentication
4. authorizeHttpRequests()
	- Access Control
	- Authorization Configurer
5. filters order
	<pre>
	01. ChannelProcessingFilter
	02. DisableEncodeUrlFilter                  (default)  1
	03. SecurityContextPersistenceFilter        (default)  2
	04. WebAsyncManagerIntegrationFilter        (default)  3
	05. ConcurrentSessionFilter
	06. HeaderWriterFilter                      (default)  4
	07. CsrfFilter                              (default)  5
	08. HeaderWriter                            (default)  6
	09. UsernamePasswordAuthenticationFilter               7
	10. DefaultLoginPageGeneratingFilter                   8
	11. DefaultLogoutPageGeneratingFilter                  9
	12. CasAuthenticationFilter
	13. BasicAuthenticationFilter                          10
	14. RequestCacheAwareFilter                 (default)  11
	15. SecurityContextHolderAwareRequestFilter (default)  12
	16. JaasApiIntegrationFilter
	17. RememberMeAuthenticationFilter
	18. AnonymousAuthenticationFilter           (default)  13
	19. SessionManagementFilter                 (default)  14
	20. ExceptionTranslationFilter              (default)  15
	21. AuthorizationFilter                                16  *
	</pre>



#### Configuration05 - Custom SecurityBuilder
1. Test
	- ex04.config.SecurityConfig05
	- test: ex04.config.SecurityConfig05Test
2. formLogin()
	- FormLoginConfigurer
	- loginpage(...): the login page to redirect to if authentication is required
3. authorizeHttpRequests()
	- Access Control
	- Authorization Configurer
4. filters order
	<pre>
	01. ChannelProcessingFilter
	02. DisableEncodeUrlFilter                  (default)  1
	03. SecurityContextPersistenceFilter        (default)  2
	04. WebAsyncManagerIntegrationFilter        (default)  3
	05. ConcurrentSessionFilter
	06. HeaderWriterFilter                      (default)  4
	07. CsrfFilter                              (default)  5
	08. HeaderWriter                            (default)  6
	09. UsernamePasswordAuthenticationFilter               7
	10. DefaultLoginPageGeneratingFilter                   x               
	11. DefaultLogoutPageGeneratingFilter                  x                  
	12. CasAuthenticationFilter
	13. BasicAuthenticationFilter                          x                          
	14. RequestCacheAwareFilter                 (default)  8
	15. SecurityContextHolderAwareRequestFilter (default)  9
	16. JaasApiIntegrationFilter
	17. RememberMeAuthenticationFilter
	18. AnonymousAuthenticationFilter           (default)  10
	19. SessionManagementFilter                 (default)  11
	20. ExceptionTranslationFilter              (default)  12
	21. AuthorizationFilter                                13
	</pre>



#### Practical Configuration (Recommanded) - Custom SecurityBuilder
[참고] mysite05 