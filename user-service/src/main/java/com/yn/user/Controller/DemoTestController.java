package com.yn.user.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoTestController {
    @GetMapping
    public String test() {
        return "test";
    }
}
