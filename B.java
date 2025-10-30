import android.os.Bundle;
import android.content.ComponentName;
import android.content.Intent;
import android.content.Context;

public abstract class b
{
    public static void a(final Context context, final Intent intent, final String s, final long n, final ComponentName component) {
        final Intent intent2 = new Intent("android.intent.action.VIEW", intent.getData());
        intent2.setComponent(component);
        intent2.setFlags(268435456);
        final Bundle extras = intent.getExtras();
        if (extras != null) {
            intent2.putExtras(extras);
        }
        if (s != null) {
            intent2.putExtra("org.chromium.webapk.selected_share_target_activity_class_name", s);
        }
        if (n != -1L) {
            intent2.putExtra("org.chromium.chrome.browser.webapk_launch_time", n);
        }
        context.startActivity(intent2);
    }
}
