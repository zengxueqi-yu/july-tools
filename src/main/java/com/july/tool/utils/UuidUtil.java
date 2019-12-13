package com.july.tool.utils;

import java.util.UUID;

/**
 * UUID生成类
 * @author zqk
 * @since 2019/12/4
 */
public class UuidUtil {

    /**
     * 获取UUid前13位
     * @return
     * @author zqk
     * @since 2019/12/13
     */
    public static String getUuid(){
        return UUID.randomUUID().toString().toUpperCase().substring(0,12);
    }


    public static String getReplaceUuid() {
        return UUID.randomUUID().toString().toUpperCase().replace("-","");
    }

    public static String getSaltUuid() {
        return UUID.randomUUID().toString().replace("-","");
    }

}
