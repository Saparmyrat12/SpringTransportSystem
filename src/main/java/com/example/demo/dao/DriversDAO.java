package com.example.demo.dao;

import com.example.demo.entity.Drivers;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DriversDAO extends JpaRepository<Drivers, Long> {
}
