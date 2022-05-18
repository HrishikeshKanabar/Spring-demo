package Service;

import Bean.Coach;

public class BaseBallCoach implements Coach{
	
	// Adding dependency
	
	

	private FortuneTellerService fService;
	
    public BaseBallCoach(FortuneTellerService fService) {
		this.fService =fService;
	}

	
	public String getDailyWorkout() {
		
		return "Hit 200 balls a day";
	}
	
	// Setting fortune service
	
	public String getfService() {
		return fService.getFortune();
	}


	


	
	
	
	

}
