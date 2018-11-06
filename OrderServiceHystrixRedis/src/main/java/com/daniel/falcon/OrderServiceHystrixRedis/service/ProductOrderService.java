package com.daniel.falcon.OrderServiceHystrixRedis.service;

import com.daniel.falcon.OrderServiceHystrixRedis.domain.ProductOrder;

/**
 * 订单业务类
 */
public interface ProductOrderService {

    /**
     * 下单接口
     * @param userId
     * @param productId
     * @return
     */
     ProductOrder save(int userId, int productId);


}
