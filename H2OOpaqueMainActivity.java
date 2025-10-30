package org.chromium.webapk.shell_apk.h2o;

import android.content.Context;
import android.content.ComponentName;
import android.os.SystemClock;
import android.os.Bundle;
import android.app.Activity;

public class H2OOpaqueMainActivity extends Activity
{
    public final void onCreate(final Bundle bundle) {
        final long elapsedRealtime = SystemClock.elapsedRealtime();
        super.onCreate(bundle);
        final Context applicationContext = ((Context)this).getApplicationContext();
        this.overridePendingTransition(0, 0);
        b.a(applicationContext, this.getIntent(), null, elapsedRealtime, new ComponentName(applicationContext, (Class)SplashActivity.class));
        this.finish();
    }
}
