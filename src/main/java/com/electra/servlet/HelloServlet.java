package com.electra.servlet;

import java.io.IOException;

import com.electra.service.GreetingService;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class HelloServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
    private GreetingService greetingService = new GreetingService();

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Get the parameter from the request
        String name = request.getParameter("name");

        // Save the greeting using the service
        greetingService.saveGreeting(name);

        // Forward the request to the JSP with the greeting
        request.setAttribute("greeting", greetingService.getGreeting());
        request.getRequestDispatcher("/result.jsp").forward(request, response);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doPost(request, response);
    }
}
