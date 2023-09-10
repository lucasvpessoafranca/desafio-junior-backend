package br.com.lucasfranca.desafiotodolist.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.lucasfranca.desafiotodolist.entity.Todo;

public interface TodoRepository extends JpaRepository<Todo, Long> {

}
