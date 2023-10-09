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
		String sql = "SELECT * FROM frage WHERE id = %d".formatted(integer);
		return jdbcTemplate.queryForObject(sql, new QuestionRowMapper());
	}
	@Override
	public Question save(Question entity) {

		return null;
	}
//	public void save1(String frage, String antwort) {
//		String sql = "insert into frage (frage, antwort, gestellt, richtig) values (?, ?, 0, 0)";
//		int row =  jdbcTemplate.update(sql, frage, antwort);
//	}

	@Override
	public void deleteById(Integer id) {
		String sql = "DELETE FROM frage WHERE id = ?;";
		int row = jdbcTemplate.update(sql, id);
	}
	@Override
	public void update(Question entity) {

	}
	public Question readLastQuestion() {
		String sql = "SELECT * FROM frage WHERE ID=(SELECT MAX(ID))";
		Question question = jdbcTemplate.queryForObject(sql, new QuestionRowMapper());
		return question;
	}
	public Question findByRandomFrage() {
		String sql = "SELECT *  FROM frage ORDER BY RANDOM() LIMIT 1";
		Question question = jdbcTemplate.queryForObject(sql, new QuestionRowMapper());
		//System.out.println(question);
		return question;
	}
	public Question findByRandomFrageResult() {
		String sql = "SELECT *, CAST (richtig as float) / gestellt as r FROM frage order by r LIMIT 1";
		Question question = jdbcTemplate.queryForObject(sql, new QuestionRowMapper());
		//System.out.println(question);
		return question;
	}
	

	public void counterGestellt(int gestelltPlusEins, int id) {
		String sql = "UPDATE frage SET gestellt = ? WHERE id=?";
		int row = jdbcTemplate.update(sql, gestelltPlusEins, id);
	}
	public void counterRichtig(int richtigPlusEins, int id) {
		String sql = "UPDATE frage SET richtig = ? WHERE id=?";
		int row = jdbcTemplate.update(sql, richtigPlusEins, id);
	}
	public void changeById(Question question) {
		String sql = "UPDATE frage SET frage = ?, antwort = ?, gestellt = ?, richtig = ? WHERE id = ?";
		int row = jdbcTemplate.update(sql, question, 0, 0);
	}
}
