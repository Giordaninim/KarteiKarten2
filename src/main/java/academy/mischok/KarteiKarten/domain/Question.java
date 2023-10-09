package academy.mischok.KarteiKarten.domain;

import org.springframework.stereotype.Component;

@Component
public class Question {
	private Integer id;
private String frage;
private String antwort;
private Integer gestellt;
private Integer richtig;
private Integer r;
private float rr;

	public Integer getR() {
		return r;
	}
	
	public void setR(Integer r) {
		this.r = r;
	}
	
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
	
	public Integer getGestellt() {
		
		return gestellt;
	}
	
	public void setGestellt(Integer gestellt) {
		this.gestellt = gestellt;
	}
	
	public Integer getRichtig() {
		return richtig;
	}
	
	public void setRichtig(Integer richtig) {
		this.richtig = richtig;
	}
	
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
	
	public float getRr() {
		return rr;
	}
	
	public void setRr(float rr) {
		this.rr = rr;
	}
}
