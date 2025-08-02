package com.goit.ORM_Hibernate;

import com.goit.ORM_Hibernate.crudServices.ClientCrudService;
import com.goit.ORM_Hibernate.crudServices.PlanetCrudService;
import com.goit.ORM_Hibernate.entity.Client;
import com.goit.ORM_Hibernate.entity.Planet;


public class TestCrudOperations {
    public static void main(String[] args) {
        ClientCrudService clientService = new ClientCrudService();
        PlanetCrudService planetService = new PlanetCrudService();
        //User
        //Create
        Client newClient = new Client();
        newClient.setName("Simon Bratz");
        clientService.create(newClient);
        //Read
        Client readClient = clientService.read(4L);
        System.out.println("Client with id 4 " + readClient);
        //Update
        newClient.setName("Simon Rodriges");
        clientService.update(newClient);
        //Delete
        clientService.delete(14L);

        //Planet
        //Create
        Planet newPlanet = new Planet();
        newPlanet.setId("PLNT");
        newPlanet.setName("PLANET");
        planetService.create(newPlanet);
        //Read
        Planet readPlanet = planetService.read("SAT");
        System.out.println(readPlanet);
        //Update
        newPlanet.setName("Updated Planet");
        planetService.update(newPlanet);
        //Delete
        planetService.delete("PLNT");

    }
}
