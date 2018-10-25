package org.lchen.service;

import org.lchen.mapper.SsmUserMapper;
import org.lchen.model.SsmUser;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("ssmUserService")
public class SsmUserServiceImpl {

    @Resource
    private SsmUserMapper ssmUserMapper;

    public void insert(String pname, String password) {
        SsmUser ssmUser = new SsmUser();
        ssmUser.setPname(pname);
        ssmUser.setPassword(password);
        ssmUserMapper.insert(ssmUser);
    }


    public String queryAll() {
        StringBuilder sb = new StringBuilder();
        List<SsmUser> ssmUsers = ssmUserMapper.selectAll();
        for (SsmUser ssmUser : ssmUsers) {
            sb.append(ssmUser.getPname() + ",");
        }
        return sb.toString();
    }

}
