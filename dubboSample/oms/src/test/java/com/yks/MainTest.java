package com.yks;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * Created by wanglong on 16-2-4.
 */
public class MainTest {
    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        System.out.println("服务端启动提供服务");
        classPathXmlApplicationContext.start();
        synchronized (MainTest.class) {
            while (true) {
                try {
                    MainTest.class.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
