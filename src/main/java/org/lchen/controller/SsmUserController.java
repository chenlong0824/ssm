package org.lchen.controller;

import org.lchen.service.SsmUserServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@Controller
public class SsmUserController {

    @Resource
    private SsmUserServiceImpl ssmUserService;

    @RequestMapping("/add")
    @ResponseBody
    public String add(@RequestParam("pname") String pname, @RequestParam("password") String password) {
        ssmUserService.insert(pname, password);
        String ssmUsers = ssmUserService.queryAll();
        return ssmUsers;
    }

}
