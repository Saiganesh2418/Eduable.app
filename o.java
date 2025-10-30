import android.app.Dialog;
import android.os.BaseBundle;
import android.app.AlertDialog;
import android.content.res.Resources;
import android.os.Bundle;
import android.content.DialogInterface$OnDismissListener;
import android.content.DialogInterface$OnClickListener;
import android.view.View;
import android.app.AlertDialog$Builder;
import android.view.ContextThemeWrapper;
import android.widget.ImageView;
import android.content.res.Resources$Theme;
import android.widget.TextView;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.text.TextUtils;
import android.util.Log;
import android.app.Activity;
import android.content.Context;

public final class o
{
    public final Context a;
    public final Activity b;
    
    public o(final Activity b) {
        this.b = b;
        this.a = ((Context)b).getApplicationContext();
    }
    
    public final void a(final n n) {
        final Context a = this.a;
        final Bundle d = D.d(a);
        if (d == null) {
            n.a(null, false);
            return;
        }
        final String packageName = a.getPackageName();
        final StringBuilder sb = new StringBuilder("Package name of the WebAPK:");
        sb.append(packageName);
        Log.v("cr_LaunchHostBrowserSelector", sb.toString());
        final f a2 = g.a(a);
        if (a2 != null && !TextUtils.isEmpty((CharSequence)a2.a)) {
            n.a(a2, false);
            return;
        }
        final String string = ((BaseBundle)d).getString("org.chromium.webapk.shell_apk.runtimeHost");
        String string2 = ((BaseBundle)d).getString("org.chromium.webapk.shell_apk.runtimeHostApplicationName");
        String s = string;
        if (TextUtils.isEmpty((CharSequence)string)) {
            s = "com.android.chrome";
            string2 = "Google Chrome";
        }
        final m m = new m(this, n);
        final String string3 = a.getString(2131230726);
        final Activity b = this.b;
        final View inflate = LayoutInflater.from((Context)b).inflate(2131099648, (ViewGroup)null);
        final TextView customTitle = new TextView((Context)b);
        customTitle.setText((CharSequence)((Context)b).getString(2131230725, new Object[] { string3 }));
        final Resources resources = ((Context)b).getResources();
        customTitle.setTextColor(resources.getColor(2130903044, (Resources$Theme)null));
        customTitle.setTextSize(0, resources.getDimension(2130968578));
        final int dimensionPixelSize = resources.getDimensionPixelSize(2130968576);
        customTitle.setPaddingRelative(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, resources.getDimensionPixelSize(2130968581));
        inflate.setPaddingRelative(dimensionPixelSize, resources.getDimensionPixelSize(2130968577), dimensionPixelSize, dimensionPixelSize);
        ((ImageView)inflate.findViewById(2130771969)).setImageResource(2131034113);
        final TextView textView = (TextView)inflate.findViewById(2130771970);
        textView.setText((CharSequence)string2);
        textView.setPaddingRelative(((Context)b).getResources().getDimensionPixelSize(2130968579), 0, 0, 0);
        final Object o = new Object();
        final AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder((Context)new ContextThemeWrapper((Context)b, 16974130));
        alertDialog$Builder.setCustomTitle((View)customTitle).setView(inflate).setNegativeButton(2131230721, (DialogInterface$OnClickListener)new Object()).setPositiveButton(2131230724, (DialogInterface$OnClickListener)new i((l)o, m, s));
        final AlertDialog create = alertDialog$Builder.create();
        ((Dialog)create).setOnDismissListener((DialogInterface$OnDismissListener)new k((l)o, m));
        ((Dialog)create).show();
    }
}
