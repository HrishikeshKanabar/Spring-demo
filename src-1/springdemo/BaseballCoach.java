package springdemo;

public class BaseballCoach implements Coach {

	
	// define private variable
	
	private FortuneService fortuneservice;
	
	// define constructor
	
	public BaseballCoach(FortuneService TheFortuneService){
		
		fortuneservice = TheFortuneService ;
	}
		
		
	
	@Override
	public String getDailyWorkout(){
		 
		 return "Spent 30 minutes for batting";
	 }

	@Override
	public String getDailyFortune() {
		
		  // use my fortune service to get daily fortune
		return fortuneservice.getFortune();
		
		  
	}


}
