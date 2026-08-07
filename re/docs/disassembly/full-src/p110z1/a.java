package p110z1;

import E1.b;
import T1.z;
import android.app.Activity;
import android.content.Context;
import com.google.android.gms.internal.ads.AbstractC0725Ed;
import com.google.android.gms.internal.ads.AbstractC1869x7;
import com.google.android.gms.internal.ads.S9;
import com.google.android.gms.internal.ads.U7;
import p067p1.d;
import p090v1.C2366q;

/* JADX INFO: loaded from: classes2.dex */
public abstract class a {
    public static void a(Context context, String str, d dVar, b bVar) {
        z.j(context, "Context cannot be null.");
        z.j(str, "AdUnitId cannot be null.");
        z.j(dVar, "AdRequest cannot be null.");
        z.d("#008 Must be called on the main UI thread.");
        AbstractC1869x7.a(context);
        if (((Boolean) U7.g.p()).booleanValue()) {
            if (((Boolean) C2366q.f13480d.f13483c.a(AbstractC1869x7.K9)).booleanValue()) {
                AbstractC0725Ed.f3291b.execute(new b(context, str, dVar, bVar, 17));
                return;
            }
        }
        new S9(context, str).c(dVar.f12262a, bVar);
    }

    public abstract void b(Activity activity);
}
