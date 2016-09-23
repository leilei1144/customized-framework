package com.customized.qiniu;

import com.qiniu.common.Config;
import com.qiniu.common.QiniuException;
import com.qiniu.common.Zone;
import com.qiniu.http.Response;
import com.qiniu.storage.UploadManager;
import com.qiniu.util.Auth;
import com.qiniu.util.StringMap;

import java.io.File;
import java.io.IOException;
import java.util.Calendar;

/**
 * Created by grant on 16/8/29.
 */
public class QiniuUpload {
    //设置好账号的ACCESS_KEY和SECRET_KEY
    String ACCESS_KEY = "zk40zyIo0Fi42xDsO6jwJJd9LSFXiWHGPEH_D2V9";
    String SECRET_KEY = "fd2N2vjxoF4n1Id1UOlgy3AneczMYPeA3msQaPw_";
    //要上传的空间
    String bucketname = "qizitech";


    //密钥配置
    Auth auth = Auth.create(ACCESS_KEY, SECRET_KEY);
    //创建上传对象
    UploadManager uploadManager = new UploadManager();

    //简单上传，使用默认策略，只需要设置上传的空间名就可以了
    public String getUpToken(){
        return auth.uploadToken(bucketname);
    }

    public String  upload(File filePath ) throws IOException{
        Calendar calendar = Calendar.getInstance();
        long key = calendar.getTimeInMillis();
        try {
            Config.zone = Zone.zone1();
            //调用put方法上传
            Response res = uploadManager.put(filePath, String.valueOf(key), getUpToken());
            //打印返回的信息
            System.out.println(res.bodyString());
        } catch (QiniuException e) {
            Response r = e.response;
            // 请求失败时打印的异常的信息
            System.out.println(r.toString());
            try {
                //响应的文本信息
                System.out.println(r.bodyString());
            } catch (QiniuException e1) {
                //ignore
            }
        }
        //返回七牛内的key用于网络访问
        return String.valueOf(key);
    }
    public static void main(String args[]) throws IOException{
        //上传文件的路径
        String FilePath = "/Users/grant/Downloads/2303154_100.jpg";
        File file = new File(FilePath);
        String key = new QiniuUpload().upload(file);
    }
}
