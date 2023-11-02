package com.example.email.controller;

import com.example.email.model.Registration;
import com.example.email.service.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping(value = "/registration")
public class RegistrationController {
    private static final String REGISTRATION = "Registration";
    @Autowired
    private EmailService emailService;

    @GetMapping("/form")//this is entry point url to hit and include registration object to binding
    public String showRegistrationForm(Model model) {
        model.addAttribute("registration", new Registration());
        return "registration";
    }

    @PostMapping("/save")
    public String successRegistration(@ModelAttribute Registration registration) throws IOException {
        Map<String, Object> templateModel = new HashMap<>();
        templateModel.put("username", registration.getUserName());
        emailService.sendHtmlEmail(registration.getEmail(), REGISTRATION, "mailtemplate.html", templateModel);//define mail template and define hashmap to send value into template
        return "success_registration";
    }
}
