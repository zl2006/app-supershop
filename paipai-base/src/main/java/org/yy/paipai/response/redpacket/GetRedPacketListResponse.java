package org.yy.paipai.response.redpacket;

/*
* 文 件 名:  GetRedPacketListResponse.java
* 版    权:  YY Technologies Co., Ltd. Copyright 2012-2013,  All rights reserved
* 描    述:  查询红包或优惠券列表接口 ,http://pop.paipai.com/api/paipai/redpacket/getRedPacketList响应
* 修 改 人:  zhouliang
* 修改时间:  2014年11月28日
* 修改内容:  <修改内容>
*/

import java.util.List;

import org.yy.paipai.api.PaiPaiResponse;
import org.yy.paipai.model.RedPacket;

/**
* 查询红包或优惠券列表接口 ,http://pop.paipai.com/api/paipai/redpacket/getRedPacketList响应
* 
* @author  zhouliang
* @version  [0.1, 2014年11月28日]
* @since  [paipai-base/0.1]
*/
public class GetRedPacketListResponse extends PaiPaiResponse {
    
     /**
     * 注释内容
     */
    private static final long serialVersionUID = 8333412453993797601L;

    /**
     * 总记录数
     */
    private Long totalCount;
    
    /**
     *  	list 		红包列表
     */
    private List<RedPacket> redPacketList;
    
    /**
    * 总记录数
    */
    public Long getTotalCount() {
        return totalCount;
    }
    
    /**
    */
    public void setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
    }
    
    /**
    *  	list 		红包列表
    */
    public List<RedPacket> getRedPacketList() {
        return redPacketList;
    }
    
    /**
    */
    public void setRedPacketList(List<RedPacket> redPacketList) {
        this.redPacketList = redPacketList;
    }
    
}
