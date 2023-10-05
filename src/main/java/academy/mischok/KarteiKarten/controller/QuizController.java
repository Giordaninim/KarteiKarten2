package academy.mischok.KarteiKarten.controller;
import academy.mischok.KarteiKarten.domain.Question;
import academy.mischok.KarteiKarten.repository.QuestionRepository;
import jakarta.websocket.server.PathParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class QuizController {
	@Autowired private QuestionRepository questionRepo;
	@Autowired public Method method;
	@GetMapping ("/quiz")
	public String getAQuestion(Model model) {
		Question question = questionRepo.findByRandomFrage();
		model.addAttribute("question", question);
		//System.out.println(question);
		
		
		int gestelltPlusEins = question.getGestellt() +1;
		questionRepo.counterGestellt(gestelltPlusEins, question.getId());
		//System.out.println(gestelltPlusEins);
		return "quiz";
	}
	@PostMapping ("/quiz/{qid}")
	public String counterRichtig(@PathVariable ("qid") int qid, @ModelAttribute ("question") Question question) {
		question = questionRepo.findById(qid);
		int richtigPlusEins = question.getRichtig()+1;
		System.out.println(question);
		System.out.println(richtigPlusEins);
		questionRepo.counterRichtig(richtigPlusEins, qid);
		return "redirect:/quiz";
	}
	
	
}
