package io.github.geniusv.util;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.Map;

/**
 * Copyright 2017 GeniusV
 * All rights reserved.
 * Created by GeniusV on 8/13/17.
 */
public class MapToJsonUtil {
    public static String toJson(Map<String, Object> map) {
        String str = null;
        try {
            str = new ObjectMapper().writeValueAsString(map);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return str;
    }
}
