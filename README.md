# User-Center

## 系统概要

- JDK 17
- Spring Boot 3.2.2
- MySQL 8

接口功能待测试

## 用户登录

- 登录、登出
- 注册
- 根据用户名查询用户
- 根据id删除用户


## 数据库设计

```mysql
-- auto-generated definition
create table user
(
    id           bigint auto_increment comment '主键'
        primary key,
    userAccount  varchar(255)                       null comment '登录账号',
    username     varchar(255)                       null comment '昵称',
    avatarUrl    varchar(255)                       null comment '头像',
    userPassword varchar(255)                       null comment '密码',
    gender       tinyint                            null comment '性别',
    phone        varchar(255)                       null comment '电话',
    email        varchar(255)                       null comment '邮箱',
    userStatus   int                                null comment '用户状态 0:不正常 1:正常',
    role         int      default 0                 null comment '0 - 普通用户 1 - 管理员',
    createTime   datetime default CURRENT_TIMESTAMP null comment '创建时间',
    updateTime   datetime default CURRENT_TIMESTAMP null on update CURRENT_TIMESTAMP comment '更新时间',
    isDelete     tinyint  default 0                 null comment '是否删除'
);
```







