package com.example.communitex.advancedwebsocketchat.repository;

import org.apache.catalina.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface userRepository extends JpaRepository<User, Long> {

    Optional<User> findByUsername(String username);
}
