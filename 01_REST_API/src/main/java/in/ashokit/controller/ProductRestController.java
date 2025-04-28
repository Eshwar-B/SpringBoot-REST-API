package in.ashokit.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductRestController {

	
	@GetMapping("/product")
	public ResponseEntity<String> getProductInfo(@RequestParam("id") Integer id, @RequestParam("name") String name)
	{
		String msg = "";
		if(id == 101)
		{
			msg = "hello " + name + ", Apple product :: 50,000";
		}
		else if(id == 102)
		{
			msg = "hello " + name + ", Samsung product  :: 60,000";
		}
		else
		{
			msg = "product not found";
		}
		
		return ResponseEntity.ok(msg);
	}
	
	
	@GetMapping("/product/{id}/{name}")
	public ResponseEntity<String> getProductPrice(@PathVariable("id") Integer id, @PathVariable("name") String name)
	{
		String msg = "";
		if(id == 101)
		{
			msg = "hello " + name + ", Apple product :: 50,000";
		}
		else if(id == 102)
		{
			msg = "hello " + name + ", Samsung product  :: 60,000";
		}
		else
		{
			msg = "product not found";
		}
		
		return ResponseEntity.ok(msg);
	}
	
}
