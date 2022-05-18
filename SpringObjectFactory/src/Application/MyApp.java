package Application;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import classes.BaseBallCoach;
import classes.FortuneTeller;
import classes.HockeyCoach;
import interfaces.FortuneService;

public class MyApp {

	public static void main(String[] args) {
		
		System.out.println("######### CALLING METHODS WITH HELP OF JAVA CORE WITH NEW KEYWORD ##############");
		
		/*// Java way
		BaseBallCoach  objBaseBall = new BaseBallCoach();
		BaseBallCoach  objBaseBallOne = new BaseBallCoach();
		// Java way 
		HockeyCoach objHockey = new HockeyCoach();
		
		System.out.println(objBaseBall.getInstruction());
		System.out.println(objHockey.getInstruction());
		
		 System.out.println(objBaseBall);
		 System.out.println(objBaseBallOne);
		
		System.out.println("######### IOC with Spring ##############");
		
		// Step-1 Load our config file : applicationContext.xml
		
		 ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		                               
		                                                          //  Id of bean , className
		 BaseBallCoach  objBaseBallWithoutNew = context.getBean("BaseBallCoachId",BaseBallCoach.class);
		 BaseBallCoach  objBaseBallWithoutNewTwo = context.getBean("BaseBallCoachId",BaseBallCoach.class);
		 
		 HockeyCoach    objHockeyWithoutNew  = context.getBean("HockeyCoachId",HockeyCoach.class);
		 
		 System.out.println(objBaseBallWithoutNew.getInstruction());
		 System.out.println(objHockeyWithoutNew.getInstruction());
		 
		 System.out.println(objBaseBallWithoutNewTwo);
		 System.out.println(objBaseBallWithoutNew);
		 context.close();*/
		 
		
		// Fortune service object initiating fortune teller
		FortuneService objofFortuneService = new FortuneTeller();
		
		System.out.println("##### THIS IS BASEBALL COACH #################");
		
		// Object of baseball class
		BaseBallCoach objOfBaseBallCoach = new BaseBallCoach(objofFortuneService);
		System.out.println(objOfBaseBallCoach.getInstruction());
		System.out.println(objOfBaseBallCoach.getFortuneFromCoach());
		
		System.out.println("##### THIS IS HOCKEY COACH #################");
		
		//object of Hockey class
		HockeyCoach objOfHockeyCoach = new HockeyCoach(objofFortuneService);
		System.out.println(objOfHockeyCoach.getInstruction());
		System.out.println(objOfHockeyCoach.getFortuneFromCoach());
		
		
		System.out.println("######### CALLING METHODS WITH HELP OF Spring ##############");
		

		// Step-1 Load our config file : applicationContext.xml
		
		 ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		 
		 BaseBallCoach objOfBaseBallCoachFromSpring = context.getBean("BaseBallCoachId",BaseBallCoach.class);
		 System.out.println(objOfBaseBallCoachFromSpring.getInstruction());
		 System.out.println(objOfBaseBallCoachFromSpring.getFortuneFromCoach());
		 
		 HockeyCoach objOfHockeyCoachFromSpring = context.getBean("HockeyCoachId",HockeyCoach.class);
		 System.out.println(objOfHockeyCoachFromSpring.getInstruction());
		 System.out.println(objOfHockeyCoachFromSpring.getFortuneFromCoach());
		
	}

}
