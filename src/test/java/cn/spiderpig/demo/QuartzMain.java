package cn.spiderpig.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class QuartzMain {

    public static void main(String[] args) {
        new ClassPathXmlApplicationContext("classpath:spring-quartz.xml");
    }

}
