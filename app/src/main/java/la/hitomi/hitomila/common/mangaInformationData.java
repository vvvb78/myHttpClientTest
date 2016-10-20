package la.hitomi.hitomila.common;

import android.app.PendingIntent;

/**
 * Created by admin on 2016-10-14.
 */

public class mangaInformationData {
    public String mangaTitle;
    public int currDownloadedPages;
    public int maxPages;
    public int notificationID;
    public PendingIntent fileLocationPendingIntent;

    public mangaInformationData(String mangaTitle, int currDownloadedPages,int maxPages,int notificationID){
        this.mangaTitle = mangaTitle;
        this.currDownloadedPages = currDownloadedPages;
        this.maxPages = maxPages;
        this.notificationID = notificationID;
    }
}
