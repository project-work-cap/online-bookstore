package com.capgemini.onlinebookstore.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.capgemini.onlinebookstore.entities.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Long>
{
	Optional<Book> findByIsbn(long bookIsbn);

//	Optional<Book> findById(BookDto bookDto);
}
