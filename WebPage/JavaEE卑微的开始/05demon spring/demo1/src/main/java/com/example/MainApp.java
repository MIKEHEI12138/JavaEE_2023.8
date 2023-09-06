package com.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        // 创建Spring容器并加载配置类
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);

        // 获取Bean
        HelloWorld helloWorld = context.getBean(HelloWorld.class);

        // 调用Bean的方法
        helloWorld.setMessage("Hello, Spring!");
        helloWorld.getMessage();
    }
}
