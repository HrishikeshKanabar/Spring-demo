package springdemo;


public class CricketCoach implements Coach {
	
	// define private variable
	
	private FortuneService fortuneservice;
	
	// New literal value to be added
	
	private String emailAdress;
	private String Team;
	
	// define no-arg constructor
	
	
	



	public CricketCoach(){
		
		
	}
	
	

	public void setFortuneservice(FortuneService fortuneservice) {
		this.fortuneservice = fortuneservice;
	}



	@Override
	public String getDailyWorkout() {
		
		return "PRACTICE BOWLING FOR 15 MINUTES";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneservice.getFortune();
	}


	public String getEmailAdress() {
		return emailAdress;
	}



	public void setEmailAdress(String emailAdress) {
		this.emailAdress = emailAdress;
	}



	public String getTeam() {
		return Team;
	}



	public void setTeam(String team) {
		Team = team;
	}


}
