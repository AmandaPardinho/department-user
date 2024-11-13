package com.classspringboot.userdept.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_department")
public class Department {

    @Id //indica que o atributo é uma chave primária desta tabela
    @GeneratedValue(strategy = GenerationType.IDENTITY) //indica que o valor será gerado automaticamente pelo banco de dados
    private Long id;
    private String name;
    
    public Department() {
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
