package academy.mischok.KarteiKarten.repository;

import academy.mischok.KarteiKarten.domain.User;

public class UserRepo implements CrudRepository<User, Integer>{
	@Override
	public Iterable<User> findAll() {
		return null;
	}
	
	@Override
	public User findById(Integer integer) {
		return null;
	}
	
	@Override
	public User save(User entity) {
		return null;
	}
	
	@Override
	public void delete(User entity) {
	
	}
	
	@Override
	public void update(User entity) {
	
	}
}
