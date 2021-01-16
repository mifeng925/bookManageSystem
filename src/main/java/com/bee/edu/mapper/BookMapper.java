package com.bee.edu.mapper;

import com.bee.edu.bean.Book;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author ：Bee
 * @date ：Created in 2021/1/11 22:34
 */
@Mapper
@Component
public interface BookMapper {

    /**
     * 获取所有书籍
     *
     * @return 所有书籍
     */
    List<Book> getAll();

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
     * 查询某图书
     *
     * @param id 书籍ID
     * @return 书籍
     */
    @Select("select * from book where book_id=#{id}")
    Book getBook(int id);

    /**
     * 通过书籍名称模糊搜索图书
     *
     * @param name 书籍名称
     * @return 图书列表
     */
    @Select("select * from book where `book_name ` like #{name}")
    List<Book> getBooks(String name);
}
