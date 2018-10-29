package org.lchen.service;

public interface SsmUserService {

    void insert(String pname, String password);

    String queryAll();

    void saveTest(String pname);

}
