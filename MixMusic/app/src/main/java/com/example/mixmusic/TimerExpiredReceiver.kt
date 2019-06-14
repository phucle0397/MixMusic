package com.example.mixmusic

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import com.example.mixmusic.util.NotificationUtil
import com.example.mixmusic.util.PrefUtil

class TimerExpiredReceiver : BroadcastReceiver() {

    override fun onReceive(context: Context, intent: Intent) {
        // This method is called when the BroadcastReceiver is receiving an Intent broadcast.
        //TODO("TimerExpiredReceiver.onReceive() is not implemented")

        //TODO: hien thong bao
        NotificationUtil.showTimerExpired(context)

        PrefUtil.setTimerState(TimerActivity.TimerState.Stopped, context)
        PrefUtil.setAlarmSetTime(0, context)
    }
}
