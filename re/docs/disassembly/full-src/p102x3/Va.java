package p102x3;

import O3.c;
import android.content.Context;
import android.widget.Toast;
import androidx.compose.runtime.MutableState;
import kotlin.jvm.internal.o;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class Va implements c {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f14534o;
    public final /* synthetic */ Context p;
    public final /* synthetic */ MutableState q;

    public /* synthetic */ Va(Context context, MutableState mutableState, int i5) {
        this.f14534o = i5;
        this.p = context;
        this.q = mutableState;
    }

    @Override // O3.c
    public final Object invoke(Object obj) {
        String err = (String) obj;
        switch (this.f14534o) {
            case 0:
                o.f(err, "err");
                AbstractC2595nb.e(this.q, false);
                Toast.makeText(this.p, err, 1).show();
                break;
            default:
                o.f(err, "err");
                AbstractC2595nb.e(this.q, false);
                Toast.makeText(this.p, err, 1).show();
                break;
        }
        return B3.o.f154a;
    }
}
