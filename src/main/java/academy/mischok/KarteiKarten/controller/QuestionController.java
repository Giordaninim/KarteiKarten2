package academy.mischok.KarteiKarten.controller;

import academy.mischok.KarteiKarten.domain.Question;
import academy.mischok.KarteiKarten.repository.QuestionRepository;
import academy.mischok.KarteiKarten.rowmapper.QuestionRowMapper;
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
		model.addAttribute("question",  buildQuestionModel());
		
		questionRepository.findAll();
		
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
