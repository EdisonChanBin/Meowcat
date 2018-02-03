package com.sell.meowcat.web;

import com.sell.meowcat.service.BuyerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2018/1/24.
 */
@RestController
public class BuyerCtrl {

    @Autowired
    BuyerService buyerService;

    /**
     * 出价购买商品
     * 入参:价格,用户id,商品id
     * @param object
     * @return
     */
    public Object buyGoods(Object object){
        // TODO: 2018/1/24 判断object,以及包含的字段不为null
        buyerService.buyGoods(object);
        return null;
    }

    /**
     * 一口价购买
     * 入参:商品id,用户id
     * @param object
     * @return
     */
    public Object fixedPrice(Object object){
        // TODO: 2018/1/24 判断object,以及包含的字段不为null
        buyerService.fixedPrice(object);
        return null;
    }

    /**
     * 查看物流信息(线上交易)
     * 入参:商品id
     * @param object
     * @return
     */
    public Object deliverInfo(Object object){
        // TODO: 2018/1/24 判断object,以及包含的字段不为null
        buyerService.deliverInfo(object);
        return null;
    }

    /**
     * 收货确认
     * @return
     */
    public Object receipt(){
        buyerService.receipt();
        return null;
    }
}
