package com.aishatmoshood.fashionblog.services.serviceimpl;

import com.aishatmoshood.fashionblog.dtos.bloggerdtos.BloggerSignupDto;
import com.aishatmoshood.fashionblog.models.ApiResponse;
import com.aishatmoshood.fashionblog.models.Blogger;
import com.aishatmoshood.fashionblog.repositories.BloggerRepository;
import com.aishatmoshood.fashionblog.services.BloggerService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BloggerServiceImpl implements BloggerService {
    private final BloggerRepository bloggerRepository;

    @Override
    public boolean isEmailExist(String email) {
        boolean status;

        status = bloggerRepository.existsByEmail(email);

        return status;
    }

    @Override
    public ApiResponse<Blogger> signup(BloggerSignupDto bloggerSignupDto) {
        ApiResponse apiResponse;

        return apiResponse;
    }
}
