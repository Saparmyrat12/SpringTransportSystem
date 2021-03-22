package com.example.demo.servise;

import java.util.List;

public interface StandartService<T> {
    T getById(Long id);

    List<T> getAll();

    void save(T entity);

    void delete(Long id);
}
