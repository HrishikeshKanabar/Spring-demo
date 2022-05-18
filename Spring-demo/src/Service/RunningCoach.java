package Service;

import org.springframework.stereotype.Component;

import Bean.Coach;

@Component("RunningCoach")
public class RunningCoach implements Coach {

	
	// Adding dependency
	
	private FortuneTellerService fService;
	
	
	 public RunningCoach(FortuneTellerService fService) {
			this.fService =fService;
		}
	

	public String getDailyWorkout() {
		
		return "Run 100 miles a day" ;
	}
	

	// Setting fortune service
	
	public String getfService() {
		return fService.getFortune();
	}

	
}
