import android.content.pm.PackageManager$NameNotFoundException;
import android.util.Log;
import android.content.Context;
import dalvik.system.BaseDexClassLoader;

public abstract class c
{
    public static BaseDexClassLoader a;
    
    public static int a(final Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        }
        catch (final PackageManager$NameNotFoundException ex) {
            Log.e("cr_HostBrowserClassLoader", "Failed to get remote package info.");
            return -1;
        }
    }
}
