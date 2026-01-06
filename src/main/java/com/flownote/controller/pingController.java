package com.flownote.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.time.LocalDateTime;
import java.util.Date;

@RestController
@RequestMapping("ping")
public class pingController {
    @GetMapping()
    public String ping() {
//         Logger logger = LoggerFactory.getLogger(pingController.class);
//         logger.info(LocalDateTime.now().toString());
        return "pong";
    }
}
