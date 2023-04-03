package sqch10ex1.main.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import sqch10ex1.main.model.Book;

import java.util.List;


@RestController
public class BookController {
    @GetMapping("/book")
    public ResponseEntity<Book> books (@RequestParam String title, @RequestParam String author){
        Book book = new Book(author,title);
        return ResponseEntity.status(HttpStatus.ACCEPTED)
                .header("material","leather")
                .body(book);
    }
}
