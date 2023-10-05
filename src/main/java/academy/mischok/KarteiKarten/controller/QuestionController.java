package academy.mischok.KarteiKarten.controller;

import academy.mischok.KarteiKarten.domain.Question;
import academy.mischok.KarteiKarten.repository.QuestionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class QuestionController {
	
	@Autowired
	private QuestionRepository questionRepository;
	
	@GetMapping ("/question_form")
	public String getQuestion(Model model) {
		model.addAttribute("question",  new Question());
		
		questionRepository.findAll();
		return "question_form";
	}
	
	@PostMapping ("/question_form")
	public String postQuestion(@ModelAttribute ("question") Question question) {
		//System.out.println(question);
		questionRepository.save1(question.getFrage(),question.getAntwort());
		return "redirect:/question_added"; //_added
	}
	
	
	
	@GetMapping ("question_added")
	public String readLastQuestion (Model model) {
		Question question= questionRepository.readLastQuestion();
		model.addAttribute("question", question);
	return ("question_added");
	}
	@GetMapping ("question_edit/{id}")
	public String editThisQuestion (Model model, @PathVariable int id) {
		model.addAttribute("question", new Question());
		model.addAttribute("neufrage", questionRepository.findById(id));
		return "question_edit";
	}
	
	@PostMapping ("/question_edit")
	public String editQuestion(@ModelAttribute ("question") Question question) {
		System.out.println(question);
		questionRepository.save1(question.getFrage(),question.getAntwort());
		return "redirect:/question_added"; //_added
	}
	
	/*@GetMapping ("question_read")
	public String readQuestion(Model model) {
		List<Question> questions= questionRepository.findAll();
		model.addAttribute("questions", questions);
		return "question_read";
	}*/
}
