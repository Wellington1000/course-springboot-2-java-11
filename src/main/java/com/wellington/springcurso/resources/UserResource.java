package com.wellington.springcurso.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wellington.springcurso.entities.User;

@RestController
//Reponde no caminho "/users"
@RequestMapping(value = "/users")
public class UserResource {

	
	//Método end point para acessar usuários
	//Método que responde requisição do tipó get http
	
	@GetMapping
	public ResponseEntity<User> findall() {
		User u = new User(1L, "Maria", "maria@gmail.com","99999","12345");
		return ResponseEntity.ok().body(u);
	}
	
}
