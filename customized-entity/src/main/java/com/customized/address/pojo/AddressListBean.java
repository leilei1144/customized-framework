package com.customized.address.pojo;

import java.io.Serializable;

/**
 * Created by Administrator on 2016/9/20.
 */
public class AddressListBean implements Serializable {
    /**
     *takeName:收货人
     *takeAddress:收货地址
     *takePhone:收货电话
     *rechargeTel:虚拟物品收货电话
     *rechargeQQ:虚拟物品收货qq
     *thirdAddress:第三方支付账号（支付宝）
     *thirdName：第三方支付昵称
     * */
    private static final long serialVersionUID = 1L;
    private String takeName;
    private String takeAddress;
    private String takePhone;
    private String rechargeTel;
    private String rechargeQQ;
    private String thirdAddress;
    private String thirdName;

    public String getTakeName() {
        return takeName;
    }

    public void setTakeName(String takeName) {
        this.takeName = takeName;
    }

    public String getTakeAddress() {
        return takeAddress;
    }

    public void setTakeAddress(String takeAddress) {
        this.takeAddress = takeAddress;
    }

    public String getTakePhone() {
        return takePhone;
    }

    public void setTakePhone(String takePhone) {
        this.takePhone = takePhone;
    }

    public String getRechargeTel() {
        return rechargeTel;
    }

    public void setRechargeTel(String rechargeTel) {
        this.rechargeTel = rechargeTel;
    }

    public String getRechargeQQ() {
        return rechargeQQ;
    }

    public void setRechargeQQ(String rechargeQQ) {
        this.rechargeQQ = rechargeQQ;
    }

    public String getThirdAddress() {
        return thirdAddress;
    }

    public void setThirdAddress(String thirdAddress) {
        this.thirdAddress = thirdAddress;
    }

    public String getThirdName() {
        return thirdName;
    }

    public void setThirdName(String thirdName) {
        this.thirdName = thirdName;
    }

    public AddressListBean(String takeName, String takeAddress, String takePhone, String rechargeTel, String rechargeQQ, String thirdAddress, String thirdName) {
        this.takeName = takeName;
        this.takeAddress = takeAddress;
        this.takePhone = takePhone;
        this.rechargeTel = rechargeTel;
        this.rechargeQQ = rechargeQQ;
        this.thirdAddress = thirdAddress;
        this.thirdName = thirdName;
    }

    public AddressListBean() {
    }
}
