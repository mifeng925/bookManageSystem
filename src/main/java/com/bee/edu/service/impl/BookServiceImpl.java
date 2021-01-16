package com.bee.edu.service.impl;

import com.bee.edu.bean.Book;
import com.bee.edu.mapper.BookMapper;
import com.bee.edu.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author ：Bee
 * @date ：Created in 2021/1/11 22:33
 */
@Service
public class BookServiceImpl implements BookService {

    @Autowired
    BookMapper bookMapper;

    @Override
    public List<Book> getAllBook() {
        return bookMapper.getAll();
    }

    @Override
    public void addBook(Book book) {
        bookMapper.addBook(book);
    }

    @Override
    public void delete(int id) {
        bookMapper.delete(id);
    }

    @Override
    public void updateBook(Book book) {
        bookMapper.updateBook(book);
    }

    @Override
    public Book getBook(int id) {
        return bookMapper.getBook(id);
    }

    @Override
    public List<Book> getBookByName(String name) {
        return bookMapper.getBooks(name);
    }
}
