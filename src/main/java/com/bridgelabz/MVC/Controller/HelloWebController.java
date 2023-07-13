package com.bridgelabz.MVC.Controller;

import com.bridgelabz.MVC.Model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
public class HelloWebController {
@GetMapping("/web")
    public String Hello(){
    return "Hello";
}
    @GetMapping("/web/message")
    public String message(Model model) {
        model.addAttribute("message","Hello from Bridgelabz");
        return "message";
    }

    @PostMapping("/login")
    public String greeting(@RequestBody User user){
        return "login";
    }

}
