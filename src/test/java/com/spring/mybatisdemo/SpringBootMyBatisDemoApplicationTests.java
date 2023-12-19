package com.spring.mybatisdemo;

import com.spring.mybatisdemo.bean.Article;
import com.spring.mybatisdemo.bean.Comment;
import com.spring.mybatisdemo.mapper.ArticleMapper;
import com.spring.mybatisdemo.mapper.CommentMapper;
import org.apache.catalina.User;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringBootMyBatisDemoApplicationTests {

    @Test
    void contextLoads() {
    }

    @Autowired
    private CommentMapper commentMapper;
//    @Autowired
//    private ArticleMapper articleMapper;

    @Test // 测试按标识符查询评论
    public void testFindById() {
        // 定义标识符变量
        Integer id = 1;
        // 调用评论映射器实体的按标识符查询评论方法
        Comment comment = commentMapper.findById(id);
        // 判断查询是否成功
        if (comment != null) { // 成功
            System.out.println(comment);
        } else { // 失败
            System.out.println("标识符为[" + id + "]的评论未找到~");
        }
    }
//
//    @Test // 测试按照编号查询文章记录
//    public void testFindArticleById() {
//
////        SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(configuration);
////        SqlSession sqlSession = sessionFactory.openSession();
////        User user = sqlSession.selectOne("com.demo.dao.UserMapper.getUserById", 1);
////        sqlSession.selectList()
////        sqlSession.close();
//        Integer id = 1;
//        Article article = articleMapper.findArticleById(id);
//        if (article != null) {
//            System.out.println(article);
//        } else {
//            System.out.println("编号为[" + id + "]的文章未找到！");
//        }
//    }
}
