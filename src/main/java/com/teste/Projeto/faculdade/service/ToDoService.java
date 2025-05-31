package com.teste.Projeto.faculdade.service;

import com.teste.Projeto.faculdade.model.ToDo;
import com.teste.Projeto.faculdade.repository.ToDoRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ToDoService {
    private final ToDoRepository toDoRepository;

    public ToDoService(ToDoRepository toDoRepository) {
        this.toDoRepository = toDoRepository;
    }

    public List<ToDo> findAll() {
        return toDoRepository.findAll();
    }

    public Optional<ToDo> findById(Long id) {
        return toDoRepository.findById(id);
    }

    public ToDo save(ToDo toDo) {
        return toDoRepository.save(toDo);
    }

    public void deleteById(Long id) {
        toDoRepository.deleteById(id);
    }
}
