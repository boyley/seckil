package com.danlu.seckil.user.service;

import com.danlu.seckil.entity.User;
import com.danlu.seckil.security.UserService;
import com.danlu.seckil.user.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

/**
 * Created by Danlu on 2017/7/17.
 */
@Service
public class DatabaseUserService implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public Optional<User> getByUsername(String username) {
        return userRepository.findByUsername(username);
    }
}
