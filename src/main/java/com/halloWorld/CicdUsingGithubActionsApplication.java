package com.halloWorld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class CicdUsingGithubActionsApplication {

  @GetMapping("/home")
  public String foo() {
    return "Hi There. This is very sample application to perform ci-cd using GitHub actions";
  }

  public static void main(String[] args) {
    SpringApplication.run(CicdUsingGithubActionsApplication.class, args);
  }
}
