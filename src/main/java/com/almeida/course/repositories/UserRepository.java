package com.almeida.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.almeida.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
	

}
