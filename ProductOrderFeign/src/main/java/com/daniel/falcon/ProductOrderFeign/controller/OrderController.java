package com.daniel.falcon.ProductOrderFeign.controller;

import com.daniel.falcon.ProductOrderFeign.service.ProductOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("api/v1/order")
public class OrderController {


    @Autowired
    private ProductOrderService productOrderService;


    @RequestMapping("save")
    public Object save(@RequestParam("user_id")int userId, @RequestParam("product_id") int productId){
        return productOrderService.save(userId, productId);
    }

    @RequestMapping("list")
    public Object list(){
        return productOrderService.list();
    }




}
