package com.aishatmoshood.fashionblog.services;

import com.aishatmoshood.fashionblog.exceptions.NotFoundException;
import com.aishatmoshood.fashionblog.exceptions.UnauthorizedException;
import com.aishatmoshood.fashionblog.models.ApiResponse;
import com.aishatmoshood.fashionblog.models.Like;

public interface LikeService {
    ApiResponse<Like> likeAPost(Long postId) throws UnauthorizedException;

    ApiResponse<String> unLikeAPost(Long commentId, Long postId) throws UnauthorizedException, NotFoundException;
}
