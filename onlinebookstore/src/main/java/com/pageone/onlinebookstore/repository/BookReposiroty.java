package com.pageone.onlinebookstore.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.pageone.onlinebookstore.entity.Book;

public interface BookReposiroty extends JpaRepository<Book, Long> {

}
