package com.Todo.rest.webservices.restfulwebservices.todo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;

@Service

public class TodoHardcodedService {
	/*
	 * public static List<Todo> todos = new ArrayList<Todo>(); private static long
	 * idCounter = 0;
	 * 
	 * 
	 * static { todos.add(new Todo(++idCounter,"MyTodos","Learn Deutsch",new
	 * Date(),false, 10)); todos.add(new Todo(++idCounter,"MyTodos","Tanzen",new
	 * Date(),false, 20)); todos.add(new Todo(++idCounter,"MyTodos","Sport 2",new
	 * Date(),false, 30)); todos.add(new
	 * Todo(++idCounter,"MyTodos","Learn Englisch",new Date(),false, 40));
	 * todos.add(new Todo(++idCounter,"MyTodos","Schwimmen",new Date(),false, 50));
	 * }
	 * 
	 * public List<Todo> findAll(){ return todos; }
	 * 
	 * public Todo deleteById(long id) { Todo todo = findById(id); if(todo == null)
	 * return null; if(todos.remove(todo)) { return todo;} return null; }
	 * 
	 * public Todo findById(long id) { Todo result = null; for(Todo todo:todos) {
	 * if(todo.getId()==id) { result =todo; } } return result; }
	 * 
	 * public Todo saveTodo(Todo todo) { if(todo.getId()==-1) {
	 * //todo.setId(++idCounter); todos.add(todo); } else {
	 * deleteById(todo.getId()); todos.add(todo); } return todo; }
	 * 
	 * public Todo updateTodo(Todo todoReq) { int index = 0; for(int i=0; i <
	 * todos.size(); i++) { if(todos.get(i).getId() == todoReq.getId()) index = i; }
	 * Todo todo = findById(todoReq.getId()); if (todo != null) todos.set(index,
	 * todoReq); return todo; }
	 */
}
