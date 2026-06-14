package com.example.spring.SecurityApp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.spring.SecurityApp.entities.Session;
import com.example.spring.SecurityApp.entities.User;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;

public interface SessionRepository extends JpaRepository<Session, Long> {
    List<Session> findByUser(User user);

    Optional<Session> findByRefreshToken(String refreshToken);
}
