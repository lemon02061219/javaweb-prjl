package com.model;

public class UserBean {
    // 属性声明
    private String username;
    private String password;
    private int type;
    //构造方法
    public UserBean(){}
    // get 方法
    public String getUsername(){ return username; }
    public String getPassword(){ return password; }
    // set 方法
    public void setUsername(String username){
        this.username = username;
    }
    public void setPassword(String password){
        this.password = password;
    }

    public int getType()
    {
        return type;
    }

    public void setType(int type)
    {
        this.type = type;
    }

    public UserBean(String username, String password, int type)
    {
        super();
        this.username = username;
        this.password = password;
        this.type = type;
    }

}
