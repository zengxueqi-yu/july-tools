package com.july.tool.utils;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class UrlUtil {
    public UrlUtil() {
    }

    public static String urlJoin(String url, Map<String, String> params) {
        StringBuilder endUrl = new StringBuilder(url);
        if (null == params) {
            return url;
        } else {
            boolean isFirst = true;
            Set<Map.Entry<String, String>> entrySet = params.entrySet();
            Iterator var5 = entrySet.iterator();

            while(var5.hasNext()) {
                Map.Entry<String, String> entry = (Map.Entry)var5.next();
                if (isFirst && !url.contains("?")) {
                    isFirst = false;
                    endUrl.append("?");
                } else {
                    endUrl.append("&");
                }

                endUrl.append((String)entry.getKey());
                endUrl.append("=");
                endUrl.append((String)entry.getValue());
            }

            return endUrl.toString();
        }
    }

    public static String simplifyUrl(String url) {
        int index = url.indexOf("://");
        String urlHead = url.substring(0, index + 2);
        String urlTail = url.substring(index + 2, url.length()).replaceAll("/+", "/");
        return urlHead + urlTail;
    }
}