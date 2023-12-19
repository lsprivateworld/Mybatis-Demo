package com.spring.mybatisdemo.mapper;


import com.spring.mybatisdemo.bean.Article;
import org.apache.ibatis.annotations.Mapper;

/**
 * 功能：文章映射器接口
 * 作者：刘帅
 * 日期：2023年12月06日
 */
@Mapper
public interface ArticleMapper {
    Article findArticleById(Integer id);
    int updateArticle(Article article);
}
