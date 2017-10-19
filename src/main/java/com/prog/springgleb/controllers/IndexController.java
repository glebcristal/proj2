package com.prog.springgleb.controllers;
import org.springframework.web.bind.annotation.PathVariable;
import com.prog.springgleb.domain.Person;
import com.prog.springgleb.service.PersonService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class IndexController {

    @RequestMapping("/")
    String main(){
        return "main";
    }


}


