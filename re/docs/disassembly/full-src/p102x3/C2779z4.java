package p102x3;

import B3.o;
import O3.a;
import android.content.Context;
import android.widget.Toast;
import com.notescrafter.utils.NetworkUtils;

/* JADX INFO: renamed from: x3.z4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C2779z4 implements a {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f15798o;
    public final /* synthetic */ Context p;
    public final /* synthetic */ a q;

    public /* synthetic */ C2779z4(Context context, a aVar, int i5) {
        this.f15798o = i5;
        this.p = context;
        this.q = aVar;
    }

    @Override // O3.a
    public final Object invoke() {
        switch (this.f15798o) {
            case 0:
                NetworkUtils networkUtils = NetworkUtils.INSTANCE;
                Context context = this.p;
                if (networkUtils.isInternetAvailable(context)) {
                    this.q.invoke();
                } else {
                    Toast.makeText(context, "Internet is required to process files", 0).show();
                }
                break;
            default:
                NetworkUtils networkUtils2 = NetworkUtils.INSTANCE;
                Context context2 = this.p;
                if (networkUtils2.isInternetAvailable(context2)) {
                    this.q.invoke();
                } else {
                    Toast.makeText(context2, "Internet is required to proceed", 0).show();
                }
                break;
        }
        return o.f154a;
    }
}
