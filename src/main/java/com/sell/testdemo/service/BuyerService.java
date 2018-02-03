package com.sell.testdemo.service;

/**
 * Created by Administrator on 2018/1/24.
 */
public interface BuyerService {

    /**
     * 出价拍卖
     * @param object
     * @return
     */
    Object buyGoods(Object object);

    /**
     * 一口价
     * @param object
     * @return
     */
    Object fixedPrice(Object object);

    /**
     * 商品物流信息
     * @param object
     * @return
     */
    Object deliverInfo(Object object);

    /**
     * 收货确认
     * @return
     */
    Object receipt();
}
