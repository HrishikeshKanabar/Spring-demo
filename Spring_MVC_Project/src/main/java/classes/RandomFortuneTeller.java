package classes;

import java.util.Random;

import org.springframework.stereotype.Component;

import interfaces.FortuneService;
@Component
public class RandomFortuneTeller implements FortuneService{

	@Override
	public String getFortune() {
		String[] arr={"dont play on full moon", "play if snowing", "pay me more money"};
		Random r=new Random();
		int randomIndex=r.nextInt(arr.length);
		return  (arr[randomIndex]);
	}

}
