package com.wangxingdi.util;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author wangxingdi1
 * @date 2022/3/28 17:12
 * @copyright Copyright JD.COM All Right Reserved
 */
public class DateUtils {

    public static String getToday(){
        DateFormat format = new SimpleDateFormat("yyyyMMdd");
        return format.format(new Date());
    }
}
