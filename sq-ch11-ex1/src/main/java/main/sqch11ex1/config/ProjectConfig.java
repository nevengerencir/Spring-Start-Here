package main.sqch11ex1.config;

import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableFeignClients(basePackages ="main.sqch11ex1.proxy" )
public class ProjectConfig {
}
