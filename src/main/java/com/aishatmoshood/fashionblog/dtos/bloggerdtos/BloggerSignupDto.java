package com.aishatmoshood.fashionblog.dtos.bloggerdtos;

import com.aishatmoshood.fashionblog.enums.Role;

import java.sql.Timestamp;

public class BloggerSignupDto {
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private Role role;
    private Timestamp createdAt;
}
