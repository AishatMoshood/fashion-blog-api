package com.aishatmoshood.fashionblog.services;

import com.aishatmoshood.fashionblog.dtos.commentdtos.CreateCommentDto;
import com.aishatmoshood.fashionblog.exceptions.NotFoundException;
import com.aishatmoshood.fashionblog.exceptions.NotNullException;
import com.aishatmoshood.fashionblog.models.ApiResponse;
import com.aishatmoshood.fashionblog.models.Comment;

import java.util.List;

public interface CommentService {
    ApiResponse<Comment> createComment(CreateCommentDto createCommentDto, Long postId) throws NotNullException, NotFoundException;
    ApiResponse<List<Comment>> findAllPostComments(Long postId) throws NotFoundException;
    ApiResponse<Comment> updateComment(Long commentId, Comment comment) throws NotNullException;
    ApiResponse<String> deleteCommentById(Long commentId);
}
