package ikigai;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.servlet.error.ErrorMvcAutoConfiguration;
@SpringBootApplication(exclude = ErrorMvcAutoConfiguration.class)
public class IkigaiApplication {
    public static void main(String[] args) {
        SpringApplication.run(IkigaiApplication.class, args);
    }
}
