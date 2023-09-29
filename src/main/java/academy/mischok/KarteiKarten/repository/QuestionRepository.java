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
	
	@Override
	public Question findById(Integer integer) {
		return null;
	}
	
	@Override
	public Question save(Question entity) {
		return null;
	}
	
	public List<Question> readLastId() {
/*
		String sql = "SELECT * FROM frage";
*/
		String sql = "SELECT MAX(id) FROM frage";
		
		List<Question> questions = jdbcTemplate.query(sql, new QuestionRowMapper());
		return questions;
	}
	
	public List<Question> readLastQuestion() {
		String sql = "SELECT MAX(id) FROM frage";
		List<Question> questions = jdbcTemplate.query(sql, new QuestionRowMapper());
		return questions;
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
