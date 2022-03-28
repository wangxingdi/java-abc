package com.wangxingdi.util;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

/**
 * review标记
 * @author wangxingdi1
 * @date 2022/3/28 17:06
 * @copyright Copyright JD.COM All Right Reserved
 */
@Target({ElementType.METHOD, ElementType.TYPE})
public @interface ReviewTag {

    /**
     * 一次就成功
     */
    String JUST_ONCE = "JUST_ONCE";

    /**
     *
     * @return
     */

    String value();
}
