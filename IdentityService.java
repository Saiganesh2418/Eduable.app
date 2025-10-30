package org.chromium.webapk.shell_apk;

import android.os.IBinder;
import android.content.Intent;
import android.app.Service;

public class IdentityService extends Service
{
    public final h a;
    
    public IdentityService() {
        this.a = new h(this);
    }
    
    public final IBinder onBind(final Intent intent) {
        return (IBinder)this.a;
    }
}
