package com.almeida.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.almeida.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{
	

}
