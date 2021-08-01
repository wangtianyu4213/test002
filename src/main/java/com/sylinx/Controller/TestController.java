package com.sylinx.Controller;

import com.sylinx.service.AsyncService;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.web.bind.annotation.*;

@EnableAsync
@RestController
public class TestController {


    @GetMapping("/hello")
    public String test1(){
        return "hello world springboot!";
    }

    @PostMapping("/posthello")
    public String test2(){
        return "post hello world springboot!";
    }

    @DeleteMapping("/deletehello")
    public String test3(){
        return "delete hello world springboot!";
    }

    @GetMapping("/param/{abc}/{bcde}")
    public String test4(@PathVariable String abc, @PathVariable String bcde){
        return "hello param get!" + abc + " : " + bcde;
    }

    @GetMapping("/param9")
    public String test7(@PathVariable("userId") String abc, @PathVariable String passwd){
        return "hello param get!" + abc + " : " + passwd;
    }
}


