package com.projetx.ineat.test1.repository;

import com.projetx.ineat.test1.entities.Joker;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * Repository for {@link com.projetx.ineat.test1.entities.Joker} .
 */
public interface JokerRepository extends JpaRepository<Joker, String>, JpaSpecificationExecutor<Joker> {


}
