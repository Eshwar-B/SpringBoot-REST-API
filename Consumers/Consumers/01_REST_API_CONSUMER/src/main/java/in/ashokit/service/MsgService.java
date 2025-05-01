package in.ashokit.service;

import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class MsgService {

	private static final String PROVIDER = "http://api.restful-api.dev/objects/";

	public void getMsg() {
		RestTemplate rt = new RestTemplate();
		ResponseEntity<String> re = rt.getForEntity(PROVIDER, String.class);

		String body = re.getBody();

		HttpStatusCode statusCode = re.getStatusCode();

		System.out.println("Body : " + body);
		System.out.println("Status Code : " + statusCode);

	}

}
