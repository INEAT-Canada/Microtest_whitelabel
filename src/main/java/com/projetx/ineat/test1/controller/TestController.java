package com.projetx.ineat.test1.controller;

import com.projetx.ineat.test1.dto.TestDto;
import com.projetx.ineat.test1.entities.Joker;
import com.projetx.ineat.test1.repository.JokerRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class TestController {
    @Autowired
    private JokerRepository repository;

    @GetMapping("/test")
    public Joker getTest() {
        log.info("ahhhhhahahahh");
        Joker joker = repository.save(Joker.builder().id("hahahah").crime("kill the bat").name("Arthur").build());
        TestDto testDto = TestDto.builder().lastname("HAHAHHAH").name("Joker").build();
        return joker;
    }
}
