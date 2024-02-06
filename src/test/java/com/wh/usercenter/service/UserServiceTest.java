package com.wh.usercenter.service;

import com.wh.usercenter.mapper.UserMapper;
import com.wh.usercenter.model.User;
import jakarta.annotation.Resource;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;


/**
 * 用户服务测试
 *
 * @author ChenWeihan
 * @create 2024-02-04 8:48
 */
@SpringBootTest
public class UserServiceTest {

    @Resource
    private UserService userService;

    @Resource
    private UserMapper userMapper;

    @Test
    void testAddUser() {
        User user = new User();
        user.setUserAccount("12345");
        user.setUsername("test");
        user.setAvatarUrl("");
        user.setUserPassword("12345");
        user.setGender(0);
        user.setPhone("123");
        user.setEmail("123");
        user.setUserStatus(0);
        user.setIsDelete(0);
        boolean result = userService.save(user);
        System.out.println(user.getId());
        Assert.assertTrue(result);
    }

    @Test
    void userRegister() {
        String userAccount = "whwh";
        String userPassword = "12345678";
        String checkPassword = "12345678";
        long result = userService.userRegister(userAccount, userPassword, checkPassword);
        System.out.println(result);
    }



    @Test
    void testDeleteUser() {
        long userId = 5;
        boolean result = userService.removeById(userId);
        Assert.assertEquals(true, result);
    }
}