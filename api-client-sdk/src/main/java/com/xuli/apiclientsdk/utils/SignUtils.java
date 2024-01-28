package com.xuli.apiclientsdk.utils;


import cn.hutool.crypto.digest.DigestAlgorithm;
import cn.hutool.crypto.digest.Digester;

public class SignUtils {
    /**
     * 生成签名
     * @param body
     * @param secretKey
     * @return
     */
    public static String getSign(String body, String secretKey) {
        //使用SHA256算法的Digester
        Digester md5 = new Digester(DigestAlgorithm.SHA256);
        //构建签名内容，将hashmap中的内容转化为字符串并与secretKey拼接
        String content = body + "." + secretKey;
        return md5.digestHex(content);
    }
}
