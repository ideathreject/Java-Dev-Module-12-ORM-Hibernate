package com.goit.ORM_Hibernate.crudServices;

import com.goit.ORM_Hibernate.dao.ClientDaoImpl;
import com.goit.ORM_Hibernate.dao.ClientDao;
import com.goit.ORM_Hibernate.entity.Client;

import java.util.List;

public class ClientCrudService {
    private final ClientDao clientDao = new ClientDaoImpl();

    public void create(Client client) {
        clientDao.save(client);
    }

    public Client read(Long id) {
        return clientDao.findById(id);
    }

    public List<Client> readAll() {
        return clientDao.findAll();
    }

    public void update(Client client) {
        clientDao.update(client);
    }

    public void delete(Long id) {
        clientDao.deleteById(id);
    }
}
