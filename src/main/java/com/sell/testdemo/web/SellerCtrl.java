package com.sell.testdemo.web;

import com.sell.testdemo.service.PublishService;
import com.sell.testdemo.vo.PublishVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 商户商品相关功能
 * 1.0版本包含
 * 发布商品  入参：拍卖商品的基本信息字段等
 * 查看自己发布的商品列表 入参：商户ID
 * 查看发布的商品详细信息 入参：商品ID
 */
@RestController("seller")
public class SellerCtrl {

    final static String ROWS="10";

    @Autowired
    PublishService publishService;

    /**
     * 发布商品，VO可以自定义入参详情，字段根据需要添加
     * @param publishVO
     * @return
     */
    @PostMapping("publish")
    public Object publish(PublishVO publishVO){
        if(publishVO!=null){
            if(publishVO.getShopName()!=null){
                return publishService.publish(publishVO);
            }
        }
        // TODO: 2018/1/23 返回数据不正确信息
        return null;
    }

    /**
     * 查询商户所有商品信息，分页返回信息
     * @param shopId
     * @return
     */
    @GetMapping("getOwnList")
    public Object getOwnList(String shopId,String page,String rows){
        if (rows==null || rows.length()==0){
            rows=ROWS;
        }
        if (shopId!=null && shopId.length()>0 && page!=null && page.length()>0){
            publishService.getOwnList(shopId,page,rows);
        }
        // TODO: 2018/1/23 返回数据不正确信息
        return null;
    }

    /**
     * 查询商品详情
     * @param goodsId
     * @return
     */
    @GetMapping("getGoodsInfo")
    public Object getGoodsInfo(String goodsId){
        if (goodsId!=null && goodsId.length()>0){
            publishService.getGoodsInfo(goodsId);
        }
        // TODO: 2018/1/23 返回数据不正确信息
        return null;
    }

    /**
     * 下线当前拍卖的商品,(有竞拍的不能下线,只能下线没有被出价的)
     * @param goodsId
     * @return
     */
    @PostMapping("underCarriage")
    public Object underCarriage(String goodsId){
        if(goodsId !=null && goodsId.length()>0){
            publishService.underCarriage(goodsId);
        }
        // TODO: 2018/1/24 返回数据不正确信息
        return null;
    }

    /**
     * 修改商品申请信息
     * @param publishVO
     * @return
     */
    @PostMapping("updateInfo")
    public Object updateInfo(PublishVO publishVO){
        if(publishVO!=null){
            if(publishVO.getShopName()!=null){
                return publishService.updateInfo(publishVO);
            }
        }
        // TODO: 2018/1/24 返回数据不正确信息
        return null;
    }


    /**
     * 发货功能(线上交易,需要录入快递公司,以及快递单号)
     * @param object
     * @return
     */
    @PostMapping("deliverGoods")
    public Object deliverGoods(Object object){
        // TODO: 2018/1/24 判断object不为null
            publishService.deliverGoods(object);
        // TODO: 2018/1/24 返回数据不正确信息
        return null;
    }

    /**
     * 线上交易绑定功能模块,获取所有快递列表,前端以下拉选选择,可以丢入redis缓存(此数据基本不会做修改)
     * @return
     */
    @GetMapping("deliverList")
    public Object deliverList(){
        publishService.deliverList();
        // TODO: 2018/1/24 返回数据不正确信息
        return null;
    }



}
