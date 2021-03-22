package com.example.demo.servise;

import com.example.demo.dao.PlansDAO;
import com.example.demo.entity.Plans;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class PlansService implements StandartService<Plans> {

    @Autowired
    PlansDAO plansDAO;

    @Override
    public Plans getById(Long id) {
        return plansDAO.getOne(id);
    }

    @Override
    public List<Plans> getAll() {
        return plansDAO.findAll();
    }

    @Override
    public void save(Plans entity) {
        plansDAO.save(entity);
    }

    @Override
    public void delete(Long id) {
        plansDAO.deleteById(id);
    }
}
