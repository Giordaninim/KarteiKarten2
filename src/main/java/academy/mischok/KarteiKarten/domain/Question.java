package academy.mischok.KarteiKarten.domain;

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
	/*@Override
	public String toString() {
		return "Question{" +
				"frage='" + frage + '\'' +
				", antwort='" + antwort + '\'' +
				'}';
	}*/
}