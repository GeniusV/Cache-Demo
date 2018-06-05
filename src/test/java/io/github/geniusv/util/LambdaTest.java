package io.github.geniusv.util;

import io.github.geniusv.dao.model.User;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

/**
 * Copyright 2017 GeniusV
 * All rights reserved.
 * Created by GeniusV on 8/13/17.
 */
public class LambdaTest {

    @Test
    public void testLambda() {
        Map<String, Object> map = new HashMap<>();

        for (int i = 0; i <= 10; i++) {
            User user = new User();
            user.setUserName("test");
            map.put("user"+ i, user);
        }
        System.out.println();

        map.forEach((String, Object) -> {
            System.out.println(String + Object.toString());
        });
    }
}
