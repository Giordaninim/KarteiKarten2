package academy.mischok.KarteiKarten;

import java.util.*;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class MainController {
	
	@GetMapping("/register")
	public String showForm(Model model) {
		User user = new User();
		model.addAttribute("user", user);
		
		List<String> listProfession = Arrays.asList("Developer", "Tester", "Architect");
		model.addAttribute("listProfession", listProfession);
		
		return "register_form";
	}
	@PostMapping("/register")
	public String submitForm(@ModelAttribute("user") User user) {
		System.out.println(user);
		return "register_success";
	}
	@GetMapping("/question_form")
	public String showFormQ(Model model) {
		Question question = new Question();
		model.addAttribute("question", question);
		return "question_form";
	}
	
	@PostMapping("/question_form")
	public String submitFormQ(@ModelAttribute("question") Question question) {
		System.out.println(question);
		return "question_added";
	}
	
}
