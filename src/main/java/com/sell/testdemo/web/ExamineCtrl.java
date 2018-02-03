package com.sell.testdemo.web;

import com.sell.testdemo.service.ExamineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Chanb on 2018/1/24.
 * 审核模块
 */
@RestController("examine")
public class ExamineCtrl {

    final static String ROWS="10";

    @Autowired
    ExamineService examineService;

    /**
     * 审核发布产品
     * @param goodsId
     * @return
     */
    @PostMapping("publishExamine")
    public Object publishExamine(String goodsId){
        if(goodsId != null && goodsId.length()>0){
            examineService.publishExamine(goodsId);
        }
        // TODO: 2018/1/24 返回数据不正确信息
        return null;
    }

    /**
     * 申请成为卖家
     * 入参:一些页面填的信息字段
     * @param object
     * @return
     */
    @PostMapping("beSeller")
    public Object beSeller(Object object){
        if(object != null){
            // TODO: 2018/1/24  判断核心字段不为null
            examineService.beSeller(object);
        }
        // TODO: 2018/1/24 返回数据不正确信息
        return null;
    }

    /**
     * 修改申请信息需驳回状态
     * 入参:一些页面的信息字段
     * @param object
     * @return
     */
    @PostMapping("updateSellerInfo")
    public Object updateSellerInfo(Object object){
        if(object != null){
            // TODO: 2018/1/24  判断核心字段不为null
            examineService.updateSellerInfo(object);
        }
        // TODO: 2018/1/24 返回数据不正确信息
        return null;
    }

    /**
     * 商户资格审核
     * 入参:商户id
     * @param object
     * @return
     */
    @PostMapping("sellerExamine")
    public Object sellerExamine(Object object){
        if(object != null){
            // TODO: 2018/1/24  判断核心字段不为null
            examineService.sellerExamine(object);
        }
        // TODO: 2018/1/24 返回数据不正确信息
        return null;
    }

    /**
     * 需要传入分页参数,未传入每页条数默认每页10条
     * @param object
     * @return
     */
    @GetMapping("sellerExamineList")
    public Object sellerExamineList(Object object,String rows){
        if (rows==null || rows.length()==0){
            rows=ROWS;
        }
        if(object != null){
            // TODO: 2018/1/24  判断核心字段不为null
            examineService.sellerExamineList(object);
        }
        // TODO: 2018/1/24 返回数据不正确信息
        return null;
    }
}
