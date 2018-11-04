package com.daniel.falcon.ProductOrderFeign.service;


import com.daniel.falcon.ProductOrderFeign.domain.ProductOrder;

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

    String list();


}
