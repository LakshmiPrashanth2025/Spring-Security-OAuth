package com.example.spring.SecurityApp.services;

import java.util.List;

import com.example.spring.SecurityApp.dto.PostDTO;

public interface PostService {

    List<PostDTO> getAllPosts();

    PostDTO createNewPost(PostDTO inputPost);

    PostDTO getPostById(Long postId);
}
