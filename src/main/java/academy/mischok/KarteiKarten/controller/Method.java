package academy.mischok.KarteiKarten.controller;

import academy.mischok.KarteiKarten.domain.Question;
import org.springframework.stereotype.Component;

@Component
public class Method {
	
	public void calculateResult(Question question) {
		
		double richtig = Double.valueOf(question.getRichtig());
		double gestellt = Double.valueOf(question.getGestellt());
		double r= richtig/gestellt*100;
/*		System.out.println(richtig + "---" + gestellt + "---" + " --- " + r);		*/
		question.setR((int) Math.round(r));
	}
	
	
	
}
