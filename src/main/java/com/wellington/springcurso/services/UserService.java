package com.wellington.springcurso.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wellington.springcurso.entities.User;
import com.wellington.springcurso.repositories.UserRepository;


@Service
public class UserService { // A anotação '@Component' registra a classe como um componente do SpringBoot. Como essa classe é de serviço, então a anotação '@Service' se encaixa semanticamente melhor

	@Autowired
	private UserRepository repository; //@Autowired associa 'repository' a classe UserService, realizando assim injeção de dependêcia 
	
	
	//Fazendo uma operação na camada de serviço por meio de 'public List<User> findAll() {...}', na qual repassa a chamada para o 'repository.findAll();'  
	public List<User> findAll() {
		return repository.findAll();
	}
	
	
	public User findById(Long id) {
		Optional<User> obj = repository.findById(id);
		return obj.get();
	}
	
}
