package com.danlu.seckil.user.repository;

import com.danlu.seckil.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Optional;

/**
 * Created by Danlu on 2017/7/17.
 */
public interface UserRepository extends JpaRepository<User, Long> {

    @Query("select u from User u where u.username=:username")
    Optional<User> findByUsername(@Param("username") String username);
}
