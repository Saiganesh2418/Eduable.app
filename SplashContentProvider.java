package org.chromium.webapk.shell_apk.h2o;

import android.view.View;
import java.io.OutputStream;
import java.io.FileOutputStream;
import android.database.Cursor;
import android.os.Bundle;
import android.os.ParcelFileDescriptor;
import android.content.ContentValues;
import android.net.Uri;
import android.content.SharedPreferences;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Bitmap$Config;
import android.graphics.Matrix;
import android.view.View$MeasureSpec;
import android.os.Build$VERSION;
import android.graphics.Bitmap;
import android.os.Handler;
import java.util.concurrent.atomic.AtomicReference;
import android.graphics.Bitmap$CompressFormat;
import android.content.ContentProvider$PipeDataWriter;
import android.content.ContentProvider;

public class SplashContentProvider extends ContentProvider implements ContentProvider$PipeDataWriter
{
    public static Bitmap$CompressFormat b;
    public static final AtomicReference c;
    public String a;
    
    static {
        c = new AtomicReference();
    }
    
    public static byte[] a(final byte[] a) {
        Object o3;
        if (a != null) {
            final Object o = new Object();
            final Object o2 = new Object();
            ((v)o2).a = a;
            (((v)o2).b = new Handler()).postDelayed((Runnable)o, 10000L);
            o3 = o2;
        }
        else {
            o3 = null;
        }
        final v v = (v)SplashContentProvider.c.getAndSet(o3);
        if (v == null) {
            return null;
        }
        v.b.removeCallbacksAndMessages((Object)null);
        return v.a;
    }
    
    public final Bitmap b() {
        final Context applicationContext = this.getContext().getApplicationContext();
        final SharedPreferences a = B.a(applicationContext);
        final int int1 = a.getInt("org.chromium.webapk.shell_apk.splash_width", -1);
        final int int2 = a.getInt("org.chromium.webapk.shell_apk.splash_height", -1);
        if (int1 > 0) {
            if (int2 > 0) {
                Object o;
                if (Build$VERSION.SDK_INT >= 31) {
                    o = x.a(applicationContext);
                }
                else {
                    o = w.a(applicationContext);
                }
                ((View)o).measure(View$MeasureSpec.makeMeasureSpec(int1, 1073741824), View$MeasureSpec.makeMeasureSpec(int2, 1073741824));
                ((View)o).layout(0, 0, int1, int2);
                final int width = ((View)o).getWidth();
                final int height = ((View)o).getHeight();
                if (width != 0) {
                    if (height != 0) {
                        final float min = Math.min(1.0f, 12582912 / (float)(width * 4 * height));
                        final int round = Math.round(width * min);
                        final int round2 = Math.round(height * min);
                        final Matrix matrix = new Matrix();
                        matrix.postScale(min, min);
                        final Bitmap bitmap = Bitmap.createBitmap(round, round2, Bitmap$Config.ARGB_8888);
                        final Canvas canvas = new Canvas(bitmap);
                        canvas.concat(matrix);
                        ((View)o).draw(canvas);
                        return bitmap;
                    }
                }
            }
        }
        return null;
    }
    
    public final int delete(final Uri uri, final String s, final String[] array) {
        throw new UnsupportedOperationException();
    }
    
    public final String getType(final Uri uri) {
        if (uri != null && uri.toString().equals((Object)this.a)) {
            if (SplashContentProvider.b == null) {
                final SharedPreferences a = B.a(this.getContext().getApplicationContext());
                Bitmap$CompressFormat b;
                if (a.getInt("org.chromium.webapk.shell_apk.splash_height", -1) * a.getInt("org.chromium.webapk.shell_apk.splash_width", -1) <= 1048576) {
                    b = Bitmap$CompressFormat.PNG;
                }
                else {
                    b = Bitmap$CompressFormat.JPEG;
                }
                SplashContentProvider.b = b;
            }
            if (SplashContentProvider.b == Bitmap$CompressFormat.PNG) {
                return "image/png";
            }
            if (SplashContentProvider.b == Bitmap$CompressFormat.JPEG) {
                return "image/jpeg";
            }
        }
        return null;
    }
    
    public final Uri insert(final Uri uri, final ContentValues contentValues) {
        throw new UnsupportedOperationException();
    }
    
    public final boolean onCreate() {
        final String packageName = this.getContext().getPackageName();
        final StringBuilder sb = new StringBuilder();
        sb.append(packageName);
        sb.append(".SplashContentProvider");
        final String string = sb.toString();
        final StringBuilder sb2 = new StringBuilder("content://");
        sb2.append(string);
        sb2.append("/cached_splash_image");
        this.a = sb2.toString();
        return true;
    }
    
    public final ParcelFileDescriptor openFile(final Uri uri, final String s) {
        if (uri != null && uri.toString().equals((Object)this.a)) {
            return this.openPipeHelper((Uri)null, (String)null, (Bundle)null, (Object)null, (ContentProvider$PipeDataWriter)this);
        }
        return null;
    }
    
    public final Cursor query(final Uri uri, final String[] array, final String s, final String[] array2, final String s2) {
        throw new UnsupportedOperationException();
    }
    
    public final int update(final Uri uri, final ContentValues contentValues, final String s, final String[] array) {
        throw new UnsupportedOperationException();
    }
    
    public final void writeDataToPipe(final ParcelFileDescriptor parcelFileDescriptor, Uri uri, final String s, final Bundle bundle, final Object o) {
        final Void void1 = (Void)o;
        try {
            uri = (Uri)new FileOutputStream(parcelFileDescriptor.getFileDescriptor());
            Label_0039: {
                try {
                    final byte[] a = a(null);
                    if (a != null) {
                        ((OutputStream)uri).write(a);
                        break Label_0039;
                    }
                    break Label_0039;
                }
                finally {
                    try {
                        ((OutputStream)uri).close();
                    }
                    finally {
                        final Throwable t;
                        ((Throwable)parcelFileDescriptor).addSuppressed(t);
                    }
                    while (true) {
                        while (true) {
                            final Bitmap$CompressFormat b = Bitmap$CompressFormat.PNG;
                            final Bitmap b2;
                            b2.compress(SplashContentProvider.b = b, 100, (OutputStream)uri);
                            break Label_0039;
                            iftrue(Label_0069:)(b2.getWidth() * b2.getHeight() > 1048576);
                            continue;
                        }
                        ((OutputStream)uri).flush();
                        ((OutputStream)uri).close();
                        return;
                        final Bitmap b2 = this.b();
                        iftrue(Label_0086:)(b2 == null);
                        continue;
                    }
                    Label_0069: {
                        final Bitmap$CompressFormat b = Bitmap$CompressFormat.JPEG;
                    }
                }
            }
        }
        catch (final Exception ex) {}
    }
}
