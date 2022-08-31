package com.ttj.usermgmt.service;

import java.util.List;

import com.ttj.usermgmt.model.User;

public interface UserMgmtService {
    public void saveUser(User user);
    public User findByUserId(String userId);
    public void deleteUser(String userId);
    public List<User> listAllUsers();
}
