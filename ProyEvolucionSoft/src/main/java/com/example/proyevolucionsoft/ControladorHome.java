package com.example.proyevolucionsoft;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/home")
public class ControladorHome {

    @GetMapping("")
    public String home(){
        return "home";

    }

}