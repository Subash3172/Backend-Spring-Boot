package com.example.demo.repo;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Books;

//repository that extends JpaRepository  
public interface BooksRepository extends JpaRepository<Books, Integer>  
{  
    
}  