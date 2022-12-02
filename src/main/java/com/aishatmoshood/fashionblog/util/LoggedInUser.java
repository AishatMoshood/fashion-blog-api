package com.aishatmoshood.fashionblog.util;

import com.aishatmoshood.fashionblog.models.User;
import com.aishatmoshood.fashionblog.repositories.UserRepository;
import jakarta.servlet.http.HttpSession;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class LoggedInUser {
    private final HttpSession httpSession;
    private  final UserRepository userRepository;

    public User findLoggedInUser() {
        Long id = (Long) httpSession.getAttribute("userId");
        return userRepository.findById(id).get();
    }
}
