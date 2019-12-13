package springdemomvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWorldController {


    // need controller method to show form data
	
	@RequestMapping("/showform")
	public String ShowForm(){
		
		return "first-form";
	}
	
	// need controller method to process form data

	@RequestMapping("/processform")
	public String ProcessForm(){
		
		
		
		return "process-form";
		
	}
}