package com.example.demo.servise;

import com.example.demo.dao.RoutesDAO;
import com.example.demo.entity.Routes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoutesService implements StandartService<Routes> {

    @Autowired
    RoutesDAO routesDAO;

    @Override
    public Routes getById(Long id) {
        return routesDAO.getOne(id);
    }

    @Override
    public List<Routes> getAll() {
        return routesDAO.findAll();
    }

    @Override
    public void save(Routes entity) {
        routesDAO.save(entity);
    }

    @Override
    public void delete(Long id) {
        routesDAO.deleteById(id);
    }
}
