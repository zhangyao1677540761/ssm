package com.zy.controller;

import com.github.pagehelper.PageInfo;
import com.zy.bean.bsBook;
import com.zy.service.bookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * @学习小结
 */
@Controller
public class bookController {

    @Autowired
    private bookService bookService;

    @RequestMapping(value = "/Book/page/{pageNum}", method = RequestMethod.GET)
    public String getPageBooks(@PathVariable("pageNum") Integer pageNum,Model model){
        PageInfo<bsBook> list = bookService.getBooksPage(pageNum);
        model.addAttribute("list",list);

        System.out.println(list);
        return "Books_list";
    }










//    @RequestMapping(value = "/getAllBook", method = RequestMethod.GET)
//    public String getAllBook(Model model){
//     List<bsBook> list = bookService.getAllBook();
//        model.addAttribute("list",list);
//        return "Books_list";
//    }

}
