package sqch9ex1.main.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class LoginController {

    private final LoginProcessor processor;
@Autowired
    public LoginController(LoginProcessor processor) {
        this.processor = processor;
    }

    @GetMapping("/")
    public String LoginGet(){
        boolean login = processor.login();

        if(login){
            return "redirect:/main";
        }
        return "login.html";
    }
    @PostMapping("/")
    public String loginPost(
            @RequestParam String username,
            @RequestParam String password,
            Model model
    ) {
        processor.setPassword(password);
        processor.setUsername(username);



        if (processor.login()) {

            return "redirect:/main";
        } else {
            model.addAttribute("message", "Login failed!");
        }
        return "login.html";
    }
}

