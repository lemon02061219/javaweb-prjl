package com.controller;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import com.model.UserBean;
import com.Impl.UserDaoImpl;

@WebServlet(name = "LoginControllerServlet",value = "/LoginControllerServlet")
public class LoginControllerServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=utf-8");
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String type = request.getParameter("type");
        UserBean user=new UserBean();
        user.setUsername(username);
        user.setPassword(password);
        user.setType(Integer.parseInt(type));
        if(checkUser(user)){
            request.setAttribute("USER", user);
            RequestDispatcher dispatcher = request
                    .getRequestDispatcher("/loginSuccess.jsp");
            dispatcher.forward(request, response);
        }else{
            response.sendRedirect("/javaweb_prjl_war_exploded/loginFailed.jsp");
        }
    }
    boolean checkUser(UserBean user){
        UserDaoImpl userDao = new UserDaoImpl();
        if(userDao.searchUser(user)){
            return true;
        }
        return false;
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
