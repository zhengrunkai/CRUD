package com.zrk.dao;

import com.zrk.entity.Emp;

import java.util.List;

public interface EmpDAO {

    //查询所有
    List<Emp> findAll();

    //保存
    void save(Emp emp);

    //删除
    void delete(Integer id);

    //根据 id 查找用来修改单列数据
    Emp find(Integer id);

    //修改
    void update(Emp emp);
}
