package com.sell.testdemo.service.serviceImpl;

import com.sell.testdemo.service.ExamineService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by Administrator on 2018/1/24.
 */
@Service
@Transactional
public class ExamineServiceImpl implements ExamineService {

    /**
     * 审核商品发布
     * @param goodsId
     * @return
     */
    @Override
    public Object publishExamine(String goodsId){
        // TODO: 2018/1/24 审核商品,需要审核状态,此条数据是否已经被操作
        return null;
    }

    /**
     * 申请成为商户
     * @param object
     * @return
     */
    @Override
    public Object beSeller(Object object) {
        // TODO: 2018/1/24 输入一些申请信息,存入单表中 
        return null;
    }

    /**
     * 审核商户资格
     * @param object
     * @return
     */
    @Override
    public Object sellerExamine(Object object) {
        // TODO: 2018/1/24 需要判断当前商户资格后,判断是否通过还是驳回.成功存入商家表
        return null;
    }

    /**
     * 修改申请资格信息
     * @param object
     * @return
     */
    @Override
    public Object updateSellerInfo(Object object) {
        // TODO: 2018/1/24 只有当驳回后才可以修改,其余情况不予修改
        return null;
    }

    /**
     * 获取审核列表
     * @param object
     * @return
     */
    @Override
    public Object sellerExamineList(Object object) {
        // TODO: 2018/1/24 获取审核列表需要通过limit分页,另外友好提供部分字段检索
        return null;
    }

}
