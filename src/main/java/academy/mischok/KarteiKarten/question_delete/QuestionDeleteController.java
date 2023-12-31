package academy.mischok.KarteiKarten.question_delete;
import academy.mischok.KarteiKarten.repository.QuestionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
@Controller
public class QuestionDeleteController {
	@Autowired
	private QuestionRepository questionRepository;
	@GetMapping ("/question_delete/{id}")
	public String questionDelete(Model model, @PathVariable int id) {
		model.addAttribute("oldQuestion", questionRepository.findById(id));
		return "question_delete";
	}
	@PostMapping ("/question_delete/{id}")
	public String deleteById(@PathVariable ("id") int id) {
		questionRepository.deleteById(id);
		return "redirect:/question_read";
	}
}