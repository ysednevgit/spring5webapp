package yury.springframework.spring5webapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import yury.springframework.spring5webapp.repositories.AuthorRepository;

import javax.annotation.Resource;

/**
 * Created by ysedn on Mar 04, 2018
 */
@Controller
public class AuthorController {

    @Resource
    private AuthorRepository authorRepository;

    @RequestMapping("/authors")
    public String getAuthors(Model model)
    {
        model.addAttribute("authors", authorRepository.findAll());

        return "authors.html";
    }

}
