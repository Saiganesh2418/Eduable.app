import java.io.IOException;
import android.util.Pair;
import java.io.OutputStream;
import android.graphics.Bitmap$CompressFormat;
import java.io.ByteArrayOutputStream;
import org.chromium.webapk.shell_apk.h2o.SplashActivity;
import android.os.AsyncTask;

public final class t extends AsyncTask
{
    public final SplashActivity a;
    
    public t(final SplashActivity a) {
        this.a = a;
    }
    
    public final Object doInBackground(final Object[] array) {
        final Void[] array2 = (Void[])array;
        final SplashActivity a = this.a;
        try {
            final ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                Bitmap$CompressFormat bitmap$CompressFormat;
                if (a.c.getWidth() * a.c.getHeight() <= 1048576) {
                    bitmap$CompressFormat = Bitmap$CompressFormat.PNG;
                }
                else {
                    bitmap$CompressFormat = Bitmap$CompressFormat.JPEG;
                }
                a.c.compress(bitmap$CompressFormat, 100, (OutputStream)byteArrayOutputStream);
                final Pair create = Pair.create((Object)byteArrayOutputStream.toByteArray(), (Object)bitmap$CompressFormat);
                byteArrayOutputStream.close();
                return create;
            }
            finally {
                try {
                    byteArrayOutputStream.close();
                }
                finally {
                    final Throwable t;
                    ((Throwable)array).addSuppressed(t);
                }
            }
        }
        catch (final IOException ex) {
            return null;
        }
    }
    
    public final void onPostExecute(final Object o) {
        final Pair pair = (Pair)o;
        final SplashActivity a = this.a;
        byte[] array = null;
        a.a = null;
        if (pair != null) {
            array = (byte[])pair.first;
        }
        Bitmap$CompressFormat png;
        if (pair == null) {
            png = Bitmap$CompressFormat.PNG;
        }
        else {
            png = (Bitmap$CompressFormat)pair.second;
        }
        a.a(array, png);
    }
}
