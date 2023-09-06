package com.qiu.dao;

import com.qiu.entity.User;
import com.qiu.utils.CommonUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class UserMapperTest {
        @Test
        public void test() {
            SqlSession sqlSession = CommonUtils.getSession();
            UserMapper mapper = sqlSession.getMapper(UserMapper.class);
            List<User> userList = mapper.getUserList();

            for (User user : userList) {
                System.out.println(user);
            }

            sqlSession.close();
        }

    // 添加其他测试方法...
}
