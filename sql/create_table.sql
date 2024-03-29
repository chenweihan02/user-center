# 数据库初始化

# 用户表
create table user
(
    id           bigint auto_increment comment '主键'
        primary key,
    userAccount  varchar(255) null comment '登录账号',
    username     varchar(255) null comment '昵称',
    avatarUrl    varchar(255) null comment '头像',
    userPassword varchar(255) null comment '密码',
    gender       tinyint null comment '性别',
    phone        varchar(255) null comment '电话',
    email        varchar(255) null comment '邮箱',
    userStatus   int null comment '用户状态 0:不正常 1:正常',
    role         int      default 0 null comment '0 - 普通用户 1 - 管理员',
    createTime   datetime default CURRENT_TIMESTAMP null comment '创建时间',
    updateTime   datetime default CURRENT_TIMESTAMP null on update CURRENT_TIMESTAMP comment '更新时间',
    isDelete     tinyint  default 0 null comment '是否删除'
) comment '用户';