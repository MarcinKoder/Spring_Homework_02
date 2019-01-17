package pl.coderslab.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HeaderController {

    @RequestMapping("/showUserAgent")
    public String showUserAgent(Model model, @RequestHeader("user-agent") String userAgent) {
        model.addAttribute("userAgent",userAgent);
        return "userAgent";
    }

}
