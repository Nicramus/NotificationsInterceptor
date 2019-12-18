package com.nicramus.notificationsinterceptor;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

public class NotificationsBroadcastReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        String receivedNotificationCode = intent.getStringExtra("Notification text");
        Log.i("NotificationsBro", receivedNotificationCode);
    }
}
