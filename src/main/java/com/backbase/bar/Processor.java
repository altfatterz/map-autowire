package com.backbase.bar;

import java.util.Map;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.backbase.foo.MyInterface;

/**
 * Created with IntelliJ IDEA.
 * User: zoltan
 * Date: 8/14/13
 * Time: 2:42 PM
 * To change this template use File | Settings | File Templates.
 */
@Component
public class Processor {

    @Resource(name = "myMap")
    Map<String, MyInterface> impls;

    public Map<String, MyInterface> getImpls() {
        return impls;
    }
}
