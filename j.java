import android.content.DialogInterface;
import android.content.DialogInterface$OnClickListener;

public final class j implements DialogInterface$OnClickListener
{
    public final void onClick(final DialogInterface dialogInterface, final int n) {
        dialogInterface.cancel();
    }
}
