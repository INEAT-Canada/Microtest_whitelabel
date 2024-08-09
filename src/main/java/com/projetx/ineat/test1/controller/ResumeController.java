package com.projetx.ineat.test1.controller;

import com.projetx.ineat.test1.dto.TestDto;
import com.projetx.ineat.test1.entities.Joker;
import com.projetx.ineat.test1.repository.JokerRepository;
import com.projetx.ineat.test1.service.ResumeService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Service
@Slf4j
@RequiredArgsConstructor
public class ResumeController {
    private final ResumeService service;

    @GetMapping("/resume")
    public ResponseEntity<String> getTest() {
        log.info("Controller : get text resume");
        return ResponseEntity.status(HttpStatus.OK).body(service.getTextResume());

    }

    @PutMapping("/resume")
    public ResponseEntity<Boolean> updateTextResume(@RequestBody String text) {
        log.info("Controller : text resume {}", text);
        return ResponseEntity.status(HttpStatus.OK).body(service.updateTextResume(text));
    }
}
