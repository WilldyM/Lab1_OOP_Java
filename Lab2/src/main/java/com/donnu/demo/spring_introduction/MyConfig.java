package com.donnu.demo.spring_introduction;

import org.springframework.context.annotation.*;

@Configuration
//@ComponentScan("com.donnu.demo.spring_introduction")
@PropertySource("classpath:myApp.properties")
public class MyConfig {

    @Bean
    @Scope("singleton")
    public Pet catBean() {
        return new Cat();
    }

    @Bean
    public Car toyotaBean() {
        return new Toyota();
    }

    @Bean
    public Employee employeeBean() {
        return new Employee(catBean(), toyotaBean());
    }
}
