package org.yy.paipai.request.user;

/*
* 文 件 名:  GetUserInfoRequest.java
* 版    权:  YY Technologies Co., Ltd. Copyright 2012-2013,  All rights reserved
* 描    述:   获取用户信息 ，http://pop.paipai.com/api/paipai/user/getUserInfo请求
* 修 改 人:  zhouliang
* 修改时间:  2014年11月28日
* 修改内容:  <修改内容>
*/
import org.yy.paipai.request.AbstractPaiPaiRequest;
import org.yy.paipai.response.user.GetUserInfoResponse;

/**
*  获取用户信息 ，http://pop.paipai.com/api/paipai/user/getUserInfo请求
* 
* @author  zhouliang
* @version  [0.1, 2014年11月28日]
* @since  [paipai-base/0.1]
*/
public class GetUserInfoRequest extends AbstractPaiPaiRequest<GetUserInfoResponse> {
    
    /** {@inheritDoc} */
    @Override
    public String getApiMethodName() {
        return "/user/getUserInfo.xhtml";
    }
    
    /** {@inheritDoc} */
    @Override
    public Class<GetUserInfoResponse> getResponseClass() {
        return GetUserInfoResponse.class;
    }
    
    /**
    *填写要查的用户QQ号码。
    */
    public String getUserUin() {
        return textMap.get("userUin");
    }
    
    /**
    *
    */
    public void setUserUin(String userUin) {
        textMap.put("userUin", userUin);
    }
    
}
