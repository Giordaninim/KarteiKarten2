package academy.mischok.KarteiKarten.controller;

import academy.mischok.KarteiKarten.domain.Question;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;

import javax.management.QueryEval;
import java.util.List;

@Component
public class Method {
@Autowired Question question;
	
	/*public double result(List<Question> kek) {
		
		double richtig = Double.valueOf(question.getRichtig());
		double gestellt = Double.valueOf(question.getGestellt());
		double r= richtig/gestellt*100;
		question.setR(r);
		return r;
	}*/
}
