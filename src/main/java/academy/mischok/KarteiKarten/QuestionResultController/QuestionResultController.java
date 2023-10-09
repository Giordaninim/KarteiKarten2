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
		/*List<Question> questions= questionRepository.findAll();
		
		for (Question question1 : questions) {
			method.calulateGlobal(question1);
		}
		model.addAttribute("questions", questions);*/
		
		return "result";
	}
}

/*Question question = questionRepo.findByRandomFrageResult();
		model.addAttribute("question", question);
		//System.out.println(question);
		
		
		int gestelltPlusEins = question.getGestellt() +1;
		questionRepo.counterGestellt(gestelltPlusEins, question.getId());*/