package com.halloWorld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class GithubActionsExampleApplication {

  @GetMapping("/message")
  public String foo() {
    return "This is github actions example project";
  }

  public static void main(String[] args) {
    SpringApplication.run(GithubActionsExampleApplication.class, args);
  }
}