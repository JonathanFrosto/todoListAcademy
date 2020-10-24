package com.goFurther.ToDo.repository;

import com.goFurther.ToDo.entities.TodoItem;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TodoItemRepository extends CrudRepository<TodoItem, Integer> {
}
