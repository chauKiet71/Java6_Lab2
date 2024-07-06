package com.Lab2.controller;

import jakarta.servlet.ServletContext;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.net.http.HttpRequest;

@Controller
public class ScopeController {

    @Autowired
    HttpServletRequest request;

    @Autowired
    HttpSession session;

    @Autowired
    ServletContext servletContext;

    @RequestMapping("/scope")
    public String scope(Model model) {
        model.addAttribute("a", "I am in Model");
        model.addAttribute("b", "I am in Request Scope");
        session.setAttribute("c", "I am in Session Attribute");
        servletContext.setAttribute("d", "I am in Application Context");
        return "scope/index";
    }
}
