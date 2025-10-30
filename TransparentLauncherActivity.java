package org.chromium.webapk.shell_apk;

import android.content.Context;
import android.os.SystemClock;
import android.os.Bundle;
import android.app.Activity;

public class TransparentLauncherActivity extends Activity
{
    public void a(final e e) {
        if (e != null) {
            D.a(((Context)this).getApplicationContext(), e);
            d.a(this, e, null, 268435456, false);
        }
    }
    
    public final void onCreate(final Bundle bundle) {
        final long elapsedRealtime = SystemClock.elapsedRealtime();
        super.onCreate(bundle);
        new o(this).a(new y(this, elapsedRealtime));
    }
}
