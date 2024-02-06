package com.wh.usercenter.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * knife4j 配置类
 *
 * @author ChenWeihan
 * @create 2024-02-06 11:35
 */
@Configuration
public class OpenApiConfig {

    @Bean
    public OpenAPI springShopOpenAPI() {
        return new OpenAPI()
                // 接口文档标题
                .info(new Info().title("用户管理中心接口文档")
                        // 接口文档简介
                        .description("这是基于Knife4j OpenApi3的接口文档")
                        // 接口文档版本
                        .version("v1.0"));
    }
}
