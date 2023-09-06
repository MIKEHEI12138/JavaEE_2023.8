package com.qiu.entity;

public class Comment {
    private int commentID;
    private int userID;
    private int score;
    private String commentContent;
    private java.sql.Timestamp commentTime;
    private int likesCount;

    // 添加构造方法、getters和setters

    @Override
    public String toString() {
        return "Comment{" +
                "commentID=" + commentID +
                ", userID=" + userID +
                ", score=" + score +
                ", commentContent='" + commentContent + '\'' +
                ", commentTime=" + commentTime +
                ", likesCount=" + likesCount +
                '}';
    }
}
