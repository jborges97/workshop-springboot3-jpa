package com.educandoweb.course.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.course.entities.Product;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends CrudRepository<Product, Long> {


}
