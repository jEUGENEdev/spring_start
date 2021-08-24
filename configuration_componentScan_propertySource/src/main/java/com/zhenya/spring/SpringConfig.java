package com.zhenya.spring;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.zhenya.spring")
@PropertySource("classpath:file.properties")
public class SpringConfig {
}
