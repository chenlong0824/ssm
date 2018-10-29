package org.lchen.service.impl;

import org.lchen.mapper.SsmUserMapper;
import org.lchen.model.SsmUser;
import org.lchen.service.SsmUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("ssmUserService")
public class SsmUserServiceImpl implements SsmUserService {

    @Resource
    private SsmUserMapper ssmUserMapper;

    @Override
    public void insert(String pname, String password) {
        SsmUser ssmUser = new SsmUser();
        ssmUser.setPname(pname);
        ssmUser.setPassword(password);
        ssmUserMapper.insert(ssmUser);
    }

    @Override
    public String queryAll() {
        StringBuilder sb = new StringBuilder();
        List<SsmUser> ssmUsers = ssmUserMapper.selectAll();
        for (SsmUser ssmUser : ssmUsers) {
            sb.append(ssmUser.getPname() + ",");
        }
        return sb.toString();
    }

    @Override
    public void saveTest(String pname) {
        SsmUser ssmUser = new SsmUser();
        ssmUser.setPname(pname);
        ssmUser.setPassword("111111");
        ssmUserMapper.insert(ssmUser);

        SsmUser ssmUser1 = new SsmUser();
        ssmUser.setPname("liujinxing");
        ssmUser.setPassword("111111");
        ssmUserMapper.insert(ssmUser1);
    }

}
