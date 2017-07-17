package com.danlu.seckil.security;


import com.danlu.seckil.entity.User;

import java.util.Optional;

public interface UserService {
    public Optional<User> getByUsername(String username);
}
