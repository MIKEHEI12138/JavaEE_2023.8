package com.qiu.controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class FoodStallDAO {
    private static final String DB_URL = "jdbc:mysql://localhost:3306/try_canteen?useSSL=true&amp;useUnicode=true&amp;characterEncoding=utf8";
    private static final String DB_USER = "root";
    private static final String DB_PASSWORD = "qiu123";

    public List<FoodStall> getAllFoodStalls() {
        List<FoodStall> foodStalls = new ArrayList<>();
        try (Connection connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
             PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM food_stalls");
             ResultSet resultSet = preparedStatement.executeQuery()) {

            while (resultSet.next()) {
                FoodStall foodStall = new FoodStall();
                foodStall.setFoodStallsID(resultSet.getInt("food_stalls_id"));
                foodStall.setCanteen(resultSet.getString("canteen"));
                foodStall.setName(resultSet.getString("name"));
                foodStall.setImagePath(resultSet.getString("image_path"));
                foodStall.setNumberOfRatings(resultSet.getInt("number_of_ratings"));
                foodStall.setAverageRating(resultSet.getDouble("average_rating"));
                foodStalls.add(foodStall);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return foodStalls;
    }


}
