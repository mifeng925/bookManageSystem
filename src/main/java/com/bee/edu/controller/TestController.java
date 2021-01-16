package com.bee.edu.controller;

import com.bee.edu.bean.Book;
import com.bee.edu.bean.Result;
import com.bee.edu.service.BookService;
import com.bee.edu.utils.DataUtils;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author ：Bee
 * @date ：Created in 2021/1/11 21:16
 */
@RestController
public class TestController {

    @Autowired
    private BookService bookService;

    @RequestMapping("test")
    public String test() {
        return "Hello Spring Boot";
    }

    @RequestMapping("users")
    public Result getAll() {
        return new Result(200, "成功", bookService.getAllBook());
    }

    @RequestMapping("add")
    public Result addBook(String name,
                          String author,
                          String sort) {
        bookService.addBook(new Book(name, author, sort, DataUtils.getNowData()));
        return new Result();
    }

    @RequestMapping("update")
    public Result updateBook(String id,
                             String name,
                             String author,
                             String sort) {
        bookService.updateBook(new Book(id, name, author, sort));
        return new Result();
    }

    @RequestMapping("delete")
    public Result deleteBook(int id) {
        bookService.delete(id);
        return new Result();
    }

    @RequestMapping("getBook")
    public Result getBook(int id) {
        Book book = bookService.getBook(id);
        return new Result(book);
    }

    @RequestMapping("findBook")
    public Result findBook(String name) {
        name = "%" + name + "%";
        List<Book> books = bookService.getBookByName(name);
        return new Result(books);
    }

}
