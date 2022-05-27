package classes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import interfaces.CoachingService;
import interfaces.FortuneService;

@Component("BaseBallCoachId")
@Scope("prototype")
public class BaseBallCoach implements CoachingService {
	
	// Declare depedency i.e object of interface fortunr service
	@Autowired
	@Qualifier("RandomFortuneTellerID")
	// Access modifier <Type of object> <Any name>
	private FortuneService ObjFortuneService;
	
	// DI by constructor
	
	/*public BaseBallCoach(FortuneService FortuneServiceObj) {
		this.ObjFortuneService =FortuneServiceObj;
	}*/
	
	public void onInitOfBean() {
		System.out.println("HEY I AM INTIALIAZED !!!!!");
	}


	public String getInstruction() {
	
		return "Practice 20 shots a day";
	}


	public String getFortune() {
		
		return ObjFortuneService.getFortune();
	}

}
