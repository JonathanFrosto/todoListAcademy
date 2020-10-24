package com.goFurther.ToDo.services;

import com.goFurther.ToDo.entities.TodoItem;
import org.springframework.stereotype.Component;

@Component
public class TodoItemService {
    

    public TodoItem saveTodoItem(TodoItem item){
        return item;
    }
}
