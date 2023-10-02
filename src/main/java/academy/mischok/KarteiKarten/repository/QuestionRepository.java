package academy.mischok.KarteiKarten.repository;

import academy.mischok.KarteiKarten.domain.Question;
import academy.mischok.KarteiKarten.rowmapper.QuestionRowMapper;
import academy.mischok.KarteiKarten.rowmapper.QuestionRowMapper2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class QuestionRepository implements CrudRepository<Question, Integer> {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	//JDBC template is the main API through which we'll access most of the functionality of DB
	//It executes core JDBC workflow
	
	public List<Question> getIDsss() {
		String sqlAnfrage = "SELECT * FROM frage";
		List<Question> questions2= jdbcTemplate.query(sqlAnfrage, new QuestionRowMapper());
			//QuestionRowMapper damit wir wissen dass ID==ID and frage==frage
		return questions2;
		
		}
	
	
	
	
	@Autowired
	private QuestionRowMapper rowMapper; //?
	
	@Override
	public List<Question> findAll() {
		String sql = "SELECT * FROM frage";
		
		List<Question> questions = jdbcTemplate.query(sql, new QuestionRowMapper());
		System.out.println(questions);
		return questions;
	}
	public Question readLastQuestion() {
		String sql = "SELECT * FROM frage WHERE ID=(SELECT MAX(ID))";
		Question question = jdbcTemplate.queryForObject(sql, new QuestionRowMapper());
		return question;
	}
	
	@Override
	public Question findById(Integer integer) {
		String sql = "SELECT * FROM frage WHERE ID = %d".formatted(integer);
		return jdbcTemplate.queryForObject(sql, new QuestionRowMapper());
	}
	
		@Override
	public Question save(Question entity) {
		return null;
	}
	
	

	public void save1(String frage, String antwort) {
		String sql = "insert into frage (frage, antwort) values (?, ?)";
		int row=  jdbcTemplate.update(sql, frage, antwort);
		
	}
	
	@Override
	public void delete(Question entity) {
	
	}
	
	@Override
	public void update(Question entity) {
	
	}
	/*@Override
	public Iterable<Question> findAll() {
		String sql = "SELECT * FROM frage";
		return null;
	}*/
	
	
	
	}
