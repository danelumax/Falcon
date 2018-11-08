package com.daniel.falcon.OrderServiceHystrix.service.impl;

import com.daniel.falcon.OrderServiceHystrix.domain.ProductOrder;
import com.daniel.falcon.OrderServiceHystrix.service.ProductClient;
import com.daniel.falcon.OrderServiceHystrix.service.ProductOrderService;
import com.fasterxml.jackson.databind.JsonNode;
import net.xdclass.order_service.utils.JsonUtils;
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

        String response = productClient.findById(productId);

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
