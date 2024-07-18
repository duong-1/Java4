package com.vunh.controller;

import java.io.*;
import java.util.Optional;

import com.vunh.entities.Account;
import com.vunh.repositories.AccountRepositories;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
import jakarta.servlet.ServletException;
import org.apache.commons.beanutils.BeanUtils;

@WebServlet(name = "LoginServletServlet", value = {"/sign-in", "/sign-up", "/logout"})
public class LoginServlet extends HttpServlet {
    private final AccountRepositories accountRepositories = new AccountRepositories();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        if (!resp.isCommitted()) {
            String uri = req.getRequestURI();
            if (uri.contains("sign-in")) {
                req.getRequestDispatcher("/index.jsp").forward(req, resp);
            } else if (uri.contains("logout")) {
                HttpSession session = req.getSession();
                session.removeAttribute("user");
                resp.sendRedirect("sign-in");
            }
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String uri = req.getRequestURI();
        if (uri.contains("sign-in")) {
            this.sign_in(req, resp);
        } else if (uri.contains("sign-up")) {
            this.sign_up(req, resp);
        }
    }

    protected void sign_in(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("sign-in-username");
        String password = req.getParameter("sign-in-password");
        HttpSession session = req.getSession();
        Optional<Account> account = this.accountRepositories.login(username, password);
        if (account.isPresent()) {
            session.setAttribute("username", username);
            session.setAttribute("user", account.get());
            session.removeAttribute("error");
            session.removeAttribute("password");
            resp.sendRedirect("/home/dashboard");
        } else {
            session.setAttribute("username", username);
            session.setAttribute("password", password);
            session.setAttribute("error", "Invalid username or password!");
            resp.sendRedirect("/sign-in");
        }
    }

    protected void sign_up(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try {
            Account account = new Account();
            BeanUtils.populate(account, req.getParameterMap());
            account.setRole(false);
            if (this.accountRepositories.save(account)) {
                resp.sendRedirect("/sign-in");
            } else {
                req.getRequestDispatcher("/template/Error.jsp").forward(req, resp);
            }
        } catch (Exception e) {
            resp.sendRedirect("/sign-in");
        }
    }
}