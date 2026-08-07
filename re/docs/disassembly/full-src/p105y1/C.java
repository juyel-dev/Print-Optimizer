package p105y1;

import Y1.b;
import android.content.Context;
import android.os.Message;
import com.google.android.gms.internal.ads.AbstractC1125g8;
import com.google.android.gms.internal.ads.Ns;
import p085u1.k;

/* JADX INFO: loaded from: classes2.dex */
public final class C extends Ns {
    @Override // com.google.android.gms.internal.ads.Ns
    public final void a(Message message) {
        try {
            super.a(message);
        } catch (Throwable th) {
            F f5 = k.f13311A.f13314c;
            Context context = k.f13311A.g.e;
            if (context != null) {
                try {
                    if (((Boolean) AbstractC1125g8.f7417b.p()).booleanValue()) {
                        b.a(context, th);
                    }
                } catch (IllegalStateException unused) {
                }
            }
            throw th;
        }
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        try {
            super.handleMessage(message);
        } catch (Exception e) {
            k.f13311A.g.g("AdMobHandler.handleMessage", e);
        }
    }
}
