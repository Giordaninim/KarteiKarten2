package academy.mischok.KarteiKarten.QuestionResultController;
import academy.mischok.KarteiKarten.controller.Method;
import academy.mischok.KarteiKarten.repository.QuestionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class QuestionResultController {
	@Autowired QuestionRepository questionRepository;
	@Autowired Method method;
	@GetMapping ("/result")
	public String resultGlobal (Model model) {
		model.addAttribute("resultGlobal", Double.toString(method.getGlobalResult()).substring(0,2));
		return "result";  //substring 0,2 => begin from pos. 0, cut at 2. char
	}
}
