package com.Todo.rest.webservices.restfulwebservices.todo;

import java.net.URI;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class TodoResource {

	@Autowired
	private TodoRepository todoRepository;
	
	//alle todos nehmen
	@GetMapping("/users/{username}/todos")
	public Iterable<Todo> getAllTodos(@PathVariable String username) {
		return todoRepository.findAll();
	}
	
	//ein todo nehmen
	@GetMapping("/users/{username}/todos/{id}")
	public Todo getTodo(@PathVariable String username, @PathVariable long id) {
		Optional<Todo> todo = todoRepository.findById(id);
		return todo.get();
	}

	//todo löschen
	@DeleteMapping("/users/{username}/todos/{id}")
	public ResponseEntity<?> deleteTodo(@PathVariable String username, @PathVariable long id) {
		todoRepository.deleteById(id);
		return ResponseEntity.noContent().build();
	}
	
	//todo aktualisieren
	@PutMapping("/users/{username}/todos/{id}")
	public ResponseEntity<Todo> updateTodo(@PathVariable String username, @PathVariable long id,
			@RequestBody Todo todo) {
		todoRepository.save(todo);
		return new ResponseEntity<Todo>(todo, HttpStatus.OK);
	}
	
	//todo hinzufügen
	@PostMapping("/users/{username}/todos")
	public ResponseEntity<Void> createTodo(@PathVariable String username, @RequestBody Todo todo) {
		Todo createdTodo = todoRepository.save(todo);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(createdTodo.getId())
				.toUri();
		return ResponseEntity.created(uri).build();
	}
}
