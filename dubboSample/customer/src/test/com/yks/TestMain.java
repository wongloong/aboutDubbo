package com.yks;

import com.yks.oms.OrderInterface;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by wanglong on 16-2-4.
 */
public class TestMain {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("customer.xml");
        classPathXmlApplicationContext.start();
        OrderInterface orderService = (OrderInterface) classPathXmlApplicationContext.getBean("orderService");
        String message = "test";
        orderService.add(message);
    }
}
