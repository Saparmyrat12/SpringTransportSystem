package com.example.demo.servise;

import com.example.demo.dao.TransportTypeDAO;
import com.example.demo.dao.TransportsDAO;
import com.example.demo.entity.TransportType;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class TrasnportTypeService implements StandartService<TransportType> {

    @Autowired
    TransportTypeDAO transportTypeDAO;

    @Override
    public TransportType getById(Long id) {
        return transportTypeDAO.getOne(id);
    }

    @Override
    public List<TransportType> getAll() {
        return transportTypeDAO.findAll();
    }

    @Override
    public void save(TransportType entity) {
        transportTypeDAO.save(entity);
    }

    @Override
    public void delete(Long id) {
        transportTypeDAO.deleteById(id);
    }
}
