import android.content.pm.PackageManager;
import org.chromium.webapk.shell_apk.h2o.H2OOpaqueMainActivity;
import android.content.ComponentName;
import org.chromium.webapk.shell_apk.h2o.H2OMainActivity;
import android.os.Bundle;
import android.app.Activity;
import android.content.Context;
import org.chromium.webapk.shell_apk.h2o.SplashActivity;

public final class r implements n
{
    public final long a;
    public final SplashActivity b;
    
    public r(final SplashActivity b, final long a) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final void a(final f f, final boolean b) {
        final SplashActivity b2 = this.b;
        if (f == null) {
            b2.finish();
            return;
        }
        final e a = e.a((Context)b2, b2.getIntent(), f, b, -1L, this.a);
        final int g = SplashActivity.g;
        if (a == null) {
            b2.finish();
            return;
        }
        final Context applicationContext = ((Context)b2).getApplicationContext();
        if (!g.b(a)) {
            d.a(b2, a, null, 268435456, false);
            final ComponentName componentName = new ComponentName(applicationContext, (Class)H2OMainActivity.class);
            final ComponentName componentName2 = new ComponentName(applicationContext, (Class)H2OOpaqueMainActivity.class);
            B.a(applicationContext).edit().commit();
            final PackageManager packageManager = applicationContext.getPackageManager();
            packageManager.setComponentEnabledSetting(componentName, 1, 1);
            packageManager.setComponentEnabledSetting(componentName2, 2, 0);
            b2.finish();
            return;
        }
        b2.d = a;
        final p f2 = b2.f;
        f2.d = true;
        f2.a();
    }
}
