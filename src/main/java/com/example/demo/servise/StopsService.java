package com.example.demo.servise;

import com.example.demo.dao.StopsDAO;
import com.example.demo.entity.Stops;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class StopsService implements StandartService<Stops> {

    @Autowired
    StopsDAO stopsDAO;

    @Override
    public Stops getById(Long id) {
        return stopsDAO.getOne(id);
    }

    @Override
    public List<Stops> getAll() {
        return stopsDAO.findAll();
    }

    @Override
    public void save(Stops entity) {
        stopsDAO.save(entity);
    }

    @Override
    public void delete(Long id) {
        stopsDAO.deleteById(id);
    }
}
