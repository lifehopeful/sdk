package com.xuli.apiclientsdk.config;


import com.baomidou.mybatisplus.core.toolkit.StringUtils;
import com.xuli.apiclientsdk.client.ApiClient;
import com.xuli.apiclientsdk.service.ApiService;
import com.xuli.apiclientsdk.service.impi.ApiServiceImpl;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties("api.client")
@Data
@ComponentScan
public class ApiClientConfig {
    private String accessKey;
    private String secretKey;
    /**
     * 网关
     */
    private String host;

    @Bean
    public ApiClient apiClient() {
        return new ApiClient(accessKey, secretKey);
    }

    @Bean
    public ApiService apiService() {
        ApiServiceImpl apiService = new ApiServiceImpl();
        apiService.setApiClient(new ApiClient(accessKey, secretKey));
        if (StringUtils.isNotBlank(host)) {
            apiService.setGatewayHost(host);
        }
        return apiService;
    }
}
