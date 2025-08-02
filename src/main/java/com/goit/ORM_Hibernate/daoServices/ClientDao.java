package com.goit.ORM_Hibernate.daoServices;


import com.goit.ORM_Hibernate.entity.Client;

import java.util.List;

public interface ClientDao {
    void save(Client client);

    Client findById(Long id);

    List<Client> findAll();

    void update(Client client);

    void deleteById(Long id);
}
