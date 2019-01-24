package com.daniel.rest;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.View;
import org.springframework.web.servlet.view.ContentNegotiatingViewResolver;
import org.springframework.web.servlet.view.json.MappingJackson2JsonView;

import java.util.ArrayList;
import java.util.List;

@Component
public class JsonMapping {
    @Bean
    MappingJackson2JsonView mappingJackson2JsonView(){
        return new MappingJackson2JsonView();
    }

    @Bean
    ContentNegotiatingViewResolver contentNegotiatingViewResolver(){
        ContentNegotiatingViewResolver cnvr = new ContentNegotiatingViewResolver();
        List<View> list = new ArrayList();
        list.add(mappingJackson2JsonView());
        cnvr.setDefaultViews(list);
        return cnvr;
    }
}
