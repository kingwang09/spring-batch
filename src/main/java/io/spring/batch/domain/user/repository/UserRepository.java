package io.spring.batch.domain.user.repository;

import io.spring.batch.domain.user.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
