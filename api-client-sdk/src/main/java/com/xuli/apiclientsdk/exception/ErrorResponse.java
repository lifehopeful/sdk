package com.xuli.apiclientsdk.exception;

import lombok.Data;

/**
 * 错误响应信息
 */
@Data
public class ErrorResponse {
    private String message;
    private int code;
}
