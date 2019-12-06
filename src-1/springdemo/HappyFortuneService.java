package springdemo;

public class HappyFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		
		return "TODAY IS YOUR LUCK DAY";
	}

}
