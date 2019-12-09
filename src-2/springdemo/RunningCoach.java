package springdemo;

public class RunningCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Run for 5 miles daily";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return null;
		
	}
	
	
	// Add Init method
	
	public void doMystart(){
		
		System.out.println("THIS MY START, YES  LETS START");
	}
	
	
	
	// Add Destroy method
	
	public void doMyfinish(){
			
			System.out.println("THIS MY END, YES  LETS END");
		}
	

}
