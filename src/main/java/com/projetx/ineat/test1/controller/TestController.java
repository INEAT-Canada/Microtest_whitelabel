package com.projetx.ineat.test1.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class TestController {

    @GetMapping("/test")
    public String getReceptionBySuccAndRF() {
        log.info("ahhhhhahahahh");
        String msg="hahahhahahahhahah";
        return msg;
    }
}
