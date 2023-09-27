package academy.mischok.KarteiKarten.rowmapper;

import academy.mischok.KarteiKarten.domain.Question;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;

@Component
public class QuestionRowMapper implements RowMapper<Question> {
	@Override
	public Question mapRow(ResultSet rs, int rowNum) throws SQLException {
		Question question = new Question();
		question.setId(rs.getInt("id"));
		question.setAntwort(rs.getString("antwort"));
		question.setFrage(rs.getString("frage"));

		return question;
	}
}
