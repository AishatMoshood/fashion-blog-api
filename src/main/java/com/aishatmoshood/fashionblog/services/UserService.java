package com.aishatmoshood.fashionblog.services;

import com.aishatmoshood.fashionblog.dtos.userdtos.UserResponseDto;
import com.aishatmoshood.fashionblog.dtos.userdtos.UserSignupDto;
import com.aishatmoshood.fashionblog.exceptions.AlreadyExistsException;
import com.aishatmoshood.fashionblog.exceptions.NotFoundException;
import com.aishatmoshood.fashionblog.models.ApiResponse;

public interface UserService {
    boolean isEmailExist(String email);
    ApiResponse<UserResponseDto> signup(UserSignupDto userSignupDto) throws AlreadyExistsException;
    ApiResponse<UserResponseDto> login(String email, String password) throws NotFoundException;
}
