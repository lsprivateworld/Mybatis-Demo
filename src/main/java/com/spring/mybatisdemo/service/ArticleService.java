package com.spring.mybatisdemo.service;

import com.spring.mybatisdemo.bean.Article;
import org.springframework.stereotype.Service;

public interface ArticleService {
    Article findArticleById(Integer id);
    int updateArticle(Article article);
}
