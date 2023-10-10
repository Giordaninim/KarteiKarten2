package academy.mischok.KarteiKarten.controller;

import academy.mischok.KarteiKarten.domain.Question;
import academy.mischok.KarteiKarten.repository.QuestionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class Method {
	@Autowired
	private QuestionRepository questionRepository;
	public void calculateResultPerQuestion(Question question) {
		double richtig = Double.valueOf(question.getRichtig());
		double gestellt = Double.valueOf(question.getGestellt());
		double r= richtig/gestellt*100;
		question.setR((int) Math.round(r));
	}
	public double getGlobalResult() {
		List<Question> questions= questionRepository.findAll();
		double rr = 0;
		for (Question question1 : questions) {
			calculateResultPerQuestion(question1);
			rr += question1.getR();}
		return rr/questions.size();
	}
}
