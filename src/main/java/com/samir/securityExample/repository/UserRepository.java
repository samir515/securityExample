package com.samir.securityExample.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.samir.securityExample.model.User; // Import your custom User entity class
import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByEmail(String email);
    // You can define custom query methods here if needed
}
