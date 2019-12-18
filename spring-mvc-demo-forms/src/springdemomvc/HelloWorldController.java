package springdemomvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/hello")
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
	
	
	// add data 
	// read model
	@RequestMapping("/processformwithmodel")
	public String ManuplateData(HttpServletRequest request, Model model ){
		
		// read the value from html form
		
		String thename = request.getParameter("studentName");
		
		//convert that data to upper case 
		
		thename= thename.toUpperCase();
		
		// create the message 
		String result = "YO! " + thename;
		
		// add message to model
		
		model.addAttribute("message",result);
		
		// return view 
		return "process-form";
	}
	


	    // add data  with databinding
		// read model with databinding
		@RequestMapping("/processformwithmodelversion2")
		public String ManuplateDataBinding(
				@RequestParam("studentName") String thename , Model model){
			
			//convert that data to upper case 
			
			thename= thename.toUpperCase();
			
			// create the message 
			String result = "WECOLEM TO SPRING MVC " + thename;
			
			
			// add message to model
			
			model.addAttribute("message",result);
			
			// return view 
			return "process-form";
		}
		



}