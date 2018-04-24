package com.Blog.mapper;

import com.Blog.model.Articl;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ArticlMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Articl record);

    int insertSelective(Articl record);

    Articl selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Articl record);

    int updateByPrimaryKey(Articl record);

    List<Articl> selectAll();
}