package com.sxsms.service.Impl;

import com.sxsms.bean.StuInfo;
import com.sxsms.mapper.StuInfoMapper;
import com.sxsms.service.ITestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class TestService implements ITestService {
    @Autowired
    StuInfoMapper dao ;
    @Override
    public List<StuInfo> getSutdents() {
        System.out.println("进到了这里");
        return dao.getAll();
    }

    @Override
    public int modifyStu(StuInfo stu) {
        return dao.updateByPrimaryKey(stu);
    }

    @Override
    public int deleteStu(Integer key) {

        return dao.deleteByPrimaryKey(key);
    }

    @Override
    public int addStu(StuInfo stu) {
        return dao.insert(stu);
    }

    @Override
    public List<StuInfo> getStuByFactors(StuInfo stu) {
        return dao.getStuByFactors(stu);
    }
}
