package classesmvc;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student")   // localhost:1993/student
public class StudentController {
	
	
	 @RequestMapping("/form")   // localhost:1993/student/form
	 public String showStudentForm(Model mod) {
		 
		 // Create a student object
		// Step-1 Load our config file : applicationContext.xml
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// Step-2 object of student
		
		Student objStudent = context.getBean("student",Student.class);
		
	
		
		
		mod.addAttribute("std",objStudent);
	   
		 return "student-form";
	 }
	 
	 
	 @RequestMapping("/display")
	 public String displayStudentData(@ModelAttribute("std") Student theStudent) {
		 
		// StudentService obj = new StudentService();
		 
		//obj.createStudent(theStudent.firstName,theStudent.lastName,theStudent.favoriteLanguage,theStudent.country);
		 
		 return "display-data";
	 }
	 
	 
	
	 
	 
	 

}
