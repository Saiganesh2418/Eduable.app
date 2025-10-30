import android.view.View;
import android.graphics.Canvas;
import android.graphics.Bitmap;
import android.graphics.Bitmap$Config;
import android.graphics.Matrix;
import org.chromium.webapk.shell_apk.h2o.SplashActivity;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;

public final class s implements ViewTreeObserver$OnGlobalLayoutListener
{
    public final SplashActivity a;
    
    public s(final SplashActivity a) {
        this.a = a;
    }
    
    public final void onGlobalLayout() {
        final SplashActivity a = this.a;
        if (a.b.getWidth() != 0) {
            if (a.b.getHeight() != 0) {
                a.b.getViewTreeObserver().removeOnGlobalLayoutListener((ViewTreeObserver$OnGlobalLayoutListener)this);
                final View b = a.b;
                final int width = b.getWidth();
                final int height = b.getHeight();
                Bitmap bitmap;
                if (width != 0 && height != 0) {
                    final float min = Math.min(1.0f, 12582912 / (float)(width * 4 * height));
                    final int round = Math.round(width * min);
                    final int round2 = Math.round(height * min);
                    final Matrix matrix = new Matrix();
                    matrix.postScale(min, min);
                    bitmap = Bitmap.createBitmap(round, round2, Bitmap$Config.ARGB_8888);
                    final Canvas canvas = new Canvas(bitmap);
                    canvas.concat(matrix);
                    b.draw(canvas);
                }
                else {
                    bitmap = null;
                }
                a.c = bitmap;
                final p f = a.f;
                f.b = true;
                f.a();
            }
        }
    }
}
