package com.Todo.rest.webservices.restfulwebservices.helloworld;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins="http://localhost:4200")
public class HelloWorldController {
	
	//@RequestMapping(method = RequestMethod.GET, path = "/hello-world")
   @GetMapping(path="/hello-world")
	public String helloWorld() {
		return "Hello World";
}
   @GetMapping(path="/hello-world-been")
  	public HelloWorldBeen helloWorldBeen() {
	   //throw new RuntimeException("Some Error Has Happend! Please Contact With Halima");
  		return new HelloWorldBeen("Hello World");
  } 
   
   @GetMapping(path="/hello-world/path-variable/{name}")
 	public HelloWorldBeen helloWorldBeenPathVariable(@PathVariable String name) {
 		return new HelloWorldBeen(String.format("Hello World, %s", name));
 } 
}
 