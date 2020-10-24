package com.goFurther.ToDo.services;

import com.goFurther.ToDo.entities.TodoItem;
import com.goFurther.ToDo.repository.TodoItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class TodoItemService {
    @Autowired
    TodoItemRepository todoItemRepository;

    public TodoItem saveTodoItem(TodoItem item){
        return todoItemRepository.save(item);
    }

    public TodoItem getById(int id){
        return todoItemRepository.findById(id).orElseThrow();
    }

    public List<TodoItem> getAll(){
        return (List<TodoItem>) todoItemRepository.findAll();
    }
}
