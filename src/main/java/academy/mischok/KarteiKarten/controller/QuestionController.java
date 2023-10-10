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
public class QuestionController {
	@Autowired
	private QuestionRepository questionRepository;
	@GetMapping ("/question_form")
	public String getQuestion(Model model) {
		model.addAttribute("question",  new Question());
		return "question_form";
	}
	@PostMapping ("/question_form")
	public String postQuestion(@ModelAttribute ("question") Question question) {
		questionRepository.saveQuestion(question.getFrage(),question.getAntwort());
		return "redirect:/question_added";
	}
	@GetMapping ("question_added")
	public String readLastQuestion (Model model) {
		Question question= questionRepository.readLastQuestion();
		model.addAttribute("question", question);
		model.addAttribute("newQuestion", new Question());
		return ("question_added");
	}
	@PostMapping ("question_added")
	public String postQuestionAdded (@ModelAttribute ("question") Question question ) {
		questionRepository.saveQuestion(question.getFrage(),question.getAntwort());
		return "redirect:/question_added";
	}
}
