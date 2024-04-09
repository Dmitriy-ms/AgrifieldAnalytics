package com.agrifieldanalytics.repository;

import com.agrifieldanalytics.model.Field;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FieldRepository extends JpaRepository<Field, Long> {
}
