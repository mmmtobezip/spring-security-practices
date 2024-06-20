package ex01.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"ex01.controller"}) // 'location'은 테스트
public class WebConfig {

}
