package org.chromium.webapk.shell_apk.h2o;

import android.content.Context;
import android.os.Bundle;
import android.app.Activity;
import android.content.ComponentName;
import org.chromium.webapk.shell_apk.TransparentLauncherActivity;

public class H2OTransparentLauncherActivity extends TransparentLauncherActivity
{
    @Override
    public final void a(final e e) {
        if (e == null) {
            return;
        }
        D.a(((Context)this).getApplicationContext(), e);
        final boolean b = g.b(e);
        final Context applicationContext = ((Context)this).getApplicationContext();
        final boolean a = e.a;
        ComponentName componentName = null;
        Label_0175: {
            Label_0153: {
                if (b) {
                    final int componentEnabledSetting = applicationContext.getPackageManager().getComponentEnabledSetting(new ComponentName(applicationContext, (Class)H2OOpaqueMainActivity.class));
                    if (componentEnabledSetting == 0) {
                        if (a && applicationContext.getResources().getBoolean(2130837505)) {
                            break Label_0153;
                        }
                    }
                    else if (componentEnabledSetting == 1) {
                        break Label_0153;
                    }
                    componentName = new ComponentName(applicationContext, (Class)H2OMainActivity.class);
                }
                else {
                    final int componentEnabledSetting2 = applicationContext.getPackageManager().getComponentEnabledSetting(new ComponentName(applicationContext, (Class)H2OMainActivity.class));
                    if (componentEnabledSetting2 == 0) {
                        if (!a) {
                            break Label_0153;
                        }
                        if (applicationContext.getResources().getBoolean(2130837506)) {
                            break Label_0153;
                        }
                    }
                    else if (componentEnabledSetting2 == 1) {
                        break Label_0153;
                    }
                    componentName = new ComponentName(applicationContext, (Class)SplashActivity.class);
                }
                break Label_0175;
            }
            componentName = null;
        }
        if (componentName != null) {
            b.a(((Context)this).getApplicationContext(), this.getIntent(), e.j, -1L, componentName);
            return;
        }
        if (b) {
            final Context applicationContext2 = ((Context)this).getApplicationContext();
            b.a(applicationContext2, this.getIntent(), e.j, e.h, new ComponentName(applicationContext2, (Class)SplashActivity.class));
            return;
        }
        d.a(this, e, null, 268435456, false);
    }
}
