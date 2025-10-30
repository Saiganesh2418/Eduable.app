import android.os.BaseBundle;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.content.pm.PackageManager$NameNotFoundException;
import android.net.Uri;
import android.net.Uri$Builder;
import android.util.Pair;
import java.util.ArrayList;
import java.util.Locale;
import android.text.TextUtils;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;

public final class e
{
    public boolean a;
    public f b;
    public boolean c;
    public Intent d;
    public String e;
    public int f;
    public boolean g;
    public long h;
    public long i;
    public String j;
    
    public static e a(final Context context, final Intent d, final f b, final boolean c, long h, final long i) {
        final Bundle d2 = D.d(context);
        final e e = null;
        if (d2 == null) {
            final Object o = e;
            return (e)o;
        }
        final long longExtra = d.getLongExtra("org.chromium.chrome.browser.webapk_launch_time", -1L);
        if (longExtra > 0L) {
            h = longExtra;
        }
        String j = d.getStringExtra("org.chromium.webapk.selected_share_target_activity_class_name");
        if ("android.intent.action.SEND".equals((Object)d.getAction()) || "android.intent.action.SEND_MULTIPLE".equals((Object)d.getAction())) {
            j = d.getComponent().getClassName();
        }
        int boolean1 = 1;
        final int n = 0;
        int k = 0;
        Label_0459: {
            if (j == null) {
                break Label_0459;
            }
            final ComponentName componentName = new ComponentName(context.getPackageName(), j);
        Label_0511_Outer:
            while (true) {
                try {
                    final ActivityInfo activityInfo = context.getPackageManager().getActivityInfo(componentName, 128);
                    Object metaData;
                    if (activityInfo == null) {
                        metaData = null;
                    }
                    else {
                        metaData = activityInfo.metaData;
                    }
                    String e2 = null;
                    Label_0448: {
                        if (metaData != null) {
                            final String string = ((BaseBundle)metaData).getString("org.chromium.webapk.shell_apk.shareMethod");
                            if (!TextUtils.isEmpty((CharSequence)string) && "POST".equals((Object)string.toUpperCase(Locale.ENGLISH))) {
                                e2 = ((BaseBundle)metaData).getString("org.chromium.webapk.shell_apk.shareAction");
                                break Label_0448;
                            }
                            final String string2 = ((BaseBundle)metaData).getString("org.chromium.webapk.shell_apk.shareAction");
                            if (!TextUtils.isEmpty((CharSequence)string2)) {
                                final ArrayList list = new ArrayList();
                                list.add((Object)new Pair((Object)((BaseBundle)metaData).getString("org.chromium.webapk.shell_apk.shareParamTitle"), (Object)d.getStringExtra("android.intent.extra.SUBJECT")));
                                list.add((Object)new Pair((Object)((BaseBundle)metaData).getString("org.chromium.webapk.shell_apk.shareParamText"), (Object)d.getStringExtra("android.intent.extra.TEXT")));
                                final Uri$Builder uri$Builder = new Uri$Builder();
                                while (k < list.size()) {
                                    final Object value = list.get(k);
                                    final int n2 = k + 1;
                                    final Pair pair = (Pair)value;
                                    k = n2;
                                    if (!TextUtils.isEmpty((CharSequence)pair.first)) {
                                        k = n2;
                                        if (TextUtils.isEmpty((CharSequence)pair.second)) {
                                            continue Label_0511_Outer;
                                        }
                                        uri$Builder.appendQueryParameter((String)pair.first, (String)pair.second);
                                        k = n2;
                                    }
                                }
                                final Uri$Builder buildUpon = Uri.parse(string2).buildUpon();
                                final String string3 = uri$Builder.build().toString();
                                if (TextUtils.isEmpty((CharSequence)string3)) {
                                    e2 = string2;
                                    break Label_0448;
                                }
                                buildUpon.encodedQuery(string3.replace((CharSequence)"%20", (CharSequence)"+").substring(1));
                                e2 = buildUpon.build().toString();
                                break Label_0448;
                            }
                        }
                        e2 = null;
                    }
                    k = 13;
                    boolean booleanExtra = boolean1 != 0;
                    while (true) {
                        Object o;
                        if (e2 == null) {
                            o = e;
                        }
                        else {
                            final String string4 = ((BaseBundle)d2).getString("org.chromium.webapk.shell_apk.startUrl");
                            final String string5 = ((BaseBundle)d2).getString("org.chromium.webapk.shell_apk.loggedIntentUrlParam");
                            if (!TextUtils.isEmpty((CharSequence)string5)) {
                                if (!e2.startsWith(string4) || TextUtils.isEmpty((CharSequence)Uri.parse(e2).getQueryParameter(string5))) {
                                    final Uri$Builder buildUpon2 = Uri.parse(string4).buildUpon();
                                    buildUpon2.appendQueryParameter(string5, e2);
                                    e2 = buildUpon2.toString();
                                }
                            }
                            o = e;
                            if (e2 != null) {
                                if (!e2.startsWith("http:")) {
                                    o = e;
                                    if (!e2.startsWith("https:")) {
                                        return (e)o;
                                    }
                                }
                                boolean1 = (((BaseBundle)d2).getBoolean("org.chromium.webapk.shell_apk.isNewStyleWebApk") ? 1 : 0);
                                o = new Object();
                                ((e)o).a = (boolean1 != 0);
                                ((e)o).b = b;
                                ((e)o).c = c;
                                ((e)o).d = d;
                                ((e)o).e = e2;
                                ((e)o).f = k;
                                ((e)o).g = booleanExtra;
                                ((e)o).h = h;
                                ((e)o).i = i;
                                ((e)o).j = j;
                            }
                        }
                        return (e)o;
                        iftrue(Label_0496:)(TextUtils.isEmpty((CharSequence)d.getDataString()));
                        Block_14: {
                            break Block_14;
                            Label_0496: {
                                e2 = ((BaseBundle)d2).getString("org.chromium.webapk.shell_apk.startUrl");
                            }
                            booleanExtra = false;
                            k = n;
                            continue;
                        }
                        e2 = d.getDataString();
                        k = d.getIntExtra("org.chromium.chrome.browser.webapp_source", 9);
                        booleanExtra = d.getBooleanExtra("org.chromium.chrome.browser.webapk_force_navigation", true);
                        continue;
                    }
                }
                catch (final PackageManager$NameNotFoundException ex) {
                    continue;
                }
                break;
            }
        }
    }
}
