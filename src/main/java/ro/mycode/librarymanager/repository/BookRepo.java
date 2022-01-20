package ro.mycode.librarymanager.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import ro.mycode.librarymanager.model.Book;


import org.springframework.stereotype.Repository;


@Repository
public interface BookRepo extends JpaRepository<Book, Long> {

}
