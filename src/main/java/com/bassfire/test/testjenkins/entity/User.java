package com.bassfire.test.testjenkins.entity;

import lombok.Data;

/**
 * @Description
 * @Author fengguangbao
 * @Date 2021/8/31 10:45
 */
@Data
public class User {
    private Long id;
    private String name;
    private int age;
    private String email;
}
