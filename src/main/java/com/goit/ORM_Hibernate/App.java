package com.goit.ORM_Hibernate;

import org.flywaydb.core.Flyway;

public class App {
    public static void main(String[] args) {
        Flyway flyway = Flyway.configure()
                .dataSource("jdbc:h2:./data/module12_BD", "", "")
                .baselineOnMigrate(true)
                .load();

        flyway.migrate();

    }
}
