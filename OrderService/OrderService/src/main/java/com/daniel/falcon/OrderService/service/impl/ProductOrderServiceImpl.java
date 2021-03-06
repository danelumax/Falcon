package com.daniel.falcon.OrderService.service.impl;

import com.daniel.falcon.OrderService.domain.ProductOrder;
import com.daniel.falcon.OrderService.service.ProductOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Date;
import java.util.Map;
import java.util.UUID;

@Service
public class ProductOrderServiceImpl implements ProductOrderService {


    @Autowired
    private RestTemplate restTemplate;

    @Override
    public ProductOrder save(int userId, int productId) {

        Map<String,Object> productMap = restTemplate.getForObject(
                String.format("http://product-service/api/v1/product/find?id=%s", productId),
                Map.class);

        ProductOrder productOrder = new ProductOrder();
        productOrder.setCreateTime(new Date());
        productOrder.setUserId(userId);
        productOrder.setTradeNo(UUID.randomUUID().toString());
        productOrder.setProductName(productMap.get("name").toString());
        productOrder.setPrice(Integer.parseInt(productMap.get("price").toString()));

        return productOrder;
    }
}
