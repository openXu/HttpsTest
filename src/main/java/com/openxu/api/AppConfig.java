package com.openxu.api;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Author: openXu
 * Time: 2022/5/3 23:12
 * class: AppConfig
 * Description:
 */

@Configuration
@ComponentScan("com.openxu.api")
@MapperScan("com.openxu.api.mapper") //扫描该包下所有的接口并为该接口生成实现类
public class AppConfig {
}
