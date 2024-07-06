package com.Lab2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {
    @RequestMapping("/helo.th")
    public String hello(Model model) {
        model.addAttribute("message", "FPT <b>Polytechnic</b>");
        return "helo";
    }
}
