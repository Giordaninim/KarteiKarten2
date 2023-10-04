package academy.mischok.KarteiKarten.controller;

import academy.mischok.KarteiKarten.domain.Question;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Method {

	
	public double result(Question question) {
		
		double richtig = Double.valueOf(question.getRichtig());
		double gestellt = Double.valueOf(question.getGestellt());
		double r= richtig/gestellt*100;
		question.setR(r);
		return r;
	}
	
}
