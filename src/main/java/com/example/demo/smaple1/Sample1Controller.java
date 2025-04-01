package com.example.demo.smaple1;

import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.*;

@Controller
public class Sample1Controller {
    @GetMapping("/if/test1")
    public ModelAndView test1(){
        String username= "spring";
        return new ModelAndView("sample1/test1").addObject("username",username);
    }
    @GetMapping("/if/test2")
    public ModelAndView test2(){
        Todo todo = new Todo(1,"집안대청소",false);
        return new ModelAndView("sample1/test2").addObject("todo",todo);
    }


    @GetMapping("if/test3")
    public  ModelAndView test3(){
        Sungjuck sungjuck = new Sungjuck("홍길동",80);
        return new ModelAndView("sample1/test3").addObject("sungjuck",sungjuck);
    }


}
