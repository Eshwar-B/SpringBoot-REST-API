package in.ashokit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.ashokit.service.WikipediaService;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(Application.class, args);
		
		WikipediaService bean = run.getBean(WikipediaService.class);
		
		bean.wikiStreamConsumer1();
		bean.wikiStreamConsumer2();
	}

}
