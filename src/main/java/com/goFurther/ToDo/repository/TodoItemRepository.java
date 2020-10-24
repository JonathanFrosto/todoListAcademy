package com.goFurther.ToDo.repository;

import com.goFurther.ToDo.entities.TodoItem;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TodoItemRepository extends CrudRepository<TodoItem, Integer> {
    List<TodoItem> findAllByDone(boolean done);
}
