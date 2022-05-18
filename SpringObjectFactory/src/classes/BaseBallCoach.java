package classes;

import interfaces.CoachingService;
import interfaces.FortuneService;

public class BaseBallCoach implements CoachingService {
	
	// Declaring object of interface "Fortune Service"
	private FortuneService fortuneServiceObj;
	
	// Injecting  dependency by constructor
	
	public BaseBallCoach(FortuneService objectFortuneService) {
		fortuneServiceObj =objectFortuneService;
	}

	
	public String getInstruction() {
		
		return "Practice 20 shots an hour";
	}

	// This method should return Fortune from Fortune service
	public String getFortuneFromCoach() {
		
		return fortuneServiceObj.getFortune();
	}
	
	

	
	

}
