package com.agrifieldanalytics.repository;

import com.agrifieldanalytics.model.Profit;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProfitRepository extends JpaRepository<Profit, Long> {
}
