package classes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import interfaces.CoachingService;
import interfaces.FortuneService;
@Component
public class PingPongCoach implements CoachingService{
	
	@Autowired
	@Qualifier("randomFortuneTeller")
	private FortuneService fortuneServiceObj;
	
	@Override
	public String getInstruction() {
		// TODO Auto-generated method stub
		return "Run 20 meters a day";
	}

	@Override
	public String getFortune() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getRandomFortune() {
		// TODO Auto-generated method stub
		return fortuneServiceObj.getFortune();
	}
}
