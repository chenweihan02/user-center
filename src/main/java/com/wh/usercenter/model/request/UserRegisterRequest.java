package com.wh.usercenter.model.request;


import lombok.Data;

import java.io.Serializable;

/**
 * @author ChenWeihan
 * @create 2024-02-04 13:58
 */
@Data
public class UserRegisterRequest implements Serializable {

    private static final long serialVersionUID = -4996010210871132284L;

    private String userAccount;
    private String userPassword;
    private String checkPassword;
}
