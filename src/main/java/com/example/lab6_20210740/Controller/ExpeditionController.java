package com.example.lab6_20210740.Controller;

import com.example.lab6_20210740.Repository.ExpeditionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("")
public class ExpeditionController {

    @Autowired
    ExpeditionRepository expeditionRepository;

    @GetMapping(value = {"", "/"})
    public String listarExpediciones(Model model) {
        return "/principal";
    }
}
