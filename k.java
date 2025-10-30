import android.content.DialogInterface;
import android.content.DialogInterface$OnDismissListener;

public final class k implements DialogInterface$OnDismissListener
{
    public final l a;
    public final m b;
    
    public k(final l a, final m b) {
        this.a = a;
        this.b = b;
    }
    
    public final void onDismiss(final DialogInterface dialogInterface) {
        if (this.a.a) {
            return;
        }
        this.b.a.a(null, true);
    }
}
