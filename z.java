import android.os.BaseBundle;
import android.os.Bundle;

public abstract class z
{
    public static long a(final Bundle bundle, final String s, final long n) {
        final String string = ((BaseBundle)bundle).getString(s);
        if (string == null) {
            return n;
        }
        if (!string.endsWith("L")) {
            return n;
        }
        try {
            return Long.parseLong(string.substring(0, string.length() - 1));
        }
        catch (final NumberFormatException ex) {
            return n;
        }
    }
}
