package com.xuli.apiclientsdk.model.request;

import com.xuli.apiclientsdk.model.enums.RequestMethodEnum;
import com.xuli.apiclientsdk.model.params.NameParams;
import com.xuli.apiclientsdk.model.response.NameResponse;
import lombok.experimental.Accessors;

/**
 * 获取用户名
 */
@Accessors(chain = true)
public class NameRequest extends BaseRequest<NameParams, NameResponse> {

    @Override
    public String getPath() {
        return "/name";
    }

    /**
     * 获取响应类
     *
     * @return {@link Class}<{@link NameResponse}>
     */
    @Override
    public Class<NameResponse> getResponseClass() {
        return NameResponse.class;
    }


    @Override
    public String getMethod() {
        return RequestMethodEnum.GET.getValue();
    }
}
