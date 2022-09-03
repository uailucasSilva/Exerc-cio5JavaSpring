package com.lucky.excinco.controller;

import java.util.Random;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @GetMapping("home")
    public String home(Model model) {
        Random ger = new Random();
        int nro[] = new int[6];

        for (int i = 0; i < nro.length; i++) {
            nro[i] = ger.nextInt(61);
        }

        model.addAttribute("nro0", nro[0]);
        model.addAttribute("nro1", nro[1]);
        model.addAttribute("nro2", nro[2]);
        model.addAttribute("nro3", nro[3]);
        model.addAttribute("nro4", nro[4]);
        model.addAttribute("nro5", nro[5]);
        return "index";
    }
}
