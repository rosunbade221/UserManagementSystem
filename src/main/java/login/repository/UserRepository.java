package login.repository;

import org.springframework.data.repository.CrudRepository;

import login.domain.User;

public interface UserRepository extends CrudRepository<User, Long> {

}
