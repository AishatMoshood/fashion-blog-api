package com.aishatmoshood.fashionblog.controllers;

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
@RequestMapping("/api/v1/fashion-blog/")
public class LikeController {
    private final LikeService likeService;

    @PostMapping("/like-post")
    public ResponseEntity<ApiResponse<Like>> likePost(@PathVariable Long postId, @RequestBody Like like) throws UnauthorizedException {
        ApiResponse<Like> newLike = likeService.likeAPost(postId);
        return new ResponseEntity<>(newLike, HttpStatus.CREATED);
    }
}
