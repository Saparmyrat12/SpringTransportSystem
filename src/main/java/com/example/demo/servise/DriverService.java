package com.example.demo.servise;

import com.example.demo.dao.DriversDAO;
import com.example.demo.entity.Drivers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class DriverService implements StandartService<Drivers> {

    @Autowired
    DriversDAO driversDAO;

    @Override
    public Drivers getById(Long id) {
        return driversDAO.getOne(id);
    }

    @Override
    public List<Drivers> getAll() {
        return driversDAO.findAll();
    }

    @Override
    public void save(Drivers entity) {
        driversDAO.save(entity);
    }

    @Override
    public void delete(Long id) {
        driversDAO.deleteById(id);
    }
}
