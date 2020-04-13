package com.ityun.utils;

import org.apache.commons.codec.digest.DigestUtils;
import org.springframework.util.StringUtils;

import java.util.Map;

/**
 * 签名工具类
 */
public class SignUtils {
    /**
     * 构造签名
     * @return
     */
    public static String getSign(Map<String, String> params) {
        StringBuilder stringBuilder = new StringBuilder();
        for (Map.Entry<String, String> entry : params.entrySet()) {
            if (!entry.getKey().equals("sign")) {
                if (!StringUtils.isEmpty(entry.getKey()) && !StringUtils.isEmpty(entry.getValue())) {
                    stringBuilder.append(entry.getKey()).append("=").append(entry.getValue()).append("&");
                }
            }
        }
        // 待md5的字符串
        String md5Str = stringBuilder.toString();
        md5Str = md5Str.substring(0, md5Str.length()-1);
        return DigestUtils.md5Hex(md5Str).toUpperCase();
    }

    /**
     * 验签
     * @return
     */
    public static boolean verifySign(Map<String, String> params) {
        if (params == null || StringUtils.isEmpty(params.get("sign"))) {
            return false;
        }
        String sign = getSign(params);
        return params.get("sign").equals(sign);
    }
}
