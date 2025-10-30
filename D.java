import android.os.BaseBundle;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager$NameNotFoundException;
import android.content.ActivityNotFoundException;
import android.util.Log;
import android.content.ComponentName;
import android.net.Uri;
import android.text.TextUtils;
import android.graphics.drawable.Icon;
import android.content.pm.ShortcutInfo$Builder;
import android.content.Intent;
import java.util.Collections;
import android.content.Context;
import android.content.pm.ShortcutManager;
import org.chromium.webapk.shell_apk.ManageDataLauncherActivity;
import android.os.Bundle;
import android.app.Activity;

public abstract class d
{
    public static void a(final Activity ex, final e e, final Bundle bundle, final int flags, final boolean b) {
        Object component = ((Context)ex).getApplicationContext();
        final int c = ManageDataLauncherActivity.c;
        final ShortcutManager shortcutManager = (ShortcutManager)((Context)component).getSystemService((Class)ShortcutManager.class);
        final boolean b2 = ManageDataLauncherActivity.b((Context)component, e.b.a);
        final String e2 = e.e;
        final f b3 = e.b;
        if (!b2) {
            shortcutManager.removeDynamicShortcuts(Collections.singletonList((Object)"android.support.customtabs.action.SITE_SETTINGS_SHORTCUT"));
        }
        else {
            final String a = b3.a;
            final Intent intent = new Intent((Context)component, (Class)ManageDataLauncherActivity.class);
            intent.setAction("android.support.customtabs.action.ACTION_MANAGE_TRUSTED_WEB_ACTIVITY_DATA");
            intent.putExtra("SITE_SETTINGS_URL", e2);
            intent.putExtra("PROVIDER_PACKAGE", a);
            shortcutManager.addDynamicShortcuts(Collections.singletonList((Object)new ShortcutInfo$Builder((Context)component, "android.support.customtabs.action.SITE_SETTINGS_SHORTCUT").setShortLabel((CharSequence)((Context)component).getString(2131230739)).setLongLabel((CharSequence)((Context)component).getString(2131230738)).setIcon(Icon.createWithResource((Context)component, 2131034112)).setIntent(intent).build()));
        }
        final Context applicationContext = ((Context)ex).getApplicationContext();
        final String a2 = b3.a;
        Object o = g.a;
        Label_0307: {
            if (TextUtils.isEmpty((CharSequence)a2)) {
                final boolean equals = false;
                break Label_0307;
            }
            final Bundle d = D.d(applicationContext);
            component = null;
            if (d == null) {
                o = null;
            }
            else {
                o = ((BaseBundle)d).getString("org.chromium.webapk.shell_apk.runtimeHost");
            }
            Object o2 = component;
            Label_0298: {
                if (TextUtils.isEmpty((CharSequence)o)) {
                    break Label_0298;
                }
                final PackageManager packageManager = applicationContext.getPackageManager();
                Label_0268: {
                    if (!TextUtils.isEmpty((CharSequence)o)) {
                        break Label_0268;
                    }
                    while (true) {
                        boolean enabled = false;
                        Label_0285: {
                            break Label_0285;
                            try {
                                enabled = packageManager.getApplicationInfo((String)o, 0).enabled;
                                o2 = component;
                                if (enabled) {
                                    o2 = o;
                                }
                                final boolean equals = TextUtils.equals((CharSequence)a2, (CharSequence)o2);
                                final String a3 = b3.a;
                                component = b3.b;
                                o = Uri.parse(e2);
                                if (equals) {
                                    o = new Intent();
                                    ((Intent)o).setAction("com.google.android.apps.chrome.webapps.WebappManager.ACTION_START_WEBAPP");
                                }
                                else {
                                    o = new Intent("android.intent.action.VIEW", (Uri)o);
                                }
                                if (component != null) {
                                    ((Intent)o).setSelector(new Intent().setAction("android.intent.action.VIEW").addCategory("android.intent.category.BROWSABLE").setData(Uri.parse("http://")));
                                    ((Intent)o).setComponent((ComponentName)component);
                                }
                                else {
                                    ((Intent)o).setPackage(a3);
                                }
                                ((Intent)o).setFlags(flags);
                                final Bundle extras = e.d.getExtras();
                                if (extras != null) {
                                    ((Intent)o).putExtras(extras);
                                }
                                ((Intent)o).removeExtra("org.chromium.webapk.relaunch");
                                ((Intent)o).putExtra("org.chromium.chrome.browser.webapp_url", e2).putExtra("org.chromium.chrome.browser.webapp_source", e.f).putExtra("org.chromium.chrome.browser.webapk_package_name", ((Context)ex).getPackageName()).putExtra("org.chromium.webapk.selected_share_target_activity_class_name", e.j).putExtra("org.chromium.chrome.browser.webapk_force_navigation", e.g);
                                if (bundle != null) {
                                    ((Intent)o).putExtras(bundle);
                                }
                                if (!e.c) {
                                    final long h = e.h;
                                    if (h >= 0L) {
                                        ((Intent)o).putExtra("org.chromium.chrome.browser.webapk_launch_time", h);
                                    }
                                }
                                final long i = e.i;
                                if (i >= 0L) {
                                    ((Intent)o).putExtra("org.chromium.webapk.new_style_splash_shown_time", i);
                                }
                                while (true) {
                                    if (b) {
                                        try {
                                            ((Activity)ex).startActivityForResult((Intent)o, 0);
                                            return;
                                            ((Activity)ex).startActivity((Intent)o);
                                        }
                                        catch (final ActivityNotFoundException ex) {
                                            Log.w("cr_HostBrowserLauncher", "Unable to launch browser in WebAPK mode.");
                                            ((Throwable)ex).printStackTrace();
                                        }
                                        return;
                                    }
                                    continue;
                                }
                            }
                            catch (final PackageManager$NameNotFoundException ex2) {
                                continue;
                            }
                        }
                        break;
                    }
                }
            }
        }
    }
}
