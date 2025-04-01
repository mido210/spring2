package com.example.demo.smaple2;

import com.example.demo.smaple1.*;
import jakarta.annotation.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.*;

import java.util.*;

// @Component : 스프링빈을 만들어라 <- @Controller, @Service, @Repository
@Controller
public class Sample2Controller {
    private List<Todo> todos = new ArrayList<>();
    @PostConstruct
    public void init(){
        todos.add(new Todo(1,"영어 공부", false));
        todos.add(new Todo(1,"수학 공부",  true));
        todos.add(new Todo(1,"국어 공부", false));

    }
    @GetMapping("/for/list1")
    public ModelAndView list1(){
        return new ModelAndView("sample2/list1").addObject("todos",todos);
    }
}
