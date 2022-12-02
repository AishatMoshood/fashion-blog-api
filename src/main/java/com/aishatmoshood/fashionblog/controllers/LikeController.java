package com.aishatmoshood.fashionblog.controllers;

import com.aishatmoshood.fashionblog.exceptions.NotFoundException;
import com.aishatmoshood.fashionblog.exceptions.UnauthorizedException;
import com.aishatmoshood.fashionblog.models.ApiResponse;
import com.aishatmoshood.fashionblog.models.Like;
import com.aishatmoshood.fashionblog.services.LikeService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/fashion-blog")
public class LikeController {
    private final LikeService likeService;

    @PostMapping("/like-post/{postId}")
    public ResponseEntity<ApiResponse<Like>> likePost(@PathVariable Long postId) throws UnauthorizedException {
        ApiResponse<Like> newLike = likeService.likeAPost(postId);
        return new ResponseEntity<>(newLike, HttpStatus.CREATED);
    }

    @PutMapping("/unlike-post/{postId}")
    public ResponseEntity<ApiResponse<String>> unlikePost(@PathVariable Long postId) throws UnauthorizedException, NotFoundException {
        ApiResponse<String> response = likeService.unLikeAPost(postId);
        return new ResponseEntity<>(response, HttpStatus.ACCEPTED);
    }

    @PostMapping("/like-comment/{commentId}")
    public ResponseEntity<ApiResponse<Like>> likeComment(@PathVariable Long commentId) throws UnauthorizedException {
        ApiResponse<Like> newLike = likeService.likeAComment(commentId);
        return new ResponseEntity<>(newLike, HttpStatus.CREATED);
    }

    @PutMapping("/unlike-comment/{commentId}")
    public ResponseEntity<ApiResponse<String>> unlikeComment(@PathVariable Long commentId) throws UnauthorizedException, NotFoundException {
        ApiResponse<String> response = likeService.unLikeAComment(commentId);
        return new ResponseEntity<>(response, HttpStatus.ACCEPTED);
    }
}
