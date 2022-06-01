package controller;

import javax.servlet.http.HttpServletRequest;
import org.springframework.ui.Model;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/application")
public class HomeController {
	// Where to show ?  localhost:8081/
	@RequestMapping("/")
	public String showMyHomePage() {
	  // What to show ?
		//         Prefix              Suffix
		// Path = /WEB-INF/view/home-page.jsp
		return "home-page";
	}
	
	@RequestMapping("/contact")
	public String showMyContatPage() {
		
		return "contact-page";
		
	}
	
	@RequestMapping("/poop")
	public String showMyPoopPage() {
		return "poop";
	}
	
	@RequestMapping("/form")
	public String showMyFormPage() {
		return "form-page";
	}
	
	/*@RequestMapping("/display")
	public String showMyDisplayPage(HttpServletRequest req , Model mod) {
		
		// read the data from HTML form
		String Name = req.getParameter("exampleText");
		
		// Convert this into uppercase
		
		Name = Name.toUpperCase();
		
		// Message
		
		String Message = "Hello " + Name;
		
		String test ="HEY I AM TEST STRING";
		
		// add this Message (Data) to model of spring
		
		
		mod.addAttribute("message",Message);
		
		
		
		
		return "display-form-page";
	}*/
	
	
	@RequestMapping("/display")      //String Name = req.getParameter("exampleText");
	public String showMyDisplayPage(@RequestParam("exampleText") String Name,Model mod) {
		
		
		// Convert this into uppercase
		
		Name = Name.toUpperCase();
		
		// Message
		
		String Message = "Hello " + Name;
		
		
		
		// add this Message (Data) to model of spring
		
		
		mod.addAttribute("message",Message);
				
		return "display-form-page";
		
	}
	
	
	
	

}
