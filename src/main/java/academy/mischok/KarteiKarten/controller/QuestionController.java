package academy.mischok.KarteiKarten.controller;

import academy.mischok.KarteiKarten.domain.Question;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class QuestionController {
	
	@GetMapping ("/question_form")
	public String getQuestion(Model model) {
		model.addAttribute("question",  buildQuestionModel());
		
		return "question_form";
	}
	
	@PostMapping ("/question_form")
	public String postQuestion(@ModelAttribute ("question") Question question) {
		System.out.println(question);
		
		return "question_added";
	}
	
	private Question buildQuestionModel(){
		return new Question();
	}
}
