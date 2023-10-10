package academy.mischok.KarteiKarten.QuestionResultController;

import academy.mischok.KarteiKarten.controller.Method;
import academy.mischok.KarteiKarten.domain.Question;
import academy.mischok.KarteiKarten.repository.QuestionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class QuestionResultController {
	@Autowired QuestionRepository questionRepository;
	@Autowired Method method;
	@GetMapping ("/result")
	public String resultGlobal (Model model) {
		List<Question> questions= questionRepository.findAll();
		double rr = 0;
		for (Question question1 : questions) {
			method.calculateResult(question1);
			rr +=  question1.getR();
		}
		double rrG =  rr/ questions.size();
		System.out.println("das ist rrG: " +rrG);
		model.addAttribute("resultGlobal", Double.toString(rrG).substring(0,2));
		
		return "result";
	}
}
