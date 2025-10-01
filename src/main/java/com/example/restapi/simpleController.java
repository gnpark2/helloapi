package com.example.restapi;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Map;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class SimpleController {

    @GetMapping("/hello")
    public Map<String, Object> sayHello() {
        return Map.of(
            "message", "Hello, World!",
            "timestamp", System.currentTimeMillis(),
            "koreatime", ZonedDateTime.now(ZoneId.of("Asia/Seoul")).toString()
        );
    }
}