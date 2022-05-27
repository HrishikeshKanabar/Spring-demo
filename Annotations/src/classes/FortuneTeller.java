package classes;

import org.springframework.stereotype.Component;

import interfaces.FortuneService;

@Component("FortuneTellerId")
public class FortuneTeller implements FortuneService {

	@Override
	public String getFortune() {
		
		return "Play any game on Tuesdays";
	}

}
