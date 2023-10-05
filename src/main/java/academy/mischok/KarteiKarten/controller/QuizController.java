package academy.mischok.KarteiKarten.controller;
import academy.mischok.KarteiKarten.domain.Question;
import academy.mischok.KarteiKarten.repository.QuestionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class QuizController {
	@Autowired private QuestionRepository questionRepo;
	@Autowired public Method method;
	@GetMapping ("/quiz")
	public String getAQuestion(Model model) {
		Question question = questionRepo.findByRandomFrage();
		model.addAttribute("question", question);
		System.out.println(question);
		
		
		int gestelltPlusEins = question.getGestellt() +1;
		questionRepo.counterGestellt(gestelltPlusEins, question.getId());
		System.out.println(gestelltPlusEins);
		return "quiz";
	}
	@PostMapping ("/quiz")
	public String counterRichtig(@ModelAttribute ("question") Question question) {
		System.out.println(question);
		questionRepo.counterRichtig(5, 3);
		return "quiz";
	}
	
	
}
