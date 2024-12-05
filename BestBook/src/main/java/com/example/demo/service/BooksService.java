package com.example.demo.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Books;
import com.example.demo.repo.BooksRepository;
@Service  
public class BooksService   
{  
    @Autowired  
    BooksRepository booksRepository;  
    public List<Books> getAllBooks()   
    {   
    return booksRepository.findAll();
    }  
        //saving a specific record by using the method save() of CrudRepository  
    public Books saveOrUpdate(Books books)   
    {  
        return booksRepository.save(books);
    }  
    //deleting all records
    public void deleteAll()   
    {  
        booksRepository.deleteAll();
    }

}  