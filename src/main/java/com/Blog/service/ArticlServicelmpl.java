package com.Blog.service;

import com.Blog.mapper.ArticlMapper;
import com.Blog.model.Articl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ArticlServicelmpl implements ArticlService {
    @Autowired
    private ArticlMapper am;
    @Override
    public List<Articl> getAllArticl() {


        List<Articl> list=am.selectAll();

        return list;
    }

    @Override
    public Articl getTextById(int id) {
        Articl articl=am.selectByPrimaryKey(id);
        return articl;
    }
}
