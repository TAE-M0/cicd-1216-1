package com.example.cicd1216_1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/hicicd")
    public String hicicd(){

        return "hicicd 1216";
    }

    @GetMapping("/hicicd2")
    public String hicicd2(){

        return "새로운 개발";
    }
}
