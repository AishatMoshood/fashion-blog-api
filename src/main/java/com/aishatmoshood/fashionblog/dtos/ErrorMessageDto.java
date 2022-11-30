package com.aishatmoshood.fashionblog.dtos;

import lombok.*;
import org.springframework.http.HttpStatus;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class ErrorMessageDto {
    private HttpStatus httpStatus;
    private String message;
}
