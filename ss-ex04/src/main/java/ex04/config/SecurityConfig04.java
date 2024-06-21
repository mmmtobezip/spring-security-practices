package ex04.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityCustomizer;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

@Configuration
@EnableWebSecurity
public class SecurityConfig04 {

  @Bean
  public WebSecurityCustomizer webSecurityCustomizer() {
    return new WebSecurityCustomizer() {
      @Override
      public void customize(WebSecurity web) {
        web.ignoring().requestMatchers(new AntPathRequestMatcher("/assets/**"));
      }
    };
  }

  @Bean
  public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
    http.formLogin().and()

        .httpBasic().and()

        // AuthorizationFilter
        .authorizeHttpRequests(/* Access Control List */) // web에서 접근제어 조차 하지 않는 /assets/* 같은 애들을 굳이
                                                          // 경로에 지정해줄 필요x, 명확하게 요청을 처리할 url만 넣자
        .anyRequest().permitAll();
    return http.build();
  }
}
