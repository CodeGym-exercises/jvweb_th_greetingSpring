package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class SpringGreetingController {
    @GetMapping("/greeting")
    public ModelAndView greeting(@RequestParam("name") String name){
        ModelAndView modelAndView = new ModelAndView("index");
        modelAndView.addObject("name",name);
        return modelAndView;
    }
    //link test: http://localhost:8080/greeting.html?name=join
}