package com.sell.testdemo.service;

/**
 * Created by Administrator on 2018/1/24.
 */
public interface ExamineService {

    /**
     * 审核发布商品
     * @param goodsId
     * @return
     */
    Object publishExamine(String goodsId);

    /**
     * 申请成为商户
     * @param object
     */
    Object beSeller(Object object);

    /**
     * 审核商户资格
     * @param object
     * @return
     */
    Object sellerExamine(Object object);

    /**
     * 修改审核信息
     * @param object
     * @return
     */
    Object updateSellerInfo(Object object);

    /**
     * 获取审核列表
     * @param object
     * @return
     */
    Object sellerExamineList(Object object);
}
