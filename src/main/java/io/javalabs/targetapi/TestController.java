package io.javalabs.targetapi;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/api")
public class TestController {
    
    @PostMapping("/test")
    public String test(@RequestBody String body) {
        return "{\"status\" : \"recieved\"}";
    }
    
}