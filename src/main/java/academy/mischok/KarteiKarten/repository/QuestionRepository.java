package academy.mischok.KarteiKarten.repository;

import academy.mischok.KarteiKarten.domain.Question;


public class QuestionRepository implements CrudRepository<Question, Integer> {
	@Override
	public Iterable<Question> findAll() {
		String sql = "SELECT * FROM frage";
		return null;
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
	
	public Question findByFrage(String frage){
		String sql = "SELECT * from frage where frage = ?";
		return null;
	}
}
