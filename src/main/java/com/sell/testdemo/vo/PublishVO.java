package com.sell.testdemo.vo;

import java.io.Serializable;

public class PublishVO implements Serializable{

    private String shopName;//拍卖的产品

    //其他的拍卖详情信息
    //private String ...


    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }
}
