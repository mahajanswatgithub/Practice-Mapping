package com.example.MappingPractice.Mapping.repository;

import com.example.MappingPractice.Mapping.model.Book;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface IBookRepo extends JpaRepository<Book,String> {



    @Transactional
    @Modifying
    @Query(value = "update Books set Book_Price = :price where Book_Id = :id",nativeQuery = true)
    void updateBookByBookPrice(String id, String price);
}
