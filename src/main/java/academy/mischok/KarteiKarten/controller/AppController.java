package academy.mischok.KarteiKarten.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
@Controller
public class AppController {
    @GetMapping("/")
    public String index() {
        return "index";
    }
    @GetMapping("/karteikarten")
    public String getKarteikarten(){
        return "karteikarten";
    }
    @GetMapping("/quiz")
    public String getQuiz() {
        return "quiz";
    }
    @GetMapping("/test")
    public String getTest() {
        return "test";
    }
    @GetMapping("/result")
    public String getResult() {
        return "result";
    }
    @PostMapping("/")
    public String save(@RequestParam String question) {
        // TODO: Frage in Database speichern
        return "index";
    }
}
