package com.qiu.dao;

import com.qiu.pojo.User;
import com.qiu.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class UserDaoTest {
    @Test
    public void test() {
        SqlSession sqlSession = MybatisUtils.getSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        List<User> userList = mapper.getAllUsers();

        for (User user : userList) {
            System.out.println(user);
        }

        sqlSession.close();
    }

}
