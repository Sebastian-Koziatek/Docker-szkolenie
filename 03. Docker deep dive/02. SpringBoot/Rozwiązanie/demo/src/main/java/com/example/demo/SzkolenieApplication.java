package com.example.demo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SzkolenieApplication {

  @RequestMapping("/")
  public String getHome() {
    return "Szkolenie docker - aplikacja java zbudowana na spring";
  }
  @RequestMapping("/messages")
  public String getMessage() {
    return "Hello Messages Endpoint";
  }

  public static void main(String[] args) {
    SpringApplication.run(SzkolenieApplication.class, args);
  }

}