package com.backbase.bar;

import java.util.Map;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.backbase.foo.MyInterface;

@Component
public class Processor {

    @Resource(name = "myMap")
    Map<String, MyInterface> impls;

    public Map<String, MyInterface> getImpls() {
        return impls;
    }
}
