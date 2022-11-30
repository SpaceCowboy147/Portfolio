package com.dylanharper.webApps;

import jakarta.servlet.ServletContext;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@WebServlet("/Calculator.jar")
public class webAppServlets extends HttpServlet {


    public void doGet(HttpServletRequest request, HttpServletResponse response){
        String jarPath = "/resources/Calculator.jar";
        response.setContentType("application/pdf");


    }
}
