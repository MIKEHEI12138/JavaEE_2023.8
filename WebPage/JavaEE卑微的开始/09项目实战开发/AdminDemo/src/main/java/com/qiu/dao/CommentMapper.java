package com.qiu.dao;

import com.qiu.entity.Comment;

public interface CommentMapper {
    Comment getCommentByID(int commentID);
    // 其他方法...
}
