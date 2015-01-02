package org.yy.paipai.model;

/*
* 文 件 名:  ReceiverAddress.java
* 版    权:  YY Technologies Co., Ltd. Copyright 2012-2013,  All rights reserved
* 描    述:  买家收货地址 ,http://pop.paipai.com/api/paipai/user/getReceiverAddressList 
* 修 改 人:  zhouliang
* 修改时间:  2014年11月28日
* 修改内容:  <修改内容>
*/

import java.util.Date;

import org.yy.paipai.api.PaiPaiObject;

/**
* 
* 买家收货地址 ,http://pop.paipai.com/api/paipai/user/getReceiverAddressList 
* @author  zhouliang 
* @version  [0.1, 2014年11月27日]
* @since  [paipai-base/0.1] 
*/
public class ReceiverAddress extends PaiPaiObject {
    
    /**
    * 注释内容
    */
    private static final long serialVersionUID = 610072837335947016L;
    
    /**
     * 收货地址编号
     */
    private Long addressId;
    
    /**
     * 收货地区编号
     */
    private Long regionId;
    
    /**
     * 省份
     */
    private String province;
    
    /**
     * 城市
     */
    private String city;
    
    /**
     * 地区名称
     */
    private String distric;
    
    /**
     * 收货人姓名
     */
    private String name;
    
    /**
     * 收货地址
     */
    private String address;
    
    /**
     * 邮编
     */
    private String postcode;
    
    /**
     * 电话
     */
    private String phone;
    
    /**
     * 手机
     */
    private String mobile;
    
    /**
     * 使用次数
     */
    private Long usedCount;
    
    /**
     * 该地址最后一次使用时间
     */
    private Date lastUsedTime;
    
    /**
     *  	该地址最近一次修改时间
     */
    private Date lastModifyTime;
    
    /**
    * 收货地址编号
    */
    public Long getAddressId() {
        return addressId;
    }
    
    /**
    */
    public void setAddressId(Long addressId) {
        this.addressId = addressId;
    }
    
    /**
    * 收货地区编号
    */
    public Long getRegionId() {
        return regionId;
    }
    
    /**
    */
    public void setRegionId(Long regionId) {
        this.regionId = regionId;
    }
    
    /**
    * 省份
    */
    public String getProvince() {
        return province;
    }
    
    /**
    */
    public void setProvince(String province) {
        this.province = province;
    }
    
    /**
    * 城市
    */
    public String getCity() {
        return city;
    }
    
    /**
    */
    public void setCity(String city) {
        this.city = city;
    }
    
    /**
    * 地区名称
    */
    public String getDistric() {
        return distric;
    }
    
    /**
    */
    public void setDistric(String distric) {
        this.distric = distric;
    }
    
    /**
    * 收货人姓名
    */
    public String getName() {
        return name;
    }
    
    /**
    */
    public void setName(String name) {
        this.name = name;
    }
    
    /**
    * 收货地址
    */
    public String getAddress() {
        return address;
    }
    
    /**
    */
    public void setAddress(String address) {
        this.address = address;
    }
    
    /**
    * 邮编
    */
    public String getPostcode() {
        return postcode;
    }
    
    /**
    */
    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }
    
    /**
    * 电话
    */
    public String getPhone() {
        return phone;
    }
    
    /**
    */
    public void setPhone(String phone) {
        this.phone = phone;
    }
    
    /**
    * 手机
    */
    public String getMobile() {
        return mobile;
    }
    
    /**
    */
    public void setMobile(String mobile) {
        this.mobile = mobile;
    }
    
    /**
    * 使用次数
    */
    public Long getUsedCount() {
        return usedCount;
    }
    
    /**
    */
    public void setUsedCount(Long usedCount) {
        this.usedCount = usedCount;
    }
    
    /**
    * 该地址最后一次使用时间
    */
    public Date getLastUsedTime() {
        return lastUsedTime;
    }
    
    /**
    */
    public void setLastUsedTime(Date lastUsedTime) {
        this.lastUsedTime = lastUsedTime;
    }
    
    /**
    *  	该地址最近一次修改时间
    */
    public Date getLastModifyTime() {
        return lastModifyTime;
    }
    
    /**
    */
    public void setLastModifyTime(Date lastModifyTime) {
        this.lastModifyTime = lastModifyTime;
    }
    
}
