package springdemo;

public class MyApp {

	public static void main(String[] args) {
		
		// Create the object 
		
		Coach theCoach = new RunningCoach();
		
		// Use the object

	   System.out.println(theCoach.getDailyWorkout());
	
	}

}
