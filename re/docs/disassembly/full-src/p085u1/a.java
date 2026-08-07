package p085u1;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.internal.ads.C0826Vc;
import com.google.android.gms.internal.ads.C0849Zb;
import com.google.android.gms.internal.ads.InterfaceC0838Xc;
import java.util.Collections;
import java.util.List;
import p105y1.F;

/* JADX INFO: loaded from: classes2.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f13283a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f13284b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final InterfaceC0838Xc f13285c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C0849Zb f13286d = new C0849Zb(false, Collections.emptyList());

    public a(Context context, InterfaceC0838Xc interfaceC0838Xc) {
        this.f13283a = context;
        this.f13285c = interfaceC0838Xc;
    }

    public final void a(String str) {
        List<String> list;
        C0849Zb c0849Zb = this.f13286d;
        InterfaceC0838Xc interfaceC0838Xc = this.f13285c;
        if ((interfaceC0838Xc == null || !((C0826Vc) interfaceC0838Xc).g.t) && !c0849Zb.f6484o) {
            return;
        }
        if (str == null) {
            str = "";
        }
        if (interfaceC0838Xc != null) {
            ((C0826Vc) interfaceC0838Xc).a(str, null, 3);
            return;
        }
        if (!c0849Zb.f6484o || (list = c0849Zb.p) == null) {
            return;
        }
        for (String str2 : list) {
            if (!TextUtils.isEmpty(str2)) {
                String strReplace = str2.replace("{NAVIGATION_URL}", Uri.encode(str));
                F f5 = k.f13311A.f13314c;
                F.i(this.f13283a, "", strReplace);
            }
        }
    }

    public final boolean b() {
        InterfaceC0838Xc interfaceC0838Xc = this.f13285c;
        return ((interfaceC0838Xc == null || !((C0826Vc) interfaceC0838Xc).g.t) && !this.f13286d.f6484o) || this.f13284b;
    }
}
