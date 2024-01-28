package com.xuli.apiclientsdk.service.impi;

import com.xuli.apiclientsdk.client.ApiClient;
import com.xuli.apiclientsdk.exception.ApiException;
import com.xuli.apiclientsdk.model.request.IpInfoRequest;
import com.xuli.apiclientsdk.model.request.LoveRequest;
import com.xuli.apiclientsdk.model.request.RandomWallpaperRequest;
import com.xuli.apiclientsdk.model.request.WeatherRequest;
import com.xuli.apiclientsdk.model.response.LoveResponse;
import com.xuli.apiclientsdk.model.response.RandomWallpaperResponse;
import com.xuli.apiclientsdk.model.response.ResultResponse;
import com.xuli.apiclientsdk.service.ApiService;
import com.xuli.apiclientsdk.service.BaseService;
import lombok.extern.slf4j.Slf4j;


/**
 * 实现
 */
@Slf4j
public class ApiServiceImpl extends BaseService implements ApiService {


    /**
     * 随机情话实现类
     * @throws ApiException
     */
    @Override
    public LoveResponse randomLoveTalk() throws ApiException {
        LoveRequest request = new LoveRequest();
        return request(request);
    }

    /**
     * 随机情话实现类
     * @throws ApiException
     */
    @Override
    public LoveResponse randomLoveTalk(ApiClient apiClient) throws ApiException {
        LoveRequest request = new LoveRequest();
        return request(apiClient, request);
    }

    /**
     * 获取ip地址实现类
     * @param apiClient api客户端
     * @param request   要求
     * @return
     * @throws ApiException
     */
    @Override
    public ResultResponse getIpInfo(ApiClient apiClient, IpInfoRequest request) throws ApiException {
        return request(apiClient, request);
    }

    @Override
    public ResultResponse getIpInfo(IpInfoRequest request) throws ApiException {
        return request(request);
    }

    /**
     * 获取天气实现类
     * @param apiClient api客户端
     * @param request   要求
     * @return
     * @throws ApiException
     */
    @Override
    public ResultResponse getWeatherInfo(ApiClient apiClient, WeatherRequest request) throws ApiException {
        return request(apiClient, request);
    }

    @Override
    public ResultResponse getWeatherInfo(WeatherRequest request) throws ApiException {
        return request(request);
    }

    /**
     * 获取随机壁纸实现类
     * @param request 要求
     * @return
     * @throws ApiException
     */
    @Override
    public RandomWallpaperResponse getRandomWallpaper(RandomWallpaperRequest request) throws ApiException {
        return request(request);
    }

    @Override
    public RandomWallpaperResponse getRandomWallpaper(ApiClient apiClient, RandomWallpaperRequest request) throws ApiException {
        return request(apiClient, request);
    }

}
