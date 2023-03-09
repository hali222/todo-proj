import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Todo } from 'src/app/list-todos/list-todos.component';

@Injectable({
  providedIn: 'root'
})
export class TodoDataService {

  constructor(
    private http: HttpClient
  ) { }

  retrieveAllTodos(username: string){
  return this.http.get<Todo[]>(`http://localhost:8080/users/${username}/todos`);
    //console.log("Execute Hello World Been Servise")
  }

  retrieveTodo(username: string, id:Number){
    return this.http.get<Todo>(`http://localhost:8080/users/${username}/todos/${id}`);
      //console.log("Execute Hello World Been Servise")
    }

  removeItemService(username: string, id:Number){
    return this.http.delete(`http://localhost:8080/users/${username}/todos/${id}`);
      //console.log("Execute Hello World Been Servise")
    }
  
  updateItemService(username: string, id:Number, todo:Todo){
    return this.http.put(`http://localhost:8080/users/${username}/todos/${id}`,todo);
  }
  createItemService(username: string, todo:Todo){
    return this.http.post(`http://localhost:8080/users/${username}/todos/`,todo);
  }
}
