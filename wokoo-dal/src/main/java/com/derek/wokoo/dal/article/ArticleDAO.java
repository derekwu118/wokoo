package com.derek.wokoo.dal.article;

import java.util.List;

import com.derek.wokoo.dal.article.module.ArticleDO;

/**
 * 文章表 DAO 层
 * Created by derek.wu on 2017-05-18.
 */
public interface ArticleDAO {

    int addOneArticle(ArticleDO articleDO);

    int updateArticleById(ArticleDO articleDO);

    int deleteArticleById(Long id);

    int publishArticleById(Long id);

    ArticleDO getArticleById(Long id);

    List<ArticleDO> listArticles();
}
