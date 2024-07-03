package com.projetx.ineat.test1.controller;

import com.projetx.ineat.test1.dto.TestDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class TestController {

    @GetMapping("/test")
    public TestDto getTest() {
        log.info("ahhhhhahahahh");
        TestDto testDto = TestDto.builder().lastname("HAHAHHAH").name("Joker").build();
        return testDto;
    }
}
