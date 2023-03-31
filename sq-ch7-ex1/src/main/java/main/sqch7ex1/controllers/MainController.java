package main.sqch7ex1.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;



@Controller
public class MainController {
    @RequestMapping("/home/{color}")
    public String home(
            @RequestParam(required = false) String name,
            @PathVariable String color,
    Model page) {
        page.addAttribute("username", name);
        page.addAttribute("color", color);
        return "test.html";
    }
}
