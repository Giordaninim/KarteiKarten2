package academy.mischok.KarteiKarten;

import academy.mischok.KarteiKarten.repository.QuestionRepository;
import academy.mischok.KarteiKarten.rowmapper.QuestionRowMapper2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.sql.ResultSet;

@SpringBootApplication
public class KarteiKartenApplication {
	public static void main(String[] args) {
		SpringApplication.run(KarteiKartenApplication.class, args);
		
	}
}
