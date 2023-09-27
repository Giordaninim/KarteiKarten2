package academy.mischok.KarteiKarten.repository;

import academy.mischok.KarteiKarten.domain.Question;
import academy.mischok.KarteiKarten.rowmapper.QuestionRowMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class QuestionRepository implements CrudRepository<Question, Integer> {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	@Autowired
	private QuestionRowMapper rowMapper; //?
	
	@Override
	public List<Question> findAll() {
		String sql = "SELECT * FROM frage";
		
		List<Question> questions = jdbcTemplate.query(sql, new QuestionRowMapper());
		
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
