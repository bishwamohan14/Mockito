package org.example.business;

import org.example.api.TodoService;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TodoBusinessImpl {
    private TodoService todoService;

    public TodoBusinessImpl(TodoService todoService) {
        this.todoService=todoService;
    }

    public List<String> retrieveTodosRelatedToString(String user){
        List<String> filteredTools = new ArrayList<>();
        List<String> todos = todoService.retrieveTodos(user);
        for(String todo:todos){
            if(todo.contains("string")){
                filteredTools.add(todo);
            }
        }
        return filteredTools;
    }

}

