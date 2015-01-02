import org.yy.paipai.api.ApiException;
import org.yy.paipai.api.DefaultPaiPaiClient;
import org.yy.paipai.api.PaiPaiClient;
import org.yy.paipai.request.yingxiao.GetLtdActiveRequest;
import org.yy.paipai.response.yingxiao.GetLtdActiveResponse;

/*
* 文 件 名:  PaiPaiClientTest.java
* 版    权:  YY Technologies Co., Ltd. Copyright 2012-2013,  All rights reserved
* 描    述:  <描述>
* 修 改 人:  zhouliang
* 修改时间:  2014年11月27日
* 修改内容:  <修改内容>
*/

/**
* <一句话功能简述>
* <功能详细描述>
* 
* @author  zhouliang
* @version  [版本号, 2014年11月27日]
* @since  [产品/模块版本]
*/
public class PaiPaiClientTest {
    public static void main(String[] args)
        throws ApiException {
        PaiPaiClient client = new DefaultPaiPaiClient("http://api.paipai.com", "700218304", "XlL1LVvIgYqitW4l");
        
        //        SellerSearchItemListRequest req = new SellerSearchItemListRequest();
        //        req.setSellerUin(18723351l);
        //        SellerSearchItemListResponse rep = client.execute(req, "a9935adcda584f874cc43f2954fbeb22", "18723351");
        //        System.out.println( rep.getBody() );
        //        
        
        GetLtdActiveRequest req1 = new GetLtdActiveRequest();
        GetLtdActiveResponse rep1 = client.execute(req1, "a9935adcda584f874cc43f2954fbeb22", "18723351");
        System.out.println(rep1.getBody());
        
    }
}
