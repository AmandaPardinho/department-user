//Repository: nome padrão para implementar objetos responsáveis por acessar dados relacionados a uma entidade no banco de dados
package com.classspringboot.userdept.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.classspringboot.userdept.entities.User;

public interface UserRepository extends JpaRepository <User, Long> {

    List<User> findAll();
    //JpaRepository: interface do Spring Data JPA que fornece métodos CRUD para a entidade User
    //User: entidade que será gerenciada pelo repositório
    //Long: tipo da chave primária da entidade User
} 
