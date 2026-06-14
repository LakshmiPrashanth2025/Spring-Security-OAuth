package com.example.spring.SecurityApp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.spring.SecurityApp.entities.PostEntity;

@Repository
public interface PostRepository extends JpaRepository<PostEntity, Long> {
}
