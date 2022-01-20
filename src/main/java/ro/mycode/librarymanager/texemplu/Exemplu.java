package ro.mycode.librarymanager.texemplu;


import com.github.javafaker.Faker;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ro.mycode.librarymanager.model.Book;
import ro.mycode.librarymanager.repository.BookRepo;

import java.time.LocalDate;

@Configuration
public class Exemplu {
//
//
//    @Bean
//    public  Object ceva(BookRepo bookRepo){
//
//
//        Faker faker= new Faker();
//
//        for(int i=1;i<20;i++){
//
//            bookRepo.save(
//                    new Book(faker.book().title(),
//                            faker.book().author(),
//                            faker.book().genre(),
//                            LocalDate.now().getYear()
//            ));
//        }
//
//        return  new Object();
//    }
}
