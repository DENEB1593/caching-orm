package io.dev.deneb.service;

import io.dev.deneb.entity.Post;
import io.dev.deneb.repo.PostRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
@AllArgsConstructor
public class PostService {

  private final PostRepository postRepository;

  @Cacheable(cacheNames = "postCache")
  public List<Post> findAll() {
    return postRepository.findAll();
  }
}
