package com.goFurther.ToDo.services;

import com.goFurther.ToDo.entities.TodoItem;
import com.goFurther.ToDo.repository.TodoItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
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

    public List<TodoItem> getAllDone(boolean done){
//        List<TodoItem> allItems = (List<TodoItem>) todoItemRepository.findAll();
//        List<TodoItem> trueItems = new ArrayList<>();
//        for (TodoItem item: allItems){
//            if (item.getDone()){
//                trueItems.add(item);
//            }
//        }
        return todoItemRepository.findAllByDone(done);
    }

    public List<TodoItem> getAllNotDone(){
        List<TodoItem> allItems = (List<TodoItem>) todoItemRepository.findAll();
        List<TodoItem> falseItems = new ArrayList<>();
        for (TodoItem item: allItems){
            if (!item.getDone()){
                falseItems.add(item);
            }
        }
        return falseItems;
    }

    public void removeById(int id){
        todoItemRepository.deleteById(id);
    }

    public TodoItem updateItem(int id, TodoItem otherValues){
        TodoItem myItem = this.getById(id);
        myItem.setDone(otherValues.getDone());
        myItem.setContent(otherValues.getContent());

//        this.removeById(id);
        return this.saveTodoItem(myItem);
    }

    public String descriptionItem(int id){
        return this.getById(id).getContent();
    }
}
