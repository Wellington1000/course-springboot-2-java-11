package com.wellington.springcurso.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wellington.springcurso.entities.User;
import com.wellington.springcurso.services.UserService;

//Reponde no caminho "/users"
@RestController
@RequestMapping(value = "/users")
public class UserResource { //Essa é a classe Controlador Rest

	@Autowired
	private UserService service; //UserResource depende de UserService. UserService será injetado automaticamente na variável 'service' por meio da anotação '@Autowired'. Entretanto, para que isso funcione,a classe 'UserService' tem que está registrada como componente do SpringBoot, devendo ser definida na classe 'UserService'
	
	
	@GetMapping
	public ResponseEntity<List<User>> findall() {//Método end point para acessar usuários //Método que responde requisição do tipo get http
		List<User> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}
	
	
	//A anotação abaixa indica que a requisição aceita um id dentro da url
	@GetMapping(value = "/{id}")
	public ResponseEntity<User> findById(@PathVariable Long id) {//A notação '@PathVariable' é para o SptringBoot considerar o parâmetro id da url 
		User obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
	}
	
}
