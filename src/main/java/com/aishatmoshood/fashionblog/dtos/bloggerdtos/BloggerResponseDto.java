package com.aishatmoshood.fashionblog.dtos.bloggerdtos;

import com.aishatmoshood.fashionblog.enums.Role;

import java.sql.Timestamp;

public class BloggerResponseDto {
    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    private Role role;
    private Timestamp createdAt;
}
