package p105y1;

import Q1.f;
import Q1.i;
import android.content.Context;
import com.google.android.gms.internal.ads.AbstractC1869x7;
import com.google.android.gms.internal.ads.C0743Hd;
import com.google.android.gms.internal.ads.G3;
import com.google.android.gms.internal.ads.I3;
import com.google.android.gms.internal.ads.L3;
import com.google.android.gms.internal.ads.P4;
import java.util.regex.Pattern;
import p090v1.C2362o;
import p090v1.C2366q;

/* JADX INFO: renamed from: y1.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2800k extends P4 {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Context f15944r;

    public C2800k(Context context) {
        super(6);
        this.f15944r = context;
    }

    @Override // com.google.android.gms.internal.ads.P4, com.google.android.gms.internal.ads.D3
    public final G3 b(I3 i5) throws L3 {
        if (i5.p == 0) {
            String str = (String) C2366q.f13480d.f13483c.a(AbstractC1869x7.f9752Q3);
            String str2 = i5.q;
            if (Pattern.matches(str, str2)) {
                C0743Hd c0743Hd = C2362o.f13474f.f13475a;
                f fVar = f.f969b;
                Context context = this.f15944r;
                if (fVar.c(context, 13400000) == 0) {
                    G3 g3B = new i(context, 1).b(i5);
                    if (g3B != null) {
                        B.w("Got gmscore asset response: ".concat(String.valueOf(str2)));
                        return g3B;
                    }
                    B.w("Failed to get gmscore asset response: ".concat(String.valueOf(str2)));
                }
            }
        }
        return super.b(i5);
    }
}
