package com.spring.mybatisdemo.controller;

import com.spring.mybatisdemo.bean.Article;
//import com.spring.mybatisdemo.service.ArticleService;
import com.spring.mybatisdemo.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class ArticleController {

    @Autowired
    private ArticleService articleService;

    @RequestMapping("/getArticle")
    public ModelAndView getFlowList(){
        ModelAndView modelAndView = new ModelAndView("articleList");
        Integer id = 1;
//        Article article = articleMapper.findArticleById(id);
        Article article = articleService.findArticleById(id);
        return modelAndView;
    }

}
