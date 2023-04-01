package com.halloWorld;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class CicdUsingGithubActionsApplicationTests {

  @Test
  void fooTest() {
    assertEquals(1, 5 - 4);
  }
}
