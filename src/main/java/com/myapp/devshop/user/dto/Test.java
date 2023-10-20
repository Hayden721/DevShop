package com.myapp.devshop.user.dto;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter

public class Test {
    private String userid;
    private int age;

    public Test() {
    }

    public Test(String userid, int age) {
        this.userid = userid;
        this.age = age;
    }
}
