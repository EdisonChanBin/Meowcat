package com.sell.testdemo.service.serviceImpl;

import com.sell.testdemo.service.PublishService;
import com.sell.testdemo.vo.PublishVO;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Service
public class PublishServiceImpl implements PublishService {


    /**
     * 发布项目
     * @param publishVO
     * @return
     */
    @Override
    public Object publish(PublishVO publishVO) {
        // TODO: 2018/1/23 保存进入数据库(单表）
        return null;
    }

    /**
     * 根据商家编号获取商品列表
     * 需分页返回
     * @param shopId
     * @return
     */
    @Override
    public Object getOwnList(String shopId,String page ,String rows) {
        // TODO: 2018/1/23 根据id查询数据库，通过limit分页，注意需要额外查询一次返回总条数（多表：关联查询出当前参与的人价格，以及一些拍卖信息）
        return null;
    }

    /**
     * 根据商品编号查询对于的详细信息
     * @param goodsId
     * @return
     */
    @Override
    public Object getGoodsInfo(String goodsId) {
        // TODO: 2018/1/23 根据商品id查询单条数据(多表：关联查询出当前参与的人价格，以及一些拍卖信息)，
        return null;
    }

    /**
     * 下线商品,需要判断是否存在出价者
     * @param goodsId
     * @return
     */
    @Override
    public Object underCarriage(String goodsId) {
        // TODO: 2018/1/24 下线商品,需要关联查询此商品是否已经存在出价者,有的话无法通过,否则可以下线商品
        return null;
    }

    /**
     * 修改商品信息,需要修改状态为待审核
     * @param publishVO
     * @return
     */
    @Override
    public Object updateInfo(PublishVO publishVO) {
        // TODO: 2018/1/24 修改商品信息,前提此商品状态不为上线状态
        return null;
    }

    /**
     * 发货状态更新
     * @param object
     * @return
     */
    @Override
    public Object deliverGoods(Object object) {
        // TODO: 2018/1/24 查询商品发货状态,未发货情况下可以点击发货,更新状态(页面需要输入,快递公司,快递单号)
        return null;
    }

    /**
     * 快递公司列表查询
     * @return
     */
    @Override
    public Object deliverList() {
        // TODO: 2018/1/24 查询redis中是否已经存在公司列表存在的话,直接redis获取信息并返回,否则查询数据库,并丢入redis中返回. 
        return null;
    }
}
