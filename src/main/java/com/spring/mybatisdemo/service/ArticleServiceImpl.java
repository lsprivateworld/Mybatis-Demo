package com.spring.mybatisdemo.service;

import com.spring.mybatisdemo.bean.Article;
import com.spring.mybatisdemo.mapper.ArticleMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

@Service
public class ArticleServiceImpl implements ArticleService {

    @Autowired
    ArticleMapper articleMapper;

    @Override
    public Article findArticleById(Integer id) {
        id = 1;
        Article article = articleMapper.findArticleById(id);
        if (article != null) {
            System.out.println(article);
        } else {
            System.out.println("编号为[" + id + "]的文章未找到！");
        }
        return article;
    }

    @Override
    public int updateArticle(Article article) {
       return articleMapper.updateArticle(article);
    }
}
