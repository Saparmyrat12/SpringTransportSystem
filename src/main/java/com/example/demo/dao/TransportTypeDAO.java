package com.example.demo.dao;

import com.example.demo.entity.TransportType;
import com.example.demo.entity.Transports;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransportTypeDAO extends JpaRepository<TransportType, Long> {
}
