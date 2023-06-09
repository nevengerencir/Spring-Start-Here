package config;
import objects.Parrot;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class ProjectConfig {
    @Bean("Miki")
    @Primary
    Parrot parrot1(){
        var p = new Parrot();
        p.setName("Miki");
        return p;
    }
    @Bean
    Parrot parrot2(){
        var p = new Parrot();
        p.setName("Koko");
        return p;
    }
    @Bean
    Parrot parrot3(){
        var p = new Parrot();
        p.setName("Jon");
        return p;
    }
}
