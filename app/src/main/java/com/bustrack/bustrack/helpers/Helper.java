package com.bustrack.bustrack.helpers;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Administrator on 2017/04/09 0009.
 */

public class Helper {
    public static final String API_KEY = "d76c5165-86d8-49af-9c67-e314dc7bdbde";

    public static final String STOP_LIST = "STOP LIST";

    public static final String BUS_LIST = "BUS LIST";

    public static final String EDIT_BUS_LIST = "EDIT"

    public static String ConvertFromBatchToFormatTime(long batchDate){
        String string = "";

        long batch = batchDate;
        Date dt = new Date(batch * 1000);

        SimpleDateFormat sfd = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
        string = sfd.format(dt);

        return string;
    }

}
