package com.example.springdi;

import com.example.springdi.domain.Author;
import com.example.springdi.domain.Book;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class SpringDiApplication {
    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(SpringDiApplication.class, args);

        //  Get the dependency from the context
        Author author = context.getBean(Author.class);

        //  Use the dependency
        Book book = new Book(author);

        book.getAuthor().getDetails();
    }

}
