package com.aishatmoshood.fashionblog.services;

import com.aishatmoshood.fashionblog.exceptions.NotFoundException;
import com.aishatmoshood.fashionblog.exceptions.UnauthorizedException;
import com.aishatmoshood.fashionblog.models.ApiResponse;
import com.aishatmoshood.fashionblog.models.Like;

public interface LikeService {
    ApiResponse<Like> likeAPost(Long postId) throws UnauthorizedException;
    ApiResponse<String> unLikeAPost(Long postId) throws UnauthorizedException, NotFoundException;
    ApiResponse<Like> likeAComment(Long postId) throws UnauthorizedException;

    ApiResponse<String> unLikeAComment(Long commentId) throws UnauthorizedException, NotFoundException;
}
