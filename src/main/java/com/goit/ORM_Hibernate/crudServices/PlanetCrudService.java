package com.goit.ORM_Hibernate.crudServices;

import com.goit.ORM_Hibernate.dao.PlanetDaoImpl;
import com.goit.ORM_Hibernate.dao.PlanetDao;
import com.goit.ORM_Hibernate.entity.Planet;

import java.util.List;

public class PlanetCrudService {
    private final PlanetDao planetDao = new PlanetDaoImpl();

    public void create(Planet planet) {
        planetDao.save(planet);
    }

    public Planet read(String id) {
        return planetDao.findById(id);
    }

    public List<Planet> readAll() {
        return planetDao.findAll();
    }

    public void update(Planet planet) {
        planetDao.update(planet);
    }

    public void delete(String id) {
        planetDao.deleteById(id);
    }
}
