package com.example.spring.SecurityApp.utils;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Component;

import com.example.spring.SecurityApp.dto.PostDTO;
import com.example.spring.SecurityApp.entities.User;
import com.example.spring.SecurityApp.services.PostService;

import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class PostSecurity {

    private  final PostService postService;

    public boolean isOwnerOfPost(Long postId) {
        User user = (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        PostDTO post = postService.getPostById(postId);
        return post.getAuthor().getId().equals(user.getId());
    }

}
