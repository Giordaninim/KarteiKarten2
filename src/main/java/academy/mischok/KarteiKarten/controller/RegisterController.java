package academy.mischok.KarteiKarten.controller;

import academy.mischok.KarteiKarten.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Arrays;
import java.util.List;

@Controller
public class RegisterController {
	@GetMapping ("/register")
	public String showForm(Model model) {
		User user = new User();
		model.addAttribute("user", user);
		
		List<String> listProfession = Arrays.asList("Developer", "Tester", "Architect");
		model.addAttribute("listProfession", listProfession);
		
		return "register_form";
	}
	@PostMapping ("/register")
	public String submitForm(@ModelAttribute ("user") User user) {
		System.out.println(user);
		return "register_success";
	}
}