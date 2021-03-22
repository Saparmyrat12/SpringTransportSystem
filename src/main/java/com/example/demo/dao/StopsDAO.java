package com.example.demo.dao;

import com.example.demo.entity.Stops;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StopsDAO extends JpaRepository<Stops, Long> {

}
