package com.xuli.apiclientsdk.model.request;

import com.xuli.apiclientsdk.model.enums.RequestMethodEnum;
import com.xuli.apiclientsdk.model.response.LoveResponse;
import lombok.experimental.Accessors;

/**
 *  随机情话请求
 */
@Accessors(chain = true)
public class LoveRequest extends BaseRequest<String, LoveResponse> {

    @Override
    public String getPath() {
        return "/loveTalk";
    }

    /**
     * 获取响应类
     */
    @Override
    public Class<LoveResponse> getResponseClass() {
        return LoveResponse.class;
    }


    @Override
    public String getMethod() {
        return RequestMethodEnum.GET.getValue();
    }
}
