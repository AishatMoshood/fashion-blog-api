package com.aishatmoshood.fashionblog.dtos.userdtos;

import com.aishatmoshood.fashionblog.enums.Role;
import lombok.Data;

import java.sql.Timestamp;

@Data
public class UserResponseDto {
    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    private Role role;
    private String gender;
    private Timestamp createdAt;
}
