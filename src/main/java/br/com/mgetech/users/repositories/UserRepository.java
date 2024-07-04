package br.com.mgetech.users.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.mgetech.users.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
