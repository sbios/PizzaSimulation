package org.TimeStamp;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TimeStamp {
    public static String getTimeStamp(){
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
        Date currentDate = new Date();
        String formattedDate = sdf.format(currentDate);
        return formattedDate;
    }
}
