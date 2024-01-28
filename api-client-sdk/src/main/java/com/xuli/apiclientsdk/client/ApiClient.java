package com.xuli.apiclientsdk.client;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 调用第三方接口的客户端
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ApiClient {

    private String accessKey;
    private String secretKey;

}
