package academy.mischok.KarteiKarten.repository;
import java.util.List;
public interface CrudRepository<T, ID> {
	List<T> findAll();
	T findById(ID id);
	T save(T entity);
	void delete(T entity);
	void update(T entity);
}
