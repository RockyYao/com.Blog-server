package com.Blog.service;

import com.Blog.model.Articl;

import java.util.List;

public interface ArticlService {

    List<Articl> getAllArticl();

    Articl getTextById(int id);

}
