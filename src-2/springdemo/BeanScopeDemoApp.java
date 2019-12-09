package springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

	public static void main(String[] args) {
		
		// Load configuration file
		  ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanscope-applicationContext.xml");
		
		// Retrieve bean from container with interface
		   Coach thecoach = context.getBean("myCoach",Coach.class);
		
		   Coach thealphacoach = context.getBean("myCoach",Coach.class);
		   
		// Lets check if they are same or not
		   
		  boolean result = (thecoach == thealphacoach);
		  
		 // lets print result here
		 
		 System.out.println("RESULT IS " + result);
		  
		 System.out.println("Memory location for the coach" + thecoach);
		 System.out.println("Memory location for the alphacoach" + thealphacoach );

		 
		 // close context
		 
		 context.close();
		 
		 System.out.println(thecoach.getDailyWorkout());
	
	}

}
