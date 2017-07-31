package com.wchstrife.dao;

import com.wchstrife.entity.Article;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by wangchenghao on 2017/7/31.
 */
@Repository
public interface ArticleDao extends JpaRepository<Article, String>{

}
