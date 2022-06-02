package classes;

import org.springframework.stereotype.Component;

import interfaces.FortuneService;
@Component
public class FortuneTeller implements FortuneService {

	@Override
	public String getFortune() {
		// TODO Auto-generated method stub
		return "Tuesday is best day to play";
	}

}
