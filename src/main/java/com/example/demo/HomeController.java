package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class HomeController {

    @GetMapping("/tvform")
    public String LoadFormPage(Model model)
    {
        model.addAttribute("tvobj", new Tvshow());
        return "tvform";
    }

    @PostMapping("/tvform")
    public String LoadFromPage(@ModelAttribute Tvshow tvobj, Model model)
    {
        model.addAttribute("mytvvar", tvobj);
        return "confirmtv";
    }
}
