package com.example.demo.dao;

import com.example.demo.entity.Plans;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlansDAO extends JpaRepository<Plans, Long> {
}
