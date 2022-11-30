package com.aishatmoshood.fashionblog.repositories;

import com.aishatmoshood.fashionblog.models.Blogger;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BloggerRepository extends JpaRepository<Blogger, Long> {
    boolean existsByEmail(String email);
}
