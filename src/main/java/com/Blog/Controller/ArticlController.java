package com.Blog.Controller;

import com.Blog.model.Articl;
import com.Blog.service.ArticlService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("/api")
@RestController
public class ArticlController {
    @Autowired
    private ArticlService articlService;
    @RequestMapping("/getAllArticl")
    public List<Articl> getAllArticl(){


        List<Articl> list=articlService.getAllArticl();

        return list;


    }
    @RequestMapping("/getTextById")
    public Articl getTextById(int id){
        Articl articl=articlService.getTextById(id);

        return articl;
    }
}
