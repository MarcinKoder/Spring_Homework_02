package pl.coderslab.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RedirectController {
    @RequestMapping("/first")
    public String first(){
        return "first";
    }
    @RequestMapping("/third")
    public String third(){
        return "third";
    }

}
