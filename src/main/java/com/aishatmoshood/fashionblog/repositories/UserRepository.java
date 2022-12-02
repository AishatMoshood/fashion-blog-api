package com.aishatmoshood.fashionblog.repositories;

import com.aishatmoshood.fashionblog.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    boolean existsByEmail(String email);
    boolean existsByEmailAndPassword(String email, String password);
    User findByEmailAndPassword(String email, String password);
}
