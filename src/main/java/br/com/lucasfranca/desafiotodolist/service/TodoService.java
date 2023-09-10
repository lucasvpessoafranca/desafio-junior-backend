package br.com.lucasfranca.desafiotodolist.service;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import br.com.lucasfranca.desafiotodolist.entity.Todo;
import br.com.lucasfranca.desafiotodolist.repository.TodoRepository;

@Service
public class TodoService {

    private TodoRepository todoRepository;

    public TodoService(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    // public List<Todo> create(Todo todo) {
    // todoRepository.save(todo);
    // }

    public List<Todo> list() {
        Sort sort = Sort.by("prioridade").descending().and(
                Sort.by(
                        "nome").ascending());
        return todoRepository.findAll(sort);

    }

    // public List<Todo> update() {

    // }

    // public List<Todo> delete() {

    // }

}