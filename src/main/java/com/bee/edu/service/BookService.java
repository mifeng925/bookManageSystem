package com.bee.edu.service;

import com.bee.edu.bean.Book;

import java.util.List;

/**
 * @author ：Bee
 * @date ：Created in 2021/1/11 22:31
 */

public interface BookService {

    /**
     * 获取所有书籍
     *
     * @return 所有书籍
     */
    List<Book> getAllBook();

    /**
     * 添加书籍
     *
     * @param book 书籍
     * @return 书籍
     */
    void addBook(Book book);

    /**
     * 删除数据
     *
     * @param id 图书编号
     */
    void delete(int id);

    /**
     * 更新书籍信息
     *
     * @param book 书籍
     */
    void updateBook(Book book);

    /**
     * 查询图书
     *
     * @param id 图书id
     * @return 图书
     */
    Book getBook(int id);

    /**
     * 通过书籍名称模糊搜索图书
     *
     * @param name 书籍名称
     * @return 图书列表
     */
    List<Book> getBookByName(String name);

}
