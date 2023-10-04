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
	@GetMapping ("/quiz")
	public String getFirstQuestion(Model model) {
		Question question = questionRepo.findByRandomFrage();
		model.addAttribute("question", question);
		System.out.println(question);
		double r= method.result(question);
		
/*		double r= ((double)question.getRichtig() / (double)question.getGestellt()*100);*/
		System.out.println(question.getId() + " " + Math.round(r));
		return "quiz";
	}
	
}
