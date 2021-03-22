package com.example.demo.dao;

import com.example.demo.entity.PlanOfStops;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlanOfStopsDAO extends JpaRepository<PlanOfStops, Long> {
}
