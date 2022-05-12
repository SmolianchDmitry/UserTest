package user.test.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import user.test.Entities.User;

@Repository
public interface UserRepositories extends JpaRepository<User, Integer> {
}
