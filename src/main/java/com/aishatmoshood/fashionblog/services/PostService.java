package com.aishatmoshood.fashionblog.services;

import com.aishatmoshood.fashionblog.dtos.postdtos.CreatePostDto;
import com.aishatmoshood.fashionblog.exceptions.NotFoundException;
import com.aishatmoshood.fashionblog.exceptions.NotNullException;
import com.aishatmoshood.fashionblog.exceptions.UnauthorizedException;
import com.aishatmoshood.fashionblog.models.ApiResponse;
import com.aishatmoshood.fashionblog.models.Post;

import java.util.List;

public interface PostService {
    ApiResponse<Post> createPost(CreatePostDto createPostDto) throws NotNullException, UnauthorizedException;
    ApiResponse<Post> findPostById(Long postId) throws NotFoundException, UnauthorizedException;
    ApiResponse<List<Post>> findAllPosts() throws NotFoundException, UnauthorizedException;
    ApiResponse<Post> updatePostById(Long postId, CreatePostDto createPostDto) throws NotFoundException, UnauthorizedException;
    void deletePostById(Long postId) throws UnauthorizedException, NotFoundException;
}
