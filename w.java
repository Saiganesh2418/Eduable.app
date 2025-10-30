import android.view.View;
import android.util.DisplayMetrics;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;
import android.widget.ImageView;
import android.widget.TextView;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.content.res.Resources$NotFoundException;
import android.graphics.drawable.BitmapDrawable;
import android.content.res.Resources$Theme;
import android.widget.FrameLayout;
import android.content.Context;

public abstract class w
{
    public static FrameLayout a(Context context) {
        Object text = context.getResources();
        while (true) {
            try {
                final Drawable drawable = ((Resources)text).getDrawable(2131034119, (Resources$Theme)null);
                Bitmap bitmap;
                if (drawable != null) {
                    bitmap = ((BitmapDrawable)drawable).getBitmap();
                }
                else {
                    bitmap = null;
                }
                int backgroundColor;
                if (D.b(context)) {
                    backgroundColor = ((Resources)text).getColor(2130903041, (Resources$Theme)null);
                }
                else {
                    backgroundColor = ((Resources)text).getColor(2130903040, (Resources$Theme)null);
                }
                final FrameLayout frameLayout = new FrameLayout(context);
                boolean boolean1;
                try {
                    boolean1 = context.getResources().getBoolean(2130837504);
                }
                catch (final Resources$NotFoundException ex) {
                    boolean1 = false;
                }
                text = ((Resources)text).getString(2131230726);
                final boolean e = D.e(backgroundColor);
                final Resources resources = context.getResources();
                int n = 2131099651;
                if (bitmap != null) {
                    final DisplayMetrics displayMetrics = resources.getDisplayMetrics();
                    if (Math.min(bitmap.getScaledWidth(displayMetrics), bitmap.getScaledHeight(displayMetrics)) < resources.getDimensionPixelSize(2130968585)) {
                        n = n;
                    }
                    else {
                        n = 2131099650;
                    }
                }
                final ViewGroup viewGroup = (ViewGroup)LayoutInflater.from(context).inflate(n, (ViewGroup)frameLayout, true);
                final TextView textView = (TextView)((View)viewGroup).findViewById(2130771974);
                textView.setText((CharSequence)text);
                if (e) {
                    textView.setTextColor(context.getResources().getColor(2130903047, (Resources$Theme)null));
                }
                context = (Context)((View)viewGroup).findViewById(2130771972);
                if (context != null) {
                    if (boolean1) {
                        ((ImageView)context).setImageIcon(Icon.createWithAdaptiveBitmap(bitmap));
                    }
                    else {
                        ((ImageView)context).setImageBitmap(bitmap);
                    }
                }
                ((View)frameLayout).setBackgroundColor(backgroundColor);
                return frameLayout;
            }
            catch (final Resources$NotFoundException ex2) {
                continue;
            }
            break;
        }
    }
}
