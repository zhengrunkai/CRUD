package com.zrk.controller;

import com.zrk.entity.Emp;
import com.zrk.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping(value = "/emp")
public class EmpController {

    @Autowired
    private EmpService empService;

    @GetMapping(value = "/findAll")
    public String findAll(Model model) {
        List<Emp> empsList = empService.findAll();
        model.addAttribute("emps", empsList);
        return "ems/emplist";
    }

    @PostMapping(value = "/save")
    public String save(Emp emp) {
        empService.save(emp);
        return "redirect:/emp/findAll";
    }

    @GetMapping(value = "/delete")
    public String delete(Integer id) {
        empService.delete(id);
        return "redirect:/emp/findAll";
    }

    @GetMapping(value = "/find")
    public String find(Integer id, Model model) {
        Emp emp = empService.find(id);
        model.addAttribute("emp", emp);
        return "ems/updateEmp";
    }

    @PostMapping(value = "/update")
    public String update(Emp emp) {
        empService.update(emp);
        return "redirect:/emp/findAll";
    }
}
