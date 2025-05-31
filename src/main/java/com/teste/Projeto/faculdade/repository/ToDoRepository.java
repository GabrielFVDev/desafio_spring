package com.teste.Projeto.faculdade.repository;

import com.teste.Projeto.faculdade.model.ToDo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ToDoRepository extends JpaRepository<ToDo, Long> {
    // JpaRepository provides basic CRUD operations, no need to define methods here
}
