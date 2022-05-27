package apps;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import classes.BaseBallCoach;

public class MyApp {

	public static void main(String[] args) {
		
		// Step-1 Load our config file : applicationContext.xml
		
		 ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		 
		 // Make object of Baseball coach
		 
		 BaseBallCoach objBaseBallCoach = context.getBean("BaseBallCoachId",BaseBallCoach.class);
		 //System.out.println(objBaseBallCoach.getInstruction());
		 //System.out.println(objBaseBallCoach.getFortune());
		 
		 BaseBallCoach objBaseBallCoachOne = context.getBean("BaseBallCoachId",BaseBallCoach.class);
		 BaseBallCoach objBaseBallCoachTwo = context.getBean("BaseBallCoachId",BaseBallCoach.class);
		 System.out.println(objBaseBallCoachOne);
		 System.out.println(objBaseBallCoachTwo);
		 System.out.println(objBaseBallCoachOne.equals(objBaseBallCoachTwo));
		 
	} 

}
