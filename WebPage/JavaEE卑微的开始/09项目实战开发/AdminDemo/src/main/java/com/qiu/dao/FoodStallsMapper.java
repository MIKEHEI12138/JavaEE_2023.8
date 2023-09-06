package com.qiu.dao;

import java.util.List;
import com.qiu.entity.FoodStalls;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

public interface FoodStallsMapper {

    @Select("SELECT * FROM foodStalls")
    List<FoodStalls> getAllFoodStalls();

    @Insert("INSERT INTO foodStalls (CanteenID, floor, name, introduction, image, score, scoreCount, averageScore, lastUpdateTime) " +
            "VALUES (#{canteenID}, #{floor}, #{name}, #{introduction}, #{image}, #{score}, #{scoreCount}, #{averageScore}, #{lastUpdateTime})")
    void insertFoodStall(FoodStalls foodStall);

    @Update("UPDATE FoodStalls SET " +
            "CanteenID = #{canteenID}, " +
            "Floor = #{floor}, " +
            "StallName = #{stallName}, " +
            "StallDescription = #{stallDescription}, " +
            "ImagePath = #{imagePath}, " +
            "TotalScore = #{totalScore}, " +
            "RatingCount = #{ratingCount}, " +
            "AverageScore = #{averageScore}, " +
            "LastUpdateTime = #{lastUpdateTime} " +
            "WHERE foodStallsID = #{foodStallsID}")
    int updateFoodStalls(FoodStalls foodStalls);

    @Select("SELECT * FROM FoodStalls WHERE foodStallsID = #{foodStallsID}")
    FoodStalls getFoodStallsById(@Param("foodStallsID") Long foodStallsID);
}
