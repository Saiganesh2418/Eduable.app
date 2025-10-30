import android.graphics.drawable.Drawable;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.Icon;
import android.widget.ImageView;
import android.graphics.drawable.BitmapDrawable;
import android.content.res.Resources$Theme;
import android.content.res.Resources$NotFoundException;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.view.View;
import android.content.Context;

public abstract class x
{
    public static View a(final Context context) {
        final LayoutInflater from = LayoutInflater.from(context);
        final Bitmap bitmap = null;
        final View inflate = from.inflate(2131099649, (ViewGroup)null);
        boolean boolean1;
        try {
            boolean1 = context.getResources().getBoolean(2130837504);
        }
        catch (final Resources$NotFoundException ex) {
            boolean1 = false;
        }
        if (!boolean1) {
            return inflate;
        }
        final Resources resources = context.getResources();
        while (true) {
            try {
                final Drawable drawable = resources.getDrawable(2131034119, (Resources$Theme)null);
                Bitmap bitmap2 = bitmap;
                if (drawable != null) {
                    bitmap2 = ((BitmapDrawable)drawable).getBitmap();
                }
                ((ImageView)inflate.findViewById(2130771971)).setImageIcon(Icon.createWithAdaptiveBitmap(bitmap2));
                return inflate;
            }
            catch (final Resources$NotFoundException ex2) {
                final Bitmap bitmap2 = bitmap;
                continue;
            }
            break;
        }
    }
}
