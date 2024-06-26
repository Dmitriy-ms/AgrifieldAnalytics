package com.agrifieldanalytics.repository;

import com.agrifieldanalytics.model.ProductData;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductDataRepository extends JpaRepository<ProductData, Long> {
}
