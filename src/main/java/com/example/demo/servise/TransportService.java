package com.example.demo.servise;

import com.example.demo.dao.TransportsDAO;
import com.example.demo.entity.Transports;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TransportService implements StandartService<Transports> {
    @Autowired
    TransportsDAO transportsDAO;

    @Override
    public Transports getById(Long id) {
        return transportsDAO.getOne(id);
    }

    @Override
    public List<Transports> getAll() {
        return transportsDAO.findAll();
    }

    @Override
    public void save(Transports entity) {
        transportsDAO.save(entity);
    }

    @Override
    public void delete(Long id) {
        transportsDAO.deleteById(id);
    }
}
