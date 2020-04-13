package com.ityun.utils;

import javax.servlet.http.HttpServletRequest;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.HashMap;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

/**
 * Http 工具类
 */
public class HttpUtils {
    /**
     * 将querystring转为参数map
     * @param request
     * @return
     */
    public static Map<String, String> getUrlParams(HttpServletRequest request) {
        String param = "";
        try {
            param = URLDecoder.decode(request.getQueryString(), "UTF-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        HashMap<String, String> result = new HashMap<>();
        String[] params = param.split("&");
        for (String s : params) {
            int index = s.indexOf("=");
            result.put(s.substring(0, index), s.substring(index + 1));
        }
        return result;
    }

    /**
     * 获取所有参数
     * @param request
     * @param postParams
     * @return
     */
    public static SortedMap<String, String> getAllParams(HttpServletRequest request, Map<String, String> postParams) {
        SortedMap<String, String> result = new TreeMap<>();
        Map<String, String> urlParams = getUrlParams(request);
        for (Map.Entry<String, String> entry : urlParams.entrySet()) {
            result.put(entry.getKey(), entry.getValue());
        }
        if (postParams != null) {
            for (Map.Entry<String, String> entry : postParams.entrySet()) {
                result.put(entry.getKey(), entry.getValue());
            }
        }
        return result;
    }
}
