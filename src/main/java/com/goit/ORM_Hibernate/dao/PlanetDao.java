package com.goit.ORM_Hibernate.dao;

import com.goit.ORM_Hibernate.entity.Planet;

import java.util.List;

public interface PlanetDao {
    void save(Planet planet);

    Planet findById(String id);

    List<Planet> findAll();

    void update(Planet planet);

    void deleteById(String id);
}
