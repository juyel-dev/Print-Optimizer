package p033h3;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.util.Log;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public final class x extends BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public y f11512a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ y f11513b;

    public x(y yVar, y yVar2) {
        this.f11513b = yVar;
        this.f11512a = yVar2;
    }

    public final void a() {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Connectivity change received registered");
        }
        this.f11513b.f11515o.registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
    }

    @Override // android.content.BroadcastReceiver
    public final synchronized void onReceive(Context context, Intent intent) {
        try {
            y yVar = this.f11512a;
            if (yVar == null) {
                return;
            }
            if (yVar.d()) {
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "Connectivity changed. Starting background sync.");
                }
                y yVar2 = this.f11512a;
                yVar2.f11516r.f11510f.schedule(yVar2, 0L, TimeUnit.SECONDS);
                context.unregisterReceiver(this);
                this.f11512a = null;
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
