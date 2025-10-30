import android.util.Log;
import java.io.File;

public abstract class a
{
    public static void a(final File file) {
        if (file != null) {
            if (file.isDirectory()) {
                final File[] listFiles = file.listFiles();
                if (listFiles != null) {
                    for (int length = listFiles.length, i = 0; i < length; ++i) {
                        a(listFiles[i]);
                    }
                }
            }
            if (!file.delete()) {
                final String absolutePath = file.getAbsolutePath();
                final StringBuilder sb = new StringBuilder("Failed to delete : ");
                sb.append(absolutePath);
                Log.e("cr.DexLoader", sb.toString());
            }
        }
    }
}
