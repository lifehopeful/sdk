package com.xuli.apiclientsdk.model.request;

import com.xuli.apiclientsdk.model.enums.RequestMethodEnum;
import com.xuli.apiclientsdk.model.params.RandomWallpaperParams;
import com.xuli.apiclientsdk.model.response.RandomWallpaperResponse;
import lombok.experimental.Accessors;

/**
 * 随机壁纸请求
 */
@Accessors(chain = true)
public class RandomWallpaperRequest extends BaseRequest<RandomWallpaperParams, RandomWallpaperResponse> {
    @Override
    public String getPath() {
        return "/randomWallpaper";
    }

    /**
     * 获取响应类
     */
    @Override
    public Class<RandomWallpaperResponse> getResponseClass() {
        return RandomWallpaperResponse.class;
    }


    @Override
    public String getMethod() {
        return RequestMethodEnum.GET.getValue();
    }
}
