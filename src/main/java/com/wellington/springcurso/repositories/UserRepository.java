package com.wellington.springcurso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.wellington.springcurso.entities.User;


public interface UserRepository extends JpaRepository<User,Long>{//User é a entidade, Long é o id da entidade
	//Não precisa implementar os métodos desta interface, pois a declaração dessa interface já é suficiente
}
