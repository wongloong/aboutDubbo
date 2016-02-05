package com.yks.service;

import com.yks.oms.OrderInterface;

/**
 * Created by wanglong on 16-2-4.
 */
public class OrderServiceImpl implements OrderInterface {
    public void add(String s) {
        System.out.println(s);
    }

    public void orderHasCase() {

    }

    public void add(Object o) {
        System.out.println("objcect:" + o);
    }
}
