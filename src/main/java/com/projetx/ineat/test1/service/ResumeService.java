package com.projetx.ineat.test1.service;

import com.projetx.ineat.test1.entities.Resume;
import com.projetx.ineat.test1.repository.ResumeRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
@RequiredArgsConstructor
public class ResumeService {
    private final ResumeRepository repository;

    public Boolean updateTextResume(String text) {
        List<Resume> resumes = repository.findAll();
        Resume resume = null;
        if (resumes.isEmpty()) {
            resume = Resume.builder().id("cv").textResume(text).build();
        } else {
            resume = resumes.get(0);
            resume.setTextResume(text);
        }
        repository.save(resume);
        return true;
    }


    public String getTextResume() {
        List<Resume> resumes = repository.findAll();
        if (resumes.isEmpty()) {

        }

        Resume resume = resumes.get(0);
        return resume.getTextResume();
    }
}
