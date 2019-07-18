package com.melt.petclinic.services;

import java.util.Set;

public interface CrudService<T, ID> {

    T findById(Long id);

    T save(T obj);

    Set<T> findAll();

    void delete(T obj);

    void deleteById(ID id);
}
