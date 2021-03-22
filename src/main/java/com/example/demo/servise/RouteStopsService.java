package com.example.demo.servise;

import com.example.demo.dao.RouteStopsDAO;
import com.example.demo.entity.RouteStops;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class RouteStopsService implements StandartService<RouteStops> {

    @Autowired
    RouteStopsDAO routeStopsDAO;

    @Override
    public RouteStops getById(Long id) {
        return routeStopsDAO.getOne(id);
    }

    @Override
    public List<RouteStops> getAll() {
        return routeStopsDAO.findAll();
    }

    @Override
    public void save(RouteStops entity) {
        routeStopsDAO.save(entity);
    }

    @Override
    public void delete(Long id) {
        routeStopsDAO.deleteById(id);
    }
}
