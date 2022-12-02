package com.aishatmoshood.fashionblog.dtos.commentdtos;

import com.aishatmoshood.fashionblog.models.Post;
import com.aishatmoshood.fashionblog.models.User;
import lombok.Data;

import java.sql.Timestamp;

@Data
public class CreateCommentDto {
    private String comment;
    private Timestamp createdAt;
    private User user;
    private Post post;
}
