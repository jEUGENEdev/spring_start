package com.zhenya.spring;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class Tea {
    @Value("${name}")
    private String name;
    @Value("${grade}")
    private String grade;
    @Value("${price}")
    private int price;

    @PostConstruct
    public void init() {
        System.out.println("Starting!");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("Stop!!!");
    }

    @Override
    public String toString() {
        return "Tea{" +
                "name='" + name + '\'' +
                ", grade='" + grade + '\'' +
                ", price=" + price +
                '}';
    }
}
