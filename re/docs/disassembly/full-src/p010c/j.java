package p010c;

import android.content.Intent;
import android.content.IntentSender;
import com.google.android.gms.internal.ads.C0972cn;
import java.io.Serializable;
import kotlin.jvm.internal.o;
import p022f.b;
import p042j3.c;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class j implements Runnable {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f2496o;
    public final /* synthetic */ Object p;
    public final /* synthetic */ int q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Object f2497r;

    public /* synthetic */ j(int i5, int i6, Object obj, Object obj2) {
        this.f2496o = i6;
        this.p = obj;
        this.q = i5;
        this.f2497r = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2496o) {
            case 0:
                k this$0 = (k) this.p;
                o.f(this$0, "this$0");
                Object obj = ((c) this.f2497r).p;
                String str = (String) this$0.f2498a.get(Integer.valueOf(this.q));
                if (str != null) {
                    p022f.c cVar = (p022f.c) this$0.e.get(str);
                    if ((cVar != null ? cVar.f11122a : null) != null) {
                        b bVar = cVar.f11122a;
                        if (this$0.f2501d.remove(str)) {
                            bVar.d(obj);
                        }
                    } else {
                        this$0.g.remove(str);
                        this$0.f2502f.put(str, obj);
                    }
                    break;
                }
                break;
            case 1:
                k this$1 = (k) this.p;
                o.f(this$1, "this$0");
                IntentSender.SendIntentException e = (IntentSender.SendIntentException) this.f2497r;
                o.f(e, "$e");
                this$1.a(this.q, 0, new Intent().setAction("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.SEND_INTENT_EXCEPTION", e));
                break;
            default:
                ((p058n0.b) ((C0972cn) this.p).q).a(this.q, (Serializable) this.f2497r);
                break;
        }
    }
}
