package academy.mischok.KarteiKarten;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.jdbc.core.JdbcTemplate;

public class KarteiKArtenApplication2 implements CommandLineRunner {
	@Autowired //an instance of the JdbcTemplate class will be automatically injected by the framework
	JdbcTemplate jdbcTemplate;
	
	public static void main(String[] args) {
		SpringApplication.run(KarteiKArtenApplication2.class, args);
	}
	public void run(String... args) throws Exception {
		//method run() use the jdbcTemplate object to insert a new row into the database
		String sql = "insert into fragennn (frage, antwort) values (?, ?)";
		int result = jdbcTemplate.update(sql, "fragebitte1", "antwortbitte1");
		if (result>0) {
			System.out.println("insert successfully + result is: " + result);
		}
	}
}
