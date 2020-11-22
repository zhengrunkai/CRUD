package com.zrk.service;

import com.zrk.entity.Emp;

import java.util.List;

public interface EmpService {

    List<Emp> findAll();

    void save(Emp emp);

    void delete(Integer id);

    Emp find(Integer id);

    void update(Emp emp);
}
