package com.sobey.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtilt {
    /**标准时间格式*/
    public static String NYRSFM = "yyyy-MM-dd HH:mm:ss";
    public static String NYR = "yyyy-MM-dd";
    public static String NXYXR = "yyyy/MM/dd";


    public static String dateFromat(String fromat , long time){
        SimpleDateFormat mat = new SimpleDateFormat(fromat);
        String timeStr = mat.format(time);
        return timeStr;
    }

    public static Long dateMillisecon(String timeStr , String fromat){
        SimpleDateFormat mat = new SimpleDateFormat(fromat);
        Long time = 0L;
        try {
            Date date = mat.parse(timeStr);
            time = date.getTime();
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return time;
    }

    public static void main(String[] args) {
        System.out.println(DateUtilt.dateFromat(NXYXR, System.currentTimeMillis()));
        System.out.println(dateMillisecon("2018-01-12" , NYR));
    }
}
