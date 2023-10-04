package academy.mischok.KarteiKarten.controller;
import academy.mischok.KarteiKarten.domain.Question;
import academy.mischok.KarteiKarten.repository.QuestionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class QuizController {
	@Autowired
	private	QuestionRepository questionRepo;
	@Autowired
	public Method method;
	@Autowired
	Question question;
	@GetMapping ("/quiz")
	public String getFirstQuestion(Model model) {
		model.addAttribute("question", questionRepo.findByRandomFrage());
		System.out.println(method.result() +" "+ question.getId());
		return "quiz";
	}
	
}
