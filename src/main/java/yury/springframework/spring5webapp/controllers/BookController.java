package yury.springframework.spring5webapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import yury.springframework.spring5webapp.repositories.BookRepository;

import javax.annotation.Resource;

/**
 * Created by ysedn on Mar 04, 2018
 */
@Controller
public class BookController {

    @Resource
    private BookRepository bookRepository;


    @RequestMapping("/books")
    public String getBooks(Model model)
    {
        model.addAttribute("books", bookRepository.findAll());
        return "books";
    }

}
