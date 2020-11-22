package com.zrk.service;

import com.zrk.dao.EmpDAO;
import com.zrk.entity.Emp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class EmpServiceImpl implements EmpService{

    @Autowired
    private EmpDAO empDAO;

    @Override
    public List<Emp> findAll() {
        return empDAO.findAll();
    }

    @Override
    public void save(Emp emp) {
//        emp.setId(Integer.parseInt(UUID.randomUUID().toString()));
        empDAO.save(emp);
    }

    @Override
    public void delete(Integer id) {
        empDAO.delete(id);
    }

    @Override
    public Emp find(Integer id) {
        return empDAO.find(id);
    }

    @Override
    public void update(Emp emp) {
        empDAO.update(emp);
    }
}
