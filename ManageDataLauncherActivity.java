package org.chromium.webapk.shell_apk;

import android.view.ViewGroup;
import android.os.BaseBundle;
import android.content.ActivityNotFoundException;
import android.view.View;
import android.widget.FrameLayout;
import android.view.ViewGroup$LayoutParams;
import android.widget.FrameLayout$LayoutParams;
import android.widget.ProgressBar;
import android.widget.Toast;
import android.content.pm.PackageManager$NameNotFoundException;
import android.os.Bundle;
import android.content.Intent;
import android.content.Context;
import android.net.Uri;
import android.app.Activity;

public class ManageDataLauncherActivity extends Activity
{
    public static final int c = 0;
    public String a;
    public Uri b;
    
    public static boolean b(final Context context, final String package1) {
        final Bundle d = D.d(context);
        if (d != null) {
            if (((BaseBundle)d).getBoolean("org.chromium.webapk.shell_apk.enableSiteSettingsShortcut", false)) {
                final Intent intent = new Intent("android.support.customtabs.action.CustomTabsService");
                intent.addCategory("androidx.browser.trusted.category.LaunchWebApkSiteSettings");
                intent.setPackage(package1);
                if (context.getPackageManager().queryIntentServices(intent, 64).size() > 0) {
                    return true;
                }
            }
        }
        return false;
    }
    
    public final void a() {
        String s;
        try {
            s = ((Context)this).getPackageManager().getApplicationLabel(((Context)this).getPackageManager().getApplicationInfo(this.a, 0)).toString();
        }
        catch (final PackageManager$NameNotFoundException ex) {
            s = this.a;
        }
        Toast.makeText((Context)this, (CharSequence)((Context)this).getString(2131230727, new Object[] { s }), 1).show();
        this.finish();
    }
    
    public final void onCreate(final Bundle bundle) {
        super.onCreate(bundle);
        this.a = this.getIntent().getStringExtra("PROVIDER_PACKAGE");
        this.b = Uri.parse(this.getIntent().getStringExtra("SITE_SETTINGS_URL"));
        if (!b((Context)this, this.a)) {
            this.a();
            return;
        }
        final ProgressBar progressBar = new ProgressBar((Context)this);
        final FrameLayout$LayoutParams layoutParams = new FrameLayout$LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        ((View)progressBar).setLayoutParams((ViewGroup$LayoutParams)layoutParams);
        final FrameLayout contentView = new FrameLayout((Context)this);
        ((ViewGroup)contentView).addView((View)progressBar);
        this.setContentView((View)contentView);
        final Intent intent = new Intent();
        intent.setAction("android.support.customtabs.action.ACTION_MANAGE_TRUSTED_WEB_ACTIVITY_DATA");
        intent.setPackage(this.a);
        intent.setData(this.b);
        intent.putExtra("org.chromium.webapk.is_webapk", true);
        try {
            this.startActivityForResult(intent, 0);
            this.finish();
        }
        catch (final ActivityNotFoundException ex) {
            this.a();
        }
    }
    
    public final void onStop() {
        super.onStop();
        this.finish();
    }
}
