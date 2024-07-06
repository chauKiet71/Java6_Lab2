package com.Lab2.controller;

import com.Lab2.bean.Students;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Optional;

@Controller
public class StudentController {
    @RequestMapping("/student")
    public String student(@RequestParam("index") Optional<Integer> index, Model model) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        String file = "D:\\Ki6\\Java6\\src\\lab2\\src\\main\\java\\com\\Lab2\\bean\\students.json";
        TypeReference<List<Students>> typeref = new TypeReference<>() {};
        List<Students> students = mapper.readValue(new File(file), typeref);

        int i = index.orElse(0);
        model.addAttribute("n", i);
        model.addAttribute("sv", students.get(i));
        return "scope/student";
    }
}
