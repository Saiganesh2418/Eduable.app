import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.content.DialogInterface;
import android.content.DialogInterface$OnClickListener;

public final class i implements DialogInterface$OnClickListener
{
    public final l a;
    public final m b;
    public final String c;
    
    public i(final l a, final m b, final String c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public final void onClick(DialogInterface b, final int n) {
        this.a.a = true;
        final String c = this.c;
        b = (DialogInterface)this.b;
        final o b2 = ((m)b).b;
        b2.getClass();
        while (true) {
            try {
                final Activity b3 = b2.b;
                final StringBuilder sb = new StringBuilder("market://details?id=");
                sb.append(c);
                final Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(sb.toString()));
                intent.addFlags(268435456);
                b3.startActivity(intent);
                ((m)b).a.a(null, true);
            }
            catch (final ActivityNotFoundException ex) {
                continue;
            }
            break;
        }
    }
}
