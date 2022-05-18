package Test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import Bean.Coach;
import Bean.FortuneTeller;
import Service.BaseBallCoach;
import Service.FortuneTellerService;

public class App {

	public static void main(String[] args) {
	  
		//Normal Java way 
		FortuneTellerService objFortuneTellerService = new FortuneTellerService();
		Coach objBaseBallCoach = new BaseBallCoach(objFortuneTellerService);
		System.out.println("******** NORMAL JAVA PRINT OUT ***************");
		System.out.println(objBaseBallCoach.getDailyWorkout());
		System.out.println(objBaseBallCoach.getfService());
		
		// Spring way
		
		// Load configuration file
		  ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// Retrieve bean from container
		  Coach thecoach = context.getBean("myCoach",Coach.class);
		  System.out.println("******** SPRING PRINT OUT XML WAY ***************");
		  System.out.println(thecoach.getDailyWorkout());
		  System.out.println(thecoach.getfService());
		  
		// Annotation way
		  
		  Coach thecoachAnnotation = context.getBean("RunningCoach",Coach.class);
		  System.out.println("******** SPRING PRINT OUT ANNOTATION WAY ***************");
		  System.out.println(thecoachAnnotation.getDailyWorkout());
		  System.out.println(thecoachAnnotation.getfService());
		  
		  BaseBallCoach object;
		  BaseBallCoach ojectNew = new BaseBallCoach(objFortuneTellerService);
		  //System.out.println(object.getDailyWorkout());
		  System.out.println(ojectNew);
		  
		  
		  
	}

}
