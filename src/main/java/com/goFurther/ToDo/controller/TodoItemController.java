package com.goFurther.ToDo.controller;

import com.goFurther.ToDo.entities.TodoItem;
import com.goFurther.ToDo.services.TodoItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController("/todo")
public class TodoItemController {

    @Autowired
    TodoItemService todoItemService;

    @PostMapping
    public ResponseEntity<TodoItem> postItems(@RequestBody TodoItem item){
        todoItemService.saveTodoItem(item);
        return ResponseEntity.ok(item);
    }


}
