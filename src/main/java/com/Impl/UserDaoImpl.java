package com.Impl;

import com.dao.UserDao;
import com.db.DBUtils;
import com.model.UserBean;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserDaoImpl implements UserDao {
    @Override
    public boolean searchUser(UserBean user) {
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        String sql = "SELECT * FROM usertable where username=? and password=? and type=?";
        try {
            conn = DBUtils.getConnection();
            ps = conn.prepareStatement(sql);
            ps.setString(1, user.getUsername());
            ps.setString(2, user.getPassword());
            ps.setInt(3, user.getType());
            rs = ps.executeQuery();
            while(rs.next()){
                return true;
            }
            return false;
        }catch (SQLException e){
            e.printStackTrace();
        }finally {
            DBUtils.close(null, ps, conn);
        }
        return false;
    }

    @Override
    public boolean addUser(UserBean user) {
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        String sql = "Insert into usertable values(?,?,?)";
        try {
            conn = DBUtils.getConnection();
            ps = conn.prepareStatement(sql);
            ps.setString(1, user.getUsername());
            ps.setString(2, user.getPassword());
            ps.setInt(3, user.getType());
            ps.executeUpdate();
            return true;
        }catch (SQLException e){
            e.printStackTrace();
        }finally {
            DBUtils.close(null, ps, conn);
        }
        return false;
    }
}
