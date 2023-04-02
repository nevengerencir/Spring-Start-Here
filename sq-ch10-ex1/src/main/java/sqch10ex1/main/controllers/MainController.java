package sqch10ex1.main.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class MainController {
  @GetMapping("/home")

    public String helloWorld(){
      return "Hello World!";
  }
}
