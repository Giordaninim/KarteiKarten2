package academy.mischok.KarteiKarten.controller;
import academy.mischok.KarteiKarten.domain.Question;
import academy.mischok.KarteiKarten.repository.QuestionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AppController {
  
    @GetMapping("/karteikarten")
    public String getKarteikarten(){
        return "karteikarten";
    }
    
    @GetMapping("/test")
    public String getTest() {
        return "test";
    }
    
}
