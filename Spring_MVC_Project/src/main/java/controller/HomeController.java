package controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import classes.BaseBallCoach;
import classes.BasketBallCoach;
import classes.CricketCoach;
import classes.PingPongCoach;
import classes.RunningCoach;
import classes.SoccerCoach;
import interfaces.CoachingService;

@Controller
public class HomeController {
	
	@RequestMapping("/")
	public String showMyHomePage(Model model){
		// Step-1 Load our config file : applicationContext.xml
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("/applicationContext.xml");
		
		CoachingService baseObj = context.getBean("baseBallCoach",BaseBallCoach.class);
	    CoachingService baskObj =context.getBean("basketBallCoach",BasketBallCoach.class);
	    CoachingService cricObj= context.getBean("cricketCoach",CricketCoach.class);
	    CoachingService  PingObj=context.getBean("pingPongCoach",PingPongCoach.class);
	    CoachingService SoccObj=context.getBean("soccerCoach",SoccerCoach.class);
	    CoachingService RunObj=context.getBean("runningCoach",RunningCoach.class);
	    
	    // Baseball
	    String insBase =baseObj.getInstruction();
	    String forBase =baseObj.getRandomFortune();
	    // basketball
		String insBask =baskObj.getInstruction();
	    String forBask =baskObj.getRandomFortune();
	    
	    
	    model.addAttribute("insBase",insBase);
	    model.addAttribute("forBase",forBase);
	    model.addAttribute("insBask",insBask);
	    model.addAttribute("forBask",forBask);
	    // Simillar can be done for all coaches
		
		return "home-page";
		
	}
	
	
	
	
}
