package com.project.workshop01;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Arrays;
import java.util.List;

@Controller
public class IndexController {

    @GetMapping("/")
        public String randomString(Model model)
    {
        List<String> stringList = Arrays.asList("There are 10 kinds of people. Those who know binary and those who don't." ,
                "There are two ways of constructing a software design. One way is to make it so simple that there are obviously no deficiencies and the other is to make it so complicated that there are no obvious deficiencies.",
                "It's not that I'm so smart, it's just that I stay with problems longer.",
                "It is pitch dark. You are likely to be eaten by a grue.");
        int random = (int)(Math.floor(Math.random() * 4));
        model.addAttribute("indexmessage", stringList.get(random));
        model.addAttribute("link", "https://www.google.com.sg/");
        return "index";

    }

}
