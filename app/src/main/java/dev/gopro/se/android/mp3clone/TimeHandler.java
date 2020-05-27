package dev.gopro.se.android.mp3clone;

import java.text.SimpleDateFormat;

public class TimeHandler {
    public static String miliSecondsToTimer(long ms) {
        String timeString = "";

        SimpleDateFormat formatter = new SimpleDateFormat("mm:ss");
        timeString = (String) formatter.format(ms);

        return timeString;
    }
}
