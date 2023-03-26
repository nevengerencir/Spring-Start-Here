package config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"services", "repos"})
public class ProjectConfig {
    public ProjectConfig(){
        System.out.println("Building context");
    }
}
