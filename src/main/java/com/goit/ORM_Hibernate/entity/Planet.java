package com.goit.ORM_Hibernate.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "planet")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Planet {
    @Id
    @Pattern(regexp = "^[A-Z0-9]+$")
    @Column(name = "id", nullable = false, length = 50)
    private String id;

    @Size(min = 1, max = 500)
    @Column(name = "name", nullable = false, length = 500)
    private String name;
}