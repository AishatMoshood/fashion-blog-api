package com.aishatmoshood.fashionblog.util;

import com.aishatmoshood.fashionblog.models.ApiResponse;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class ResponseManager<T> {
    public ApiResponse<T> success(T data) {
        return new ApiResponse<T>((T) "Request Successful", true, data);
    }
}
