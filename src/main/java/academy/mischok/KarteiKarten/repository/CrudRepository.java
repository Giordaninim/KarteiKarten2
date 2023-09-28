package academy.mischok.KarteiKarten.repository;

public interface CrudRepository<T, ID> {
	Iterable<T> findAll(); //to find all files
	T findById(ID id);
	T save(T entity);
	void delete(T entity);
	void update(T entity);
}
