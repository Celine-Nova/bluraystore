package com.mycompany.bluraystore.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AboutUsController {
    @RequestMapping("/about")
    public String displayAboutUs(){
        System.out.println("La page about us a été affichée");
        return "about-us";
    }
}
