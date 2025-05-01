package ins.ahokit.service;

import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import ins.ahokit.binding.Quote;
import reactor.core.publisher.Mono;

@Service
public class QuoteService {

	private final String API_URL = "https://dummyjson.com/quotes/random";

	public void getQuote1() {

		WebClient webClient = WebClient.create();

		Mono<Quote> bodyToMono = webClient.get().uri(API_URL).retrieve().bodyToMono(Quote.class);

		Quote response = bodyToMono.block();

		System.out.println(response);
	}

	public void getQuote2() {

		System.out.println("Request Sending Started......");
		
		WebClient webClient = WebClient.create();

		Mono<String> bodyToMono = webClient.get().uri(API_URL).retrieve().bodyToMono(String.class);

		String response = bodyToMono.block();

		System.out.println(response);
		
		System.out.println("Request Sending ended......");
	}

	public void getQuote3() {

		System.out.println("Request Sending Started......");

		WebClient webClient = WebClient.create();
		
		webClient.get()
				.uri(API_URL)
				.retrieve()
				.bodyToMono(Quote.class)
				.subscribe(res -> {
					System.out.println("Response : " + res);
				});
				
		
		System.out.println("Request Sending ended......");
	}
	
	

}
