package com.pzy.importexportexcel.dao;

import com.pzy.importexportexcel.pojo.Item;

import java.util.List;

public class ItemDao {
    public void save(List<Item> list){
        System.out.println(list.size()+"操作数据库。。。。");
    }
}
