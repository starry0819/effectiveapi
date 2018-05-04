package com.zhanghuanfa.service;

import com.zhanghuanfa.model.po.Book;

import java.util.List;

/**
 * @author zhanghuanfa
 * @date 2018-05-04 8:58
 */
public interface BookService {

    /**
     * 保存book(支持批量)
     * @param books book集合
     * @return 主键id集合
     */
    Integer saveBooks(List<Book> books);

    /**
     * 获取所有书
     * @return book集合
     */
    List<Book> getAllBook();

    /**
     * 更新book
     * @param book book对象
     * @return 受影响行数
     */
    int updateBook(Book book);
}
