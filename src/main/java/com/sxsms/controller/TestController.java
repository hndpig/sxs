package com.sxsms.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sxsms.bean.Msg;
import com.sxsms.bean.StuInfo;
import com.sxsms.service.ITestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class TestController {
    @Autowired
    ITestService service;
@RequestMapping("/")
public String index(){
    return "sxs";
}


    @RequestMapping("getAll/{pn}")
    @ResponseBody
    public Msg getAll(@PathVariable Integer pn) {
        PageHelper.startPage(pn, 5);
        List<StuInfo> sutdents = service.getSutdents();
        PageInfo<StuInfo> pageInfo =new PageInfo<>(sutdents,5);
        return Msg.success().add("pageInfo", pageInfo);
    }
    @RequestMapping("edit")
    @ResponseBody
    public Msg edit(StuInfo stu) {
        int i = service.modifyStu(stu);
        if (i>1)
        return Msg.success();
        else
            return Msg.fail();
    }
    @RequestMapping("remove/{key}")
    @ResponseBody
    public Msg remove(@PathVariable Integer key) {
        System.out.println("");
        int i = service.deleteStu(key);
        if (i>0)
            return Msg.success();
        else
            return Msg.fail();
    }

    @RequestMapping("add")
    @ResponseBody
    public Msg add(StuInfo stu) {
        int i = service.addStu(stu);
        if (i!=0)
            return Msg.success();
        else
            return Msg.fail();
    }
    @RequestMapping("getStu4Fac")
    @ResponseBody
    public Msg getStuByFactors(StuInfo stu) {
        List<StuInfo> stus = service.getStuByFactors(stu);
        PageInfo<StuInfo> pageInfo =new PageInfo<>(stus);

        return Msg.success().add("pageInfo" ,pageInfo);

    }
}
