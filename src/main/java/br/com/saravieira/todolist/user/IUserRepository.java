package br.com.saravieira.todolist.user;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

public interface IUserRepository extends JpaRepository<UserModel, UUID> { //gerenciamento

    UserModel findByUsername(String username);
    
}
