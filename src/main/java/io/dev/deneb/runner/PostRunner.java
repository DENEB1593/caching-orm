package io.dev.deneb.runner;

import com.github.javafaker.Faker;
import io.dev.deneb.entity.Post;
import io.dev.deneb.repo.PostRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import java.util.stream.IntStream;

@Slf4j
@Configuration
@AllArgsConstructor
public class PostRunner implements CommandLineRunner {

  private PostRepository postRepository;


  @Override
  public void run(String... args) throws Exception {
    log.info("post runner start");
    Faker faker = new Faker();

    IntStream
        .rangeClosed(1, 100)
        .forEach(i -> {
          postRepository.save(
              new Post(faker.name().title(), faker.random().toString())
          );

        });


    log.info("post runner end");
  }
}
