package web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@ResponseBody
public class HelloController {
	
	@RequestMapping("/hello")
	public String hello(){
		System.out.println("success");
		return "succcess";
	}

}
