package com.bee.edu;

import com.bee.edu.bean.Book;
import com.bee.edu.bean.Result;
import com.bee.edu.service.BookService;
import com.bee.edu.service.impl.BookServiceImpl;
import com.bee.edu.utils.DataUtils;
import org.apache.ibatis.annotations.Param;
import org.assertj.core.util.DateUtil;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @author ：Bee
 * @date ：Created in 2021/1/16 15:55
 */
@SpringBootTest
public class ControllerTest {

    @Autowired
    BookService bookService;

    @Test
    public void getBook() {
        Book book = bookService.getBook(1);
        System.out.println(book);
    }

    @Test
    public void addBook() {
        bookService.addBook(new Book("JavaScript高级程序设计（第4版）", "李松峰", "JAVA", DataUtils.getNowData()));
    }

}
