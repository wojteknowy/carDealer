package pl.sda.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/index")
public class WelcomDataController {
    @RequestMapping(method = RequestMethod.GET)
    public String welcome(Model model){
        model.addAttribute("index", "index");
    return "index";
    }
}
