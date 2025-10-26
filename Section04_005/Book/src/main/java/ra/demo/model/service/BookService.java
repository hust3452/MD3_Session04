package ra.demo.model.service;

import org.springframework.stereotype.Service;
import ra.demo.model.repository.BookRepository;
import untils.Book;

import java.util.List;
@Service
public class BookService{
    private BookRepository repository;
    public BookService() {
        repository = new BookRepository();
    }

    public List<Book> findAll() {
        return repository.findAll();
    }
}
