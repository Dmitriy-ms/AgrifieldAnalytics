package com.agrifieldanalytics.repository;

import com.agrifieldanalytics.model.Culture;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CultureRepository extends JpaRepository<Culture, Long> {
}
