package com.Todo.rest.webservices.restfulwebservices;
import com.Todo.rest.webservices.restfulwebservices.todo.TodoHardcodedService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceTransactionManagerAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;

import com.Todo.rest.webservices.restfulwebservices.todo.TodoHardcodedService;

@SpringBootApplication
public class RestfulWebServicesApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestfulWebServicesApplication.class, args);
		
		TodoHardcodedService td = new TodoHardcodedService();
		//td.delete(2);
		//System.out.println(td.todos.get(0).getId());
		//System.out.println(td.todos.size());
		
	}
}
