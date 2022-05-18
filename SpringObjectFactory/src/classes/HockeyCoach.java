package classes;

import interfaces.CoachingService;
import interfaces.FortuneService;

public class HockeyCoach implements CoachingService {
	
	
    // Declare object of interface
	private FortuneService ObjFortuneService;
	
	// Inject this object in constructor
	public HockeyCoach(FortuneService fortuneServiceObject ) {
		ObjFortuneService=fortuneServiceObject;
	}
	
	public String getInstruction() {
		
		return "Pratice 20 penalties a day";
	}


	public String getFortuneFromCoach() {
		
		return ObjFortuneService.getFortune();
	}
	
	

}
