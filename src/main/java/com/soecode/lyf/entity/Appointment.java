package com.soecode.lyf.entity;

import java.util.Date;

/**
 * 预约图书实体
 */
public class Appointment {

    private long bookId;// 图书ID

    private long studentId;// 学号

    private Date appointTime;// 预约时间

    // 多对一的复合属性
    private Book book;// 图书实体

    // 省略构造方法，getter和setter方法，toString方法

    public Book getBook() {
        return book;
    }

    @Override
    public String toString() {
        return "Appointment(bookId:" + bookId + ",studentId:" + studentId + ",appointTime:" + appointTime + "," + book + ")";
    }

}