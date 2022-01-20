package ro.mycode.librarymanager.controller;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import ro.mycode.librarymanager.model.Book;
import ro.mycode.librarymanager.repository.BookRepo;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/books")
@CrossOrigin
public class BookController {


    BookRepo bookRepo;
    List<Book> biblio=new ArrayList<>();
    @Autowired
    public BookController(BookRepo bookRepo) {
        this.bookRepo = bookRepo;
    }


    @ResponseStatus(HttpStatus.OK)
    @GetMapping
    List<Book> getBooks() {
        biblio=bookRepo.findAll();
        return biblio;

    }


    @ResponseStatus(HttpStatus.OK)
    @PostMapping
    Book addBook(@RequestBody Book book) {
        System.out.println(book);
        this.bookRepo.save(book);
        return book ;
    }

//    @ResponseStatus(HttpStatus.OK)
//    @PostMapping
//    Book delBook(@RequestBody Book book) {
//        this.bookRepo.delete(book);
//        return book ;
//    }
//
//    @ResponseStatus
//    @PutMapping
//    @Modifying
//    @Query("update Book b set b.title = ?1,b.author=?2 where b.id = ?3")
//    public void updateBook(@RequestParam String title,String author,Long id) {
//
//    }
}
