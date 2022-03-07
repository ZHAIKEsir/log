package com.example.log.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ZHAIKE
 * @date 2022/03/04 14:52
 */
@RestController
@RequestMapping("/test")
@Slf4j
public class TestController {

    @GetMapping("/log")
    public void log() {
        log.info("welcome log!");
        log.error("welcome error log!");
        log.warn("welcome warn log!");
    }
}
