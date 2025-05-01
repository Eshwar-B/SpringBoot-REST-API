package in.ashokit.service;

import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import in.ashokit.WikipediaStream;

import reactor.core.publisher.Flux;

@Service
public class WikipediaService {

	private String WIKI_STREAM_URL = "https://stream.wikimedia.org/v2/stream/recentchange";

	public void wikiStreamConsumer1() {

		System.out.println("<<<<<<<<<<<<<<<<< Synchronous Operation >>>>>>>>>>>>");

		System.out.println("<<<<<<<<<<<<<<<<< Request Started >>>>>>>>>>>>");

		WebClient webClient = WebClient.create();

		Flux<String> bodyToFlux = webClient.get().uri(WIKI_STREAM_URL).retrieve().bodyToFlux(String.class);

		bodyToFlux.doOnNext(res -> {
			System.out.println(res);
		}).blockLast();

		System.out.println("<<<<<<<<<<<<<<<<< Request Ended >>>>>>>>>>>>");
	}

	public void wikiStreamConsumer2() {
		System.out.println("<<<<<<<<<<<<<<<<< Asynchronous Operation >>>>>>>>>>>>");

		System.out.println("<<<<<<<<<<<<<<<<< Request Started >>>>>>>>>>>>");
		WebClient webClient = WebClient.create();

		webClient.get().uri(WIKI_STREAM_URL).retrieve().bodyToFlux(WikipediaStream.class).subscribe(res -> {
			System.out.println(res);
		});

		System.out.println("<<<<<<<<<<<<<<<<< Request Ended >>>>>>>>>>>>");
	}

}
