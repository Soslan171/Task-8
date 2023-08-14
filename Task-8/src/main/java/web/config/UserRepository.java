package web.config;

import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import web.User;


@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

    User findById(Long id);

    void deleteById(Long id);
}