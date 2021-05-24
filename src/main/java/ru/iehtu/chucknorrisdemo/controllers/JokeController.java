package ru.iehtu.chucknorrisdemo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.iehtu.chucknorrisdemo.services.JokeService;

@Controller
public class JokeController {

    private final JokeService jokeService;

    public JokeController(JokeService jokeService) {
        this.jokeService = jokeService;
    }

    @RequestMapping("/")
    public String showJoke(Model model){
        String s = "Hello, world";
        model.addAttribute("joke", jokeService.getJoke());

        return "index";
    }
}
