package sqch9ex1.main.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {

    @GetMapping("/")
    public String LoginGet(){
        return "login.html";
    }
    @PostMapping("/")
    public String loginPost(
            @RequestParam String username,
            @RequestParam String password,
            Model model
    ) {
        LoginProcessor processor = new LoginProcessor(username,password);
        boolean loggedIn = false;
        if (processor.login()) {
            model.addAttribute("message", "You are now logged in.");
        } else {
            System.out.println(username);
            System.out.println(password);

            model.addAttribute("message", "Login failed!");
        }
        return "login.html";
    }
}

