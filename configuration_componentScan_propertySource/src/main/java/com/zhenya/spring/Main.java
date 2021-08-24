package com.zhenya.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        Tea tea = context.getBean("tea", Tea.class);
        context.close();
        System.out.println(tea);
    }
}
