import android.content.Context;
import android.os.Parcel;
import android.os.IBinder;
import org.chromium.webapk.shell_apk.IdentityService;
import android.os.IInterface;
import android.os.Binder;

public final class h extends Binder implements IInterface
{
    public final IdentityService a;
    
    public h(final IdentityService a) {
        this.a = a;
        this.attachInterface((IInterface)this, "org.chromium.webapk.lib.common.identity_service.IIdentityService");
    }
    
    public final IBinder asBinder() {
        return (IBinder)this;
    }
    
    public final boolean onTransact(final int n, final Parcel parcel, final Parcel parcel2, final int n2) {
        if (n >= 1 && n <= 16777215) {
            parcel.enforceInterface("org.chromium.webapk.lib.common.identity_service.IIdentityService");
        }
        if (n == 1598968902) {
            parcel2.writeString("org.chromium.webapk.lib.common.identity_service.IIdentityService");
            return true;
        }
        if (n != 1) {
            return super.onTransact(n, parcel, parcel2, n2);
        }
        final f a = g.a(((Context)this.a).getApplicationContext());
        String a2;
        if (a != null) {
            a2 = a.a;
        }
        else {
            a2 = null;
        }
        parcel2.writeNoException();
        parcel2.writeString(a2);
        return true;
    }
}
