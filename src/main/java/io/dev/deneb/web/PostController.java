package io.dev.deneb.web;

import io.dev.deneb.entity.Post;
import io.dev.deneb.repo.PostRepository;
import io.dev.deneb.service.PostService;
import lombok.AllArgsConstructor;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/post")
@AllArgsConstructor
public class PostController {

  private final PostService postService;

  @GetMapping
  public List<Post> findAll() {
    return postService.findAll();
  }


}
