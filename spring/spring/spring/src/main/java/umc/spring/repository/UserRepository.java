package umc.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import umc.spring.Model.Mission;
import umc.spring.Model.User;

public interface UserRepository extends JpaRepository<User, Long> {
}
