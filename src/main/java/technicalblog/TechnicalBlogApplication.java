package technicalblog;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import static org.springframework.boot.SpringApplication.*;

@SpringBootApplication
@ComponentScan
public class TechnicalBlogApplication {

    public static void main(String[] args){
        run(TechnicalBlogApplication.class, args);
    }

}
