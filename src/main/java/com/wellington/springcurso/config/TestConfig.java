package com.wellington.springcurso.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.wellington.springcurso.entities.User;
import com.wellington.springcurso.repositories.UserRepository;

//Configuration define uma classe de configuração
//O nome "test" é o mesmo que está no arquivo application.properties; descrito na linha'spring.profiles.active=test'

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner{//'CommandLineRunner' executa quando o programa for iniciado

	
	@Autowired
	private UserRepository userRepository;
	//@Autowired Associa determinada instância a classe corrente

	@Override
	public void run(String... args) throws Exception {
		
		User u1 = new User(null, "Maria Brown","maria@gmail.com","98888","1234");
		User u2 = new User(null, "Alex Green","alex@gmail.com","9777","1234");
		
		 userRepository.saveAll(Arrays.asList(u1, u2));//Arrays.asList(u1, u2) cria uma lista, sendo que esta linha a salva
		
	}
	
	
	
	
}
