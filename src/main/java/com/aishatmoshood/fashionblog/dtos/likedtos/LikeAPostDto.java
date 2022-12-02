package com.aishatmoshood.fashionblog.dtos.likedtos;

import com.aishatmoshood.fashionblog.models.Post;
import com.aishatmoshood.fashionblog.models.User;
import lombok.Data;

@Data
public class LikeAPostDto {
    private Long noOfLikes = 0L;
    private User user;
    private Post post;
}
