package com.soecode.lyf.entity;

public class Book {
    private long bookId; // 图书ID

    private String name; // 图书名称

    private int number; // 馆藏数量

    @Override
    public String toString() {
        return "Book(bookId:" + bookId + ",name:" + name + ",number:" + number + ")";
    }

}
