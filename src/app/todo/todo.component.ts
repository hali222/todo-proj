import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { Todo } from '../list-todos/list-todos.component';
import { TodoDataService } from '../service/data/todo-data.service';

@Component({
  selector: 'app-todo',
  templateUrl: './todo.component.html',
  styleUrls: ['./todo.component.css']
})
export class TodoComponent implements OnInit{
  id=0;
  todo:any

saveTodo(){
  if(this.id == -1){
    this.service.createItemService('hhh', this.todo).subscribe(
      data => {
        console.log("add")
        this.router.navigate(['todos'])
      })
  }else{
  this.service.updateItemService('hhh', this.id, this.todo).subscribe(
    data => {
      console.log(data)
      console.log("update")
      this.router.navigate(['todos'])
    }
  )}
}
constructor(
  private service: TodoDataService,
  private route: ActivatedRoute,
  private router: Router
){}

ngOnInit(){
  this.id = this.route.snapshot.params['id'];
  this.todo= new Todo("",this.id,"",true,new Date(),0)
  if(this.id != -1){
  this.getTodo();
  }
}

getTodo(){
this.service.retrieveTodo('hhh', this.id).subscribe(
  resoponse  => {
    console.log(resoponse);
    this.todo= resoponse;
}
)
}
}