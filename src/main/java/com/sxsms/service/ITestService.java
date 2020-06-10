package com.sxsms.service;

import com.sxsms.bean.StuInfo;

import java.util.List;

public interface ITestService {
    public List<StuInfo> getSutdents();
    public int  modifyStu(StuInfo stu);
    public int deleteStu (Integer key);
    public int addStu(StuInfo stu);
    public List <StuInfo> getStuByFactors(StuInfo stu);
}
