package org.lchen.controller;

import org.lchen.service.SsmUserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@Controller
@RequestMapping("/ssmUser")
public class SsmUserController {

    @Resource
    private SsmUserService ssmUserService;

    @RequestMapping("/add")
    @ResponseBody
    public String add(@RequestParam("pname") String pname, @RequestParam("password") String password) {
        ssmUserService.insert(pname, password);
        String ssmUsers = ssmUserService.queryAll();
        return ssmUsers;
    }

    @RequestMapping("/query")
    public String query(Model model) {
        String ssmUsers = ssmUserService.queryAll();
        model.addAttribute("ssmUsers",ssmUsers);
        return "ssmUser";
    }

    @RequestMapping("saveTx")
    public String testTx(@RequestParam("pname") String pname, Model model) {
        ssmUserService.saveTest(pname);
        String ssmUsers = ssmUserService.queryAll();
        model.addAttribute("ssmUsers",ssmUsers);
        return "ssmUser";
    }


}
