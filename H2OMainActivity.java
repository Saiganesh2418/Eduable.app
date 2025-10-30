package org.chromium.webapk.shell_apk.h2o;

import android.os.BaseBundle;
import android.content.pm.PackageManager;
import android.content.SharedPreferences$Editor;
import android.content.Context;
import android.content.ComponentName;
import android.app.Activity;
import android.os.Bundle;
import org.chromium.webapk.shell_apk.TransparentLauncherActivity;

public class H2OMainActivity extends TransparentLauncherActivity
{
    @Override
    public final void a(final e e) {
        if (e == null) {
            return;
        }
        final Context applicationContext = ((Context)this).getApplicationContext();
        if (g.b(e) && System.currentTimeMillis() - B.a(applicationContext).getLong("org.chromium.webapk.shell_apk.request_host_browser_relaunch_timestamp", -1L) > 20000L) {
            final long currentTimeMillis = System.currentTimeMillis();
            final SharedPreferences$Editor edit = ((Context)this).getSharedPreferences("org.chromium.webapk.shell_apk", 0).edit();
            edit.putLong("org.chromium.webapk.shell_apk.request_host_browser_relaunch_timestamp", currentTimeMillis);
            edit.apply();
            final Bundle bundle = new Bundle();
            ((BaseBundle)bundle).putBoolean("org.chromium.webapk.relaunch", true);
            d.a(this, e, bundle, 268435456, false);
            final ComponentName componentName = new ComponentName(applicationContext, (Class)H2OOpaqueMainActivity.class);
            final ComponentName componentName2 = this.getComponentName();
            B.a(applicationContext).edit().commit();
            final PackageManager packageManager = applicationContext.getPackageManager();
            packageManager.setComponentEnabledSetting(componentName, 1, 1);
            packageManager.setComponentEnabledSetting(componentName2, 2, 0);
            return;
        }
        d.a(this, e, null, 268435456, false);
    }
}
