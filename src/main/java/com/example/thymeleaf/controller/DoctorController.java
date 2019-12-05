package com.example.thymeleaf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.*;


@Controller
public class DoctorController {

    @GetMapping("/doctor")
    public String doctor(Model model,
    @RequestParam(value="name", required=false, defaultValue="John Smith") String name,
    @RequestParam(value="number", required=false, defaultValue="0") int number) {

        model.addAttribute("doctorname", name);
        model.addAttribute("doctornumber", number);

        return "doctor";
    }
}
