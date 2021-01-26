package com.project.util;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import android.content.Context;
import android.os.Environment;
import android.util.Log;

public class HSLogger {
    private final static String LOG_TAG = HSLogger.class.getSimpleName();

    private static String filename = "";

    static final boolean USE_HSLOGGER = false;

    static boolean isExternalStorageAvailable = false;
    static boolean isExternalStorageWriteable = false;
    static String state = Environment.getExternalStorageState();

    public static void addRecordToLog(Context context, String message, boolean bDate ) {
        //파일 저장 경로(앱 설치 경로)
        //String path = "/data/data/" + context.getPackageName() + "/Logger/";
        if(USE_HSLOGGER == false)
            return;

        String path = Environment.getExternalStorageDirectory().toString() + "/Download/";
        Log.e(LOG_TAG, "# Logger 경로 : " + path);

        //일별 파일 이름
        Calendar calendar = Calendar.getInstance();
        filename = calendar.get(Calendar.YEAR) + "-" + String.format("%02d", (calendar.get(Calendar.MONTH) + 1)) + "-" + String.format("%02d", calendar.get(Calendar.DATE));

        if (Environment.MEDIA_MOUNTED.equals(state)) {
            // We can read and write the media
            isExternalStorageAvailable = isExternalStorageWriteable = true;
        } else if (Environment.MEDIA_MOUNTED_READ_ONLY.equals(state)) {
            // We can only read the media
            isExternalStorageAvailable = true;
            isExternalStorageWriteable = false;
        } else {
            // Something else is wrong. It may be one of many other states, but all we need
            //  to know is we can neither read nor write
            isExternalStorageAvailable = isExternalStorageWriteable = false;
        }

        File dir = new File(path);
        if (Environment.MEDIA_MOUNTED.equals(state)) {
            if(!dir.exists()) {
                Log.d(LOG_TAG, "Dir created ");
                dir.mkdirs();
            }

            File logFile = new File(path+filename+".txt");

            if (!logFile.exists())  {
                try  {
                    Log.d(LOG_TAG, "File created ");
                    logFile.createNewFile();
                } catch (IOException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
            try {
                //BufferedWriter for performance, true to set append to file flag
                BufferedWriter buf = new BufferedWriter(new FileWriter(logFile, true));

                if(bDate) {
                    Date date = new Date(System.currentTimeMillis());
                    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                    String curDate = sdf.format(date);
                    buf.write(curDate + " : "+ message + "\r\n");
                }
                else
                    buf.write( message + "\r\n");
                //buf.append(message);
                buf.newLine();
                buf.flush();
                buf.close();
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
}
