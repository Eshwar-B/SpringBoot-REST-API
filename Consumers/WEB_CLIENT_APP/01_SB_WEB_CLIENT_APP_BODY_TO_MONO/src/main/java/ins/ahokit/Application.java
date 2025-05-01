package ins.ahokit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import ins.ahokit.service.QuoteService;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(Application.class, args);
		
		QuoteService bean = run.getBean(QuoteService.class);
		
		System.out.println("Synchronous Operation......");
		bean.getQuote2();
		System.out.println("Asynchronous Operation......");
		bean.getQuote3();
		
		
	}

}
