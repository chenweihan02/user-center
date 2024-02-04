package com.wh.usercenter.model.request;

import lombok.Data;

import java.io.Serializable;

/**
 * @author ChenWeihan
 * @create 2024-02-04 14:06
 */
@Data
public class UserLoginRequest implements Serializable {

    private static final long serialVersionUID = -1255496593353870641L;

    private String userAccount;
    private String userPassword;
}
