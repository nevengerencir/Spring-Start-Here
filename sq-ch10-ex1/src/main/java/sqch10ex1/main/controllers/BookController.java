package sqch10ex1.main.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import sqch10ex1.main.model.Book;


@RestController
public class BookController {
    @GetMapping("/book")
    public Book lotr (@RequestParam String title, @RequestParam String author){
        Book book = new Book(author,title);
        return book;
    }
}
