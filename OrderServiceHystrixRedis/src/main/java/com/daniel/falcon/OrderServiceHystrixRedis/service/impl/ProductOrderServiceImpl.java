package com.daniel.falcon.OrderServiceHystrixRedis.service.impl;

import com.daniel.falcon.OrderServiceHystrixRedis.domain.ProductOrder;
import com.daniel.falcon.OrderServiceHystrixRedis.service.ProductClient;
import com.daniel.falcon.OrderServiceHystrixRedis.service.ProductOrderService;
import com.daniel.falcon.OrderServiceHystrixRedis.utils.JsonUtils;
import com.fasterxml.jackson.databind.JsonNode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.UUID;

@Service
public class ProductOrderServiceImpl implements ProductOrderService {


    @Autowired
    private ProductClient productClient;


    @Override

    public ProductOrder save(int userId, int productId) {

        //调用订单服务
        String response = productClient.findById(productId);

        //调用用户服务,主要是获取用名称，用户的级别或者积分信息
        // TODO

        JsonNode  jsonNode = JsonUtils.str2JsonNode(response);

        ProductOrder productOrder = new ProductOrder();
        productOrder.setCreateTime(new Date());
        productOrder.setUserId(userId);
        productOrder.setTradeNo(UUID.randomUUID().toString());
        productOrder.setProductName(jsonNode.get("name").toString());
        productOrder.setPrice(Integer.parseInt(jsonNode.get("price").toString()));
        return productOrder;
    }




}
