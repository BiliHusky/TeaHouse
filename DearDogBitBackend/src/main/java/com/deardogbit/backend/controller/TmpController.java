package com.deardogbit.backend.controller;


import com.deardogbit.backend.entity.TmpUser;
import com.deardogbit.backend.service.TmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = {"/tmp"})
public class TmpController {
    @Autowired
    private TmpService tmpService;

    @RequestMapping(value = {"find"}, produces = {"application/json;charset=UTF-8"}, method = RequestMethod.GET)
    public TmpUser getTmpUser() {
        return tmpService.findUser();
    }
}
