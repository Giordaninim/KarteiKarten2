package academy.mischok.KarteiKarten.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Component;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Component
public class Question {
private Integer id;
private String frage;
private String antwort;
private Integer gestellt;
private Integer richtig;
private Integer r;

	@Override
	public String toString() {
		return "Question: " + frage + " Antwort: " +antwort +
				" id: " + id + " r: " + r;
	}
}
