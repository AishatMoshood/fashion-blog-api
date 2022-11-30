package com.aishatmoshood.fashionblog.services;

import com.aishatmoshood.fashionblog.dtos.bloggerdtos.BloggerSignupDto;
import com.aishatmoshood.fashionblog.models.ApiResponse;
import com.aishatmoshood.fashionblog.models.Blogger;

public interface BloggerService {
    boolean isEmailExist(String email);

    ApiResponse<Blogger> signup(BloggerSignupDto bloggerSignupDto);
}
