package com.aishatmoshood.fashionblog.exceptions;

import com.aishatmoshood.fashionblog.dtos.ErrorMessageDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus
@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(AlreadyExistsException.class)
    public ResponseEntity<ErrorMessageDto> alreadyExistsException(AlreadyExistsException ex){
        ErrorMessageDto errorMessageDto = new ErrorMessageDto(HttpStatus.ALREADY_REPORTED, ex.getMessage());
        return ResponseEntity.status(HttpStatus.ALREADY_REPORTED).body(errorMessageDto);
    }
    @ExceptionHandler(NotFoundException.class)
    public ResponseEntity<ErrorMessageDto> notFoundException(NotFoundException ex){
        ErrorMessageDto errorMessageDto = new ErrorMessageDto(HttpStatus.NOT_FOUND, ex.getMessage());
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(errorMessageDto);
    }

    @ExceptionHandler(NotNullException.class)
    public ResponseEntity<ErrorMessageDto> notNullException(NotNullException ex){
        ErrorMessageDto errorMessageDto = new ErrorMessageDto(HttpStatus.NOT_ACCEPTABLE, ex.getMessage());
        return ResponseEntity.status(HttpStatus.NOT_ACCEPTABLE).body(errorMessageDto);
    }

    @ExceptionHandler(UnauthorizedException.class)
    public ResponseEntity<ErrorMessageDto> unauthorizedException(UnauthorizedException ex){
        ErrorMessageDto errorMessageDto = new ErrorMessageDto(HttpStatus.FORBIDDEN, ex.getMessage());
        return ResponseEntity.status(HttpStatus.FORBIDDEN).body(errorMessageDto);
    }
}
