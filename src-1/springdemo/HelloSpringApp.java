package springdemo;
import org.springframework.context.support.*;;

public class HelloSpringApp {

	public static void main(String[] args) {
		
		// Load configuration file
		  ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// Retrieve bean from container
		  Coach thecoach = context.getBean("myCoach",Coach.class);
		
		// call methods on bean
		  System.out.println(thecoach.getDailyWorkout());
		
		 // call new  depended method
		  System.out.println(thecoach.getDailyFortune());
		
		// close context
		  context.close();
	}

}
