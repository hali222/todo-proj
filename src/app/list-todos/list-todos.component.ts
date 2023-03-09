import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { TodoDataService } from '../service/data/todo-data.service';
import { WelcomeDataService } from '../service/data/welcome-data.service';
import { TodoComponent } from '../todo/todo.component';

export class Todo{
  constructor(
  public username:string,
  public id: Number,
  public description: string,
  public done: Boolean,
  public targetDate: Date,
  public count:Number
  ){}
}

@Component({
  selector: 'app-list-todos',
  templateUrl: './list-todos.component.html',
  styleUrls: ['./list-todos.component.css']
})


export class ListTodosComponent implements OnInit{
  user = ""
  todos : Todo[] = []
  message = ""
    //=[
    //new Todo(1, 'Learn Deutsch', false, new Date()),
    //new Todo(2, 'Tanzen', false, new Date()),
    //new Todo(3, 'Sport', false, new Date())

    // {Id: 1, describtion: 'Learn Deutsch'},
    // {Id: 2, describtion: 'Tanzen'},
    // {Id: 3, describtion: 'Sport'}]
  

  constructor(
    private service: TodoDataService,
    private router: Router
  ){}
  ngOnInit(){
    this.refreschTodoList();
  }
refreschTodoList(){
  this.service.retrieveAllTodos('hhh').subscribe(
    response => {
      console.log(response);
      this.todos= response;
  }
  )
}

  removeItem(Id : Number){
    this.service.removeItemService('hhh', Id).subscribe(
    response => {
     console.log(response);
     this.message = `Delete of Todo ${Id} Successful!`;
     this.refreschTodoList();
    },
    error => this.handleErrorResponse(error)
    )
  }

  removeFromList(){
    this.ngOnInit();
  }

  handleErrorResponse(error:ErrorEvent){
    console.log(error);
    console.log(error.error);
    console.log(error.error.message);
  }

  updateTodo(Id : Number){
    console.log(`update ${Id}`)
    this.router.navigate(['todos',Id])
  }
  addTodo(){
    console.log(`add Todo -1`)
    this.router.navigate(['todos',-1])
  }
}