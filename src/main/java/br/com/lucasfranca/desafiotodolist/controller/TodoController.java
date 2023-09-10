package br.com.lucasfranca.desafiotodolist.controller;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.lucasfranca.desafiotodolist.entity.Todo;
import br.com.lucasfranca.desafiotodolist.service.TodoService;

@RestController
@RequestMapping("/todos")
public class TodoController {

    private TodoService todoService;

    public TodoController(TodoService todoService) {
        this.todoService = todoService;
    }

    List<Todo> create(Todo todo) {
        return todoService.create(todo);

    }

}
