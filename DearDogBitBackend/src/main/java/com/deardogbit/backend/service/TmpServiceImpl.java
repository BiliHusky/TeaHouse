package com.deardogbit.backend.service;

import com.deardogbit.backend.dao.TmpUserMapper;
import com.deardogbit.backend.entity.TmpUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service(value = "tmpService")
public class TmpServiceImpl implements TmpService{

    @Autowired
    private TmpUserMapper tmpUserMapper;

    @Override
    public TmpUser findUser() {
        return tmpUserMapper.selectByPrimaryKey(1);
    }
}
