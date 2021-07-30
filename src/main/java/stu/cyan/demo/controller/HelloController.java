package stu.cyan.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicInteger;

@RestController
public class HelloController {
    private AtomicInteger count=new AtomicInteger(0);
    @GetMapping("/hello")
    public String hello(){
        return "hello world, 点击数："+count.incrementAndGet();
    }
}
