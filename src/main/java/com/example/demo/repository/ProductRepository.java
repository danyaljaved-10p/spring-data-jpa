package com.example.demo.repository;

import com.example.demo.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Long> {
  Product findByProductName(String productName);
  List<Product> findByStudentId(Long id);
  List<Product> findByStudentFirstName(String firstName);
//  List<Product> findByStudentFirstNameOrLastName(String firstName, String lastName);

}
