package dio.java_pattern;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class JavaPatternApplication {

	public static void main(String[] args) {
		SpringApplication.run(JavaPatternApplication.class, args);
	}

}
