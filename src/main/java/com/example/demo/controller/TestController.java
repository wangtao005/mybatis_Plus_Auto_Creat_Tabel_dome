package com.example.demo.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.demo.entity.MyTest;
import com.example.demo.service.MyTestService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
@RequestMapping("/test")
public class TestController  {

    @Resource
    private MyTestService service;


    @ResponseBody
    @RequestMapping("/listByPage")
    public String  listByPage(){
        Page<MyTest> page = new Page<>();
        page.setSize(10);
        IPage<MyTest> mypage = service.page(page);

        return null;
    }
    @ResponseBody
    @RequestMapping("/save")
    public String  save(MyTest entity){

        boolean save = service.save(entity);

        return null;
    }

}
