package com.qiu.entity;

public class FoodStalls {
    private int foodStallsID;
    private int canteenID;
    private int floor;
    private String stallName;
    private String stallDescription;
    private String imagePath;
    private double totalScore;
    private int ratingCount;
    private double averageScore;
    private java.sql.Timestamp lastUpdateTime;

    // 添加构造方法、getters和setters

    @Override
    public String toString() {
        return "FoodStalls{" +
                "foodStallsID=" + foodStallsID +
                ", canteenID=" + canteenID +
                ", floor=" + floor +
                ", stallName='" + stallName + '\'' +
                ", stallDescription='" + stallDescription + '\'' +
                ", imagePath='" + imagePath + '\'' +
                ", totalScore=" + totalScore +
                ", ratingCount=" + ratingCount +
                ", averageScore=" + averageScore +
                ", lastUpdateTime=" + lastUpdateTime +
                '}';
    }

    public void setFoodStallsID(int foodStallsID) {
        this.foodStallsID = foodStallsID;
    }
}
