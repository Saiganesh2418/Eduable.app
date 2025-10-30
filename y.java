import android.content.Context;
import org.chromium.webapk.shell_apk.TransparentLauncherActivity;

public final class y implements n
{
    public final long a;
    public final TransparentLauncherActivity b;
    
    public y(final TransparentLauncherActivity b, final long a) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final void a(final f f, final boolean b) {
        final TransparentLauncherActivity b2 = this.b;
        if (f == null) {
            b2.finish();
            return;
        }
        b2.a(e.a((Context)b2, b2.getIntent(), f, b, this.a, -1L));
        b2.finish();
    }
}
