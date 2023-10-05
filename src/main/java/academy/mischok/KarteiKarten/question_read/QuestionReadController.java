package academy.mischok.KarteiKarten.question_read;

import academy.mischok.KarteiKarten.controller.Method;
import academy.mischok.KarteiKarten.domain.Question;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import academy.mischok.KarteiKarten.repository.QuestionRepository;


import java.util.List;

@Controller
public class QuestionReadController {
	@Autowired private QuestionRepository questionRepository;
	@Autowired private Method method;
	@Autowired private Question question;

	
	@GetMapping ("question_read")
	public String readQuestion(Model model) {
		List<Question> questions= questionRepository.findAll();
		
		/*for (Question c: questions) {
			double r = Double.valueOf(c.getRichtig())/Double.valueOf(c.getGestellt())*100;
			c.setR((int) Math.round(r));	}*/
		
		for (Question question1 : questions) {
			method.calculateResult(question1);
		}
		model.addAttribute("questions", questions);
		
		
		
		
		
		
		
		
		return "question_read";
	}
	
	
	
	
	
}
