package com.goFurther.ToDo.controller;

import com.goFurther.ToDo.entities.TodoItem;
import com.goFurther.ToDo.services.TodoItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/todo")
public class TodoItemController {

    @Autowired
    TodoItemService todoItemService;

    @PostMapping
    public ResponseEntity<TodoItem> postItems(@RequestBody TodoItem item){
        todoItemService.saveTodoItem(item);
        return ResponseEntity.ok(item);
    }

    @GetMapping
    public ResponseEntity<List<TodoItem>> getAllItem(){
        List<TodoItem> myList = todoItemService.getAll();
        return ResponseEntity.ok(myList);
    }

    @GetMapping("/{id}")
    public ResponseEntity<TodoItem> getById(@PathVariable int id){
        TodoItem myItem = todoItemService.getById(id);
        return ResponseEntity.ok(myItem);
    }

    @GetMapping("/tasks")
    public ResponseEntity<List<TodoItem>> getAllCompleted(@RequestParam("done") boolean done ){
        List<TodoItem> myList = todoItemService.getAllDone(done);
        return ResponseEntity.ok(myList);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteById(@PathVariable int id){
        todoItemService.removeById(id);
        return ResponseEntity.ok("deleted");
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<TodoItem> updateItemById(@PathVariable int id, @RequestBody TodoItem newItem){
        TodoItem newObj = todoItemService.updateItem(id, newItem);
        return ResponseEntity.ok(newObj);
    }

    @GetMapping("/{id}/description")
    public ResponseEntity<String> getDescriptionItem(@PathVariable int id){
        return ResponseEntity.ok(todoItemService.descriptionItem(id));
    }
}
