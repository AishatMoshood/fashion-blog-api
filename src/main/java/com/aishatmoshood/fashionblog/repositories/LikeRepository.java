package com.aishatmoshood.fashionblog.repositories;

import com.aishatmoshood.fashionblog.models.Like;
import com.aishatmoshood.fashionblog.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LikeRepository extends JpaRepository<Like,Long> {
    List<Like> findLikesByPostId(Long postId);
    Like findLikeByPostIdAndUser(Long postId, User user);
}
