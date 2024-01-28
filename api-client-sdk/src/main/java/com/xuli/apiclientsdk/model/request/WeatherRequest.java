package com.xuli.apiclientsdk.model.request;

import com.xuli.apiclientsdk.model.enums.RequestMethodEnum;
import com.xuli.apiclientsdk.model.params.WeatherParams;
import com.xuli.apiclientsdk.model.response.ResultResponse;
import lombok.experimental.Accessors;

/**
 * 获取天气请求
 */
@Accessors(chain = true)
public class WeatherRequest extends BaseRequest<WeatherParams, ResultResponse> {

    @Override
    public String getPath() {
        return "/weather";
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
