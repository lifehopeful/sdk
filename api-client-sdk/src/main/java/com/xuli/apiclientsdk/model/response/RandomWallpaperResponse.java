package com.xuli.apiclientsdk.model.response;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 随机壁纸响应
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class RandomWallpaperResponse extends ResultResponse {
    private static final long serialVersionUID = -6467312483425078539L;
    private String imgurl;
}
