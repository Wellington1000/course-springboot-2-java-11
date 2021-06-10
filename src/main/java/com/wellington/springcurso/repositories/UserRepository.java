package com.wellington.springcurso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.wellington.springcurso.entities.User;

//Poderia colocar uma anotação aqui, mas a própria interfacce se encarrega de resolver as pendências
public interface UserRepository extends JpaRepository<User,Long>{//User é a entidade, Long é o id da entidade
	//Não precisa implementar os métodos desta interface, pois a declaração dessa interface já é suficiente
}
