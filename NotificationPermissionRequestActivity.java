package org.chromium.webapk.shell_apk;

import android.os.BaseBundle;
import android.content.Context;
import android.os.RemoteException;
import android.os.Message;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.util.Log;
import android.os.Build$VERSION;
import android.os.Bundle;
import android.os.Messenger;
import android.app.Activity;

public class NotificationPermissionRequestActivity extends Activity
{
    public static final int d = 0;
    public String a;
    public String b;
    public Messenger c;
    
    public final void onCreate(final Bundle bundle) {
        super.onCreate(bundle);
        if (Build$VERSION.SDK_INT < 33) {
            Log.w("PermissionRequestActivity", "Cannot request notification permission before Android T.");
            this.finish();
            return;
        }
        this.a = this.getIntent().getStringExtra("notificationChannelName");
        this.b = this.getIntent().getStringExtra("notificationChannelId");
        final Messenger c = (Messenger)this.getIntent().getParcelableExtra("messenger");
        this.c = c;
        if (this.a != null && this.b != null && c != null) {
            if (((Context)this).getApplicationContext().getApplicationInfo().targetSdkVersion < 33) {
                ((NotificationManager)((Context)this).getSystemService("notification")).createNotificationChannel(new NotificationChannel(this.b, (CharSequence)this.a, 3));
            }
            this.requestPermissions(new String[] { "android.permission.POST_NOTIFICATIONS" }, 0);
            return;
        }
        Log.w("PermissionRequestActivity", "Finishing because not all required extras were provided.");
        this.finish();
    }
    
    public final void onRequestPermissionsResult(int n, final String[] array, final int[] array2) {
        final int n2 = 0;
        n = 0;
        int n3;
        while (true) {
            n3 = n2;
            if (n >= array.length) {
                break;
            }
            if (!array[n].equals((Object)"android.permission.POST_NOTIFICATIONS")) {
                ++n;
            }
            else {
                ((Context)this).getApplicationContext().getSharedPreferences("org.chromium.webapk.shell_apk.PrefUtils", 0).edit().putBoolean("HAS_REQUESTED_NOTIFICATION_PERMISSION", true).apply();
                n3 = n2;
                if (array2[n] == 0) {
                    n3 = 1;
                    break;
                }
                break;
            }
        }
        int notificationsEnabled;
        if ((notificationsEnabled = n3) == 0) {
            notificationsEnabled = (((NotificationManager)((Context)this).getSystemService("notification")).areNotificationsEnabled() ? 1 : 0);
        }
        final Messenger c = this.c;
        final Bundle data = new Bundle();
        ((BaseBundle)data).putInt("permissionStatus", notificationsEnabled ^ 0x1);
        final Message obtain = Message.obtain();
        obtain.setData(data);
        try {
            c.send(obtain);
        }
        catch (final RemoteException ex) {
            ((Throwable)ex).printStackTrace();
        }
        this.finish();
    }
}
