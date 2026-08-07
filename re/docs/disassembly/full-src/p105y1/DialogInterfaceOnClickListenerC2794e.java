package p105y1;

import android.content.DialogInterface;
import android.net.Uri;
import java.util.concurrent.atomic.AtomicInteger;
import p085u1.k;

/* JADX INFO: renamed from: y1.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class DialogInterfaceOnClickListenerC2794e implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15920a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f15921b;

    public /* synthetic */ DialogInterfaceOnClickListenerC2794e(Object obj, int i5) {
        this.f15920a = i5;
        this.f15921b = obj;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i5) {
        switch (this.f15920a) {
            case 0:
                ((AtomicInteger) this.f15921b).set(i5);
                break;
            case 1:
                ((C2796g) this.f15921b).b();
                break;
            default:
                F f5 = k.f13311A.f13314c;
                F.p(((RunnableC2798i) this.f15921b).f15937o, Uri.parse("https://support.google.com/dfp_premium/answer/7160685#push"));
                break;
        }
    }
}
