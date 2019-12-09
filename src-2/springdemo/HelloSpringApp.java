package springdemo;
import org.springframework.context.support.*;

public class HelloSpringApp {

	public static void main(String[] args) {
		
		// Load configuration file
		  ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// Retrieve bean from container with interface
		// Coach thecoach = context.getBean("myCricketCoach",Coach.class);
		  
	    // Object of cricket coach by beans
		  
		 CricketCoach thecoach =context.getBean("myCricketCoach",CricketCoach.class);
		
		// call methods on bean
		  System.out.println(thecoach.getDailyWorkout());
		
		 // call new  depended method
		  System.out.println(thecoach.getDailyFortune());
		  
		 // Call our new methods to get literal values
		  
		  System.out.println(thecoach.getEmailAdress());
		  System.out.println(thecoach.getTeam());
		
		  // close context
		  context.close();
	}

}
