package com.sell.testdemo.service;

import com.sell.testdemo.vo.PublishVO;

public interface PublishService {

    /**
     * 发布商品
     * @param publishVO
     * @return
     */
    Object publish(PublishVO publishVO);

    /**
     * 获取自己商家所有商品信息列表
     * @param shopId
     * @return
     */
    Object getOwnList(String shopId,String page ,String rows);

    /**
     * 根据商品ID查询商品详细信息
     * @param goodsId
     * @return
     */
    Object getGoodsInfo(String goodsId);

    /**
     * 下线拍卖中的商品(已经有出价的商品无法下线)
     * @param goodsId
     * @return
     */
    Object underCarriage(String goodsId);

    /**
     * 修改商品的信息,需要修改状态为待审核
     * @param publishVO
     * @return
     */
    Object updateInfo(PublishVO publishVO);

    /**
     * 发货,更新状态
     * @param object
     * @return
     */
    Object deliverGoods(Object object);

    /**
     * 快递公司列表
     * @return
     */
    Object deliverList();
}
