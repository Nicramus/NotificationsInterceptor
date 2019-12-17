package com.nicramus.notificationsinterceptor;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.service.notification.NotificationListenerService;
import android.service.notification.StatusBarNotification;
import android.util.Log;

public class NotificationService extends NotificationListenerService {

    @Override
    public IBinder onBind(Intent intent) {
        Log.i("onBind","BIND!");
        return super.onBind(intent);
    }

    @Override
    public void onNotificationPosted(StatusBarNotification sbn) {
        String pack = sbn.getPackageName();

        String text = "";
        String title = "";
        if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.KITKAT) {
            Bundle extras = extras = sbn.getNotification().extras;
            text = extras.getCharSequence("android.text").toString();
            title = extras.getString("android.title");
        }

        Log.i("Package",pack);
        Log.i("Title",title);
        Log.i("Text",text);

    }

    @Override
    public void onNotificationRemoved(StatusBarNotification sbn) {
        Log.i("Msg","Notification was removed");
    }
}
