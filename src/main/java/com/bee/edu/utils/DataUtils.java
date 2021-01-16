package com.bee.edu.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author ：Bee
 * @date ：Created in 2021/1/11 23:09
 */
public class DataUtils {
    public final static String TIME_FORMAT = "yyyy-MM-dd HH:mm:ss";

    public static String getNowData() {
        SimpleDateFormat dateFormat = new SimpleDateFormat(TIME_FORMAT);
        return dateFormat.format(new Date());
    }
}
