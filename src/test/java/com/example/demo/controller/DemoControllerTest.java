package com.example.demo.controller;

import com.google.common.collect.Lists;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Optional;


class DemoControllerTest {

    @Test
    public void testJava8Optional(){
        List List = null;
        Optional<List> optional =  Optional.ofNullable(List);
        if (optional.isPresent()){
            assert optional.get()  == null;
        }
        Object List1 = optional.orElse(Lists.newArrayList()).stream().findFirst().orElse(new Object());
        assert List1 != null;

        Object List2 = optional.orElseGet(() -> {
            return Lists.newArrayList();
        });
        assert List2 == null;
    }

    @Test
    public void testJava8Stream(){

    }

}