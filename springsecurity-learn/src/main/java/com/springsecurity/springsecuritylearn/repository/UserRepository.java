package com.springsecurity.springsecuritylearn.repository;

import com.springsecurity.springsecuritylearn.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, String> {

    public User findByusername(String username);
}
