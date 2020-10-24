package com.goFurther.ToDo.services;

import com.goFurther.ToDo.entities.TodoItem;
import com.goFurther.ToDo.repository.TodoItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TodoItemService {
    @Autowired
    TodoItemRepository todoItemRepository;

    public TodoItem saveTodoItem(TodoItem item){
        return todoItemRepository.save(item);
    }
}
