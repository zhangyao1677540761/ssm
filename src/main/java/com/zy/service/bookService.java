package com.zy.service;


import com.github.pagehelper.PageInfo;
import com.zy.bean.bsBook;

import java.util.List;

/**
 * @学习小结
 */
public interface bookService {
    List<bsBook> getAllBook();

    PageInfo<bsBook> getBooksPage(Integer pageNum);

}
