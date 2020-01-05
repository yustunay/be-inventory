package com.in28minutes.rest.webservices.restfulwebservices.product;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class ProductResource {

	@Autowired
	private ProductRepository productRepository;
	
	@GetMapping("/products")
	public List<Product> getAllProducts() {
		return productRepository.findAll();
	}
	
	@GetMapping("/products/{barcode}")
	public Product getProduct(@PathVariable String barcode){
		return productRepository.findByBarcode(barcode);
	}
	

//	@DeleteMapping("/jpa/users/{username}/todos/{id}")
//	public ResponseEntity<Void> deleteTodo(@PathVariable String username, @PathVariable long id){
//		todoJpaRepository.deleteById(id);
//		return ResponseEntity.noContent().build();
//	}
//
//	@PutMapping("/jpa/users/{username}/todos/{id}")
//	public ResponseEntity<Todo> updateTodo(@PathVariable String username, @PathVariable long id, @RequestBody Todo todo){		
//		todoJpaRepository.save(todo);		
//		return new ResponseEntity<>(todo,HttpStatus.OK);
//	}
//	
//	@PostMapping("/jpa/users/{username}/todos")
//	public ResponseEntity<Void> createTodo(@PathVariable String username, @RequestBody Todo todo){
//		todo.setUsername(username);
//		final Todo createdTodo = todoJpaRepository.save(todo);
//		
//		//Location
//		//Get current resource url
//		//{id}
//		final URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(createdTodo.getId()).toUri();			
//		return ResponseEntity.created(uri).build();
//	}

}
