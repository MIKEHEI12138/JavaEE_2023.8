package com.example.demo3;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/foodstalls")
public class FoodStallServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        FoodStallDAO foodStallDAO = new FoodStallDAO();
        List<FoodStall> foodStalls = foodStallDAO.getAllFoodStalls();
        request.setAttribute("foodStalls", foodStalls);

        System.out.println("AAA");
        // 转发到JSP页面
        request.getRequestDispatcher("/food_stall.jsp").forward(request, response);
    }
}