package com.example.demo.servise;

import com.example.demo.dao.PlanOfStopsDAO;
import com.example.demo.entity.PlanOfStops;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlansOfStopsService implements StandartService<PlanOfStops> {

    @Autowired
    PlanOfStopsDAO planOfStopsDAO;

    @Override
    public PlanOfStops getById(Long id) {
        return planOfStopsDAO.getOne(id);
    }

    @Override
    public List<PlanOfStops> getAll() {
        return planOfStopsDAO.findAll();
    }

    @Override
    public void save(PlanOfStops entity) {
        planOfStopsDAO.save(entity);
    }

    @Override
    public void delete(Long id) {
        planOfStopsDAO.deleteById(id);
    }
}
