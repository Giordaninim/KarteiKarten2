package academy.mischok.KarteiKarten.domain;

import org.springframework.stereotype.Component;

import javax.management.QueryEval;
@Component
public class Question {
	private Integer id;
private String frage;
private String antwort;
	public String getFrage() {
		return frage;
	}
	public void setFrage(String frage) {
		this.frage = frage;
	}
	public String getAntwort() {
		return antwort;
	}
	public void setAntwort(String antwort) {
		this.antwort = antwort;
	}
	
	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	public Question() {};
	public Question(int id, String frage, String antwort) {
		this.frage=frage;
		this.antwort=antwort;
		this.id=id;
		
	}
	@Override
	public String toString() {
		return "Question{" +
				"frage='" + frage + '\'' +
				", antwort='" + antwort + '\'' +
				"id='" + id + '\''+
				'}';
	}
}
