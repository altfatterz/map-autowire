package com.backbase.foo;

import com.backbase.foo.MyInterface;

/**
 * Created with IntelliJ IDEA.
 * User: zoltan
 * Date: 8/14/13
 * Time: 2:39 PM
 * To change this template use File | Settings | File Templates.
 */
public class MyImpl1 implements MyInterface {

    @Override
    public void sayHello() {
        System.out.println("MyImpl1");
    }
}
