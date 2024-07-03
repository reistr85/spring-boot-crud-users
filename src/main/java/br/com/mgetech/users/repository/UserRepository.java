package br.com.mgetech.users.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.mgetech.users.model.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
