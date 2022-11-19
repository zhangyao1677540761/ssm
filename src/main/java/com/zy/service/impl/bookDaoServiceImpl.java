package com.zy.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zy.bean.bsBook;
import com.zy.mapper.bookMapper;
import com.zy.service.bookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @学习小结
 */
@Service
public class bookDaoServiceImpl implements bookService {

    @Autowired
    private bookMapper bookMapper;

    @Override
    public List<bsBook> getAllBook() {
        return bookMapper.getAllBook();
    }

    @Override
    public PageInfo<bsBook> getBooksPage(Integer pageNum) {
        PageHelper.startPage(pageNum,5);
        List<bsBook> allBook = bookMapper.getAllBook();
        PageInfo<bsBook> page = new PageInfo<>(allBook,5);
        return page;
    }
}
