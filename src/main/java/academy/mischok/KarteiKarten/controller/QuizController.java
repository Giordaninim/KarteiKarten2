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
		Question question = questionRepo.findByRandomFrageResult();
		model.addAttribute("question", question);
		
		int gestelltPlusEins = question.getGestellt() +1;
		questionRepo.counterGestellt(gestelltPlusEins, question.getId());
		return "quiz";
	}
	@PostMapping ("/quiz/{qid}")
	public String counterRichtig(@PathVariable ("qid") int qid, @ModelAttribute ("question") Question question) {
		question = questionRepo.findById(qid);
		
		int richtigPlusEins = question.getRichtig()+1;
		questionRepo.counterRichtig(richtigPlusEins, qid);
		return "redirect:/quiz";
	}
}
