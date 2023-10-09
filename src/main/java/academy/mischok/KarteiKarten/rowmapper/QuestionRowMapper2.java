package academy.mischok.KarteiKarten.rowmapper;

import academy.mischok.KarteiKarten.domain.Question;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class QuestionRowMapper2 implements RowMapper<Question> {
	
	@Override
	public Question mapRow(ResultSet rs, int rowNum) throws SQLException {
		Question question = new Question();
		question.setId(rs.getInt("ID"));
		question.setFrage(rs.getString("FRAGE"));
		question.setAntwort(rs.getString("antwort"));
		
		return question;
	}
}
