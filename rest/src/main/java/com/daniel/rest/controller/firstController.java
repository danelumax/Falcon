package com.daniel.rest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.Map;

@RestController
public class firstController {

    @RequestMapping(method = RequestMethod.GET, value = "/api/test")
    public Map<String, String> getFirstMessage() {
        Map<String, String> map = new HashMap<>();
        map.put("defaultView", "first");
        return map;
    }
}
