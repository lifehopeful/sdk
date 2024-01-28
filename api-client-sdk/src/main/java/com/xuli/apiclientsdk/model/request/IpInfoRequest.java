package com.xuli.apiclientsdk.model.request;

import com.xuli.apiclientsdk.model.params.IpInfoParams;
import com.xuli.apiclientsdk.model.response.ResultResponse;
import com.xuli.apiclientsdk.model.enums.RequestMethodEnum;
import lombok.experimental.Accessors;

/**
 *  获取ip地址请求
 */
@Accessors(chain = true)
public class IpInfoRequest extends BaseRequest<IpInfoParams, ResultResponse> {

    @Override
    public String getPath() {
        return "/ipInfo";
    }

    /**
     * 获取响应类
     */
    @Override
    public Class<ResultResponse> getResponseClass() {
        return ResultResponse.class;
    }


    @Override
    public String getMethod() {
        return RequestMethodEnum.GET.getValue();
    }
}
