package org.yy.paipai.request.album;

/*
* 文 件 名:  UploadPaiPaiAlbumImageRequest.java
* 版    权:  YY Technologies Co., Ltd. Copyright 2012-2013,  All rights reserved
* 描    述:  上传图片到拍拍相册 ,http://pop.paipai.com/api/paipai/album/uploadPaiPaiAlbumImage请求
* 修 改 人:  zhouliang
* 修改时间:  2014年11月28日
* 修改内容:  <修改内容>
*/
import org.yy.paipai.request.AbstractPaiPaiUploadRequest;
import org.yy.paipai.response.album.UploadPaiPaiAlbumImageResponse;
import org.yy.paipai.util.FileItem;

/**
* 上传图片到拍拍相册 ,http://pop.paipai.com/api/paipai/album/uploadPaiPaiAlbumImage请求
* 
* @author  zhouliang
* @version  [0.1, 2014年11月28日]
* @since  [paipai-base/0.1]
*/
public class UploadPaiPaiAlbumImageRequest extends AbstractPaiPaiUploadRequest<UploadPaiPaiAlbumImageResponse> {
    
    /** {@inheritDoc} */
    @Override
    public String getApiMethodName() {
        return "/album/uploadPaiPaiAlbumImage.xhtml ";
    }
    
    /** {@inheritDoc} */
    @Override
    public Class<UploadPaiPaiAlbumImageResponse> getResponseClass() {
        return UploadPaiPaiAlbumImageResponse.class;
    }
    
    /**
    *路径：拍拍相册上的目录路径ID，格式一般为：/目录ID(该ID可通过getPaiPaiAlbumList接口查询)/ 。path字段值要满足以下正则：/([A-F0-9]{8}(?:-[A-F0-9]{4}){3}-[A-Z0-9]{12}/){0,2}$ 例如: /a70344ad-09cc-4e3d-a884-5b77401725ad/
    */
    public String getPath() {
        return textMap.get("path");
    }
    
    /**
    *
    */
    public void setPath(String path) {
        textMap.put("path", path);
    }
    
    /**
    *图片文件：要上传的图片文件内容;注意这里不是url,并且http请求类型请参看接口说明
    */
    public FileItem getPic() {
        return fileParams.get("pic");
    }
    
    /**
    *
    */
    public void setPic(FileItem pic) {
        fileParams.put("pic", pic);
    }
    
    /**
    *文件名称：拍拍相册上的文件名称:必须满足以下正则:^[^\\\\/:*?\"<>|\r\n]+\\.(jpg|gif|png|bmp|swf)$
    */
    public String getFileName() {
        return textMap.get("fileName");
    }
    
    /**
    *
    */
    public void setFileName(String fileName) {
        textMap.put("fileName", fileName);
    }
    
}
