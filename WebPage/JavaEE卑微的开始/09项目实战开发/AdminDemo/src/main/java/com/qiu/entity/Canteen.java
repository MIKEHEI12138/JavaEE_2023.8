package com.qiu.entity;

public class Canteen {
    private int canteenID;
    private String restaurantName;
    private int floors;
    private String description;
    private String imagePath;

    // 添加构造方法、getters和setters

    @Override
    public String toString() {
        return "Canteen{" +
                "canteenID=" + canteenID +
                ", restaurantName='" + restaurantName + '\'' +
                ", floors=" + floors +
                ", description='" + description + '\'' +
                ", imagePath='" + imagePath + '\'' +
                '}';
    }
}
