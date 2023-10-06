package academy.mischok.KarteiKarten.question_edit;

import academy.mischok.KarteiKarten.domain.Question;
import academy.mischok.KarteiKarten.repository.QuestionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;




@Controller
public class QuestionEditController {
	@Autowired private QuestionRepository questionRepository;
	@GetMapping ("question_edit/{id}")
	public String editThisQuestion (Model model, @PathVariable int id) {
		model.addAttribute("oldQuestion", questionRepository.findById(id));
		model.addAttribute("newQuestion", new Question());
		return "question_edit";
	}
	@PostMapping ("/question_edit/{id}")
	public String changeQuestion(@PathVariable ("id") int id, @ModelAttribute ("question") Question question) {

		questionRepository.changeById(id, question.getFrage(), question.getAntwort(), 0, 0);
		return "redirect:/question_read";
	}

	
	
	
	
	
	
	
}
