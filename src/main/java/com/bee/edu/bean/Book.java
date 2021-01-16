package com.bee.edu.bean;

/**
 * @author ：Bee
 * @date ：Created in 2021/1/11 22:25
 */
public class Book {

    private int bookId;
    private String bookName;
    private String bookAuthor;
    private String bookSort;
    private String bookRecord;

    public Book(int bookId, String bookName, String bookAuthor, String bookSort, String bookRecord) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.bookAuthor = bookAuthor;
        this.bookSort = bookSort;
        this.bookRecord = bookRecord;
    }

    public Book(String bookName, String bookAuthor, String bookSort, String bookRecord) {
        this.bookName = bookName;
        this.bookAuthor = bookAuthor;
        this.bookSort = bookSort;
        this.bookRecord = bookRecord;
    }

    public Book(int bookId, String bookName, String bookAuthor, String bookSort) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.bookAuthor = bookAuthor;
        this.bookSort = bookSort;
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor;
    }

    public String getBookSort() {
        return bookSort;
    }

    public void setBookSort(String bookSort) {
        this.bookSort = bookSort;
    }

    public String getBookRecord() {
        return bookRecord;
    }

    public void setBookRecord(String bookRecord) {
        this.bookRecord = bookRecord;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookId=" + bookId +
                ", bookName='" + bookName + '\'' +
                ", bookAuthor='" + bookAuthor + '\'' +
                ", bookSort='" + bookSort + '\'' +
                ", bookRecord='" + bookRecord + '\'' +
                '}';
    }
}
