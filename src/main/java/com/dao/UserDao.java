package com.dao;
import com.model.UserBean;

public interface UserDao {
    public boolean searchUser(UserBean user);
    public boolean addUser(UserBean user);
}
