package com.sell.testdemo.service.serviceImpl;

import com.sell.testdemo.service.BuyerService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by Administrator on 2018/1/24.
 */
@Service
@Transactional
public class BuyerServiceImpl implements BuyerService {


    /**
     * 拍卖出价
     * @param object
     * @return
     */
    @Override
    public Object buyGoods(Object object) {
        // TODO: 2018/1/24 考虑并发问题,需要使用乐观所,增加version字段控制
        return null;
    }

    /**
     * 一口价购买
     * @param object
     * @return
     */
    @Override
    public Object fixedPrice(Object object) {
        // TODO: 2018/1/24 直接把商品和用户信息放入成功交易表
        return null;
    }

    @Override
    public Object deliverInfo(Object object) {
        // TODO: 2018/1/24  根据传入的id查询对应的表中数据,若已经发货,提供查询物流按钮,并调用第三方接口查询物流信息返回 
        return null;
    }

    @Override
    public Object receipt() {
        // TODO: 2018/1/24 点击确认按钮,更新明细表,订单状态修改为已完成(需商家发货,线上版本)
        // TODO: 2018/1/24 点击确认按钮,更新明细表,订单状态修改为已完成,线下交易,无需商家发货
        return null;
    }
}
