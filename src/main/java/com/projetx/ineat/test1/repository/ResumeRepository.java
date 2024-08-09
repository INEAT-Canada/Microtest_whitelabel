package com.projetx.ineat.test1.repository;

import com.projetx.ineat.test1.entities.Resume;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Repository for {@link Resume} .
 */
public interface ResumeRepository extends JpaRepository<Resume, String>{


}
