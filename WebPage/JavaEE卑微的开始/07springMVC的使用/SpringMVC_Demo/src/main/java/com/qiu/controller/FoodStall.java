package com.qiu.controller;

public class FoodStall {
    private int foodStallsID;
    private String canteen;
    private String name;
    private String imagePath;
    private int numberOfRatings;
    private double averageRating;

    public void setFoodStallsID(int foodStallsId) {
        this.foodStallsID=foodStallsId;
    }

    public void setCanteen(String canteen) {
        this.canteen=canteen;
    }

    public void setName(String name) {
        this.name=name;
    }

    public void setImagePath(String imagePath) {
        this.imagePath=imagePath;
    }

    public void setNumberOfRatings(int numberOfRatings) {
        this.numberOfRatings=numberOfRatings;
    }

    public void setAverageRating(double averageRating) {
        this.averageRating=averageRating;
    }

    // 省略构造函数和 getter/setter 方法
}