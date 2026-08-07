package p003a2;

import P0.c;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Binder;
import android.os.Process;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.C;
import p077s0.a;
import p080t0.e;

/* JADX INFO: loaded from: classes2.dex */
public final class b implements a {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Context f1954o;

    public /* synthetic */ b(Context context) {
        this.f1954o = context;
    }

    public ApplicationInfo a(int i5, String str) {
        return this.f1954o.getPackageManager().getApplicationInfo(str, i5);
    }

    @Override // p077s0.a
    public p077s0.b b(c cVar) {
        C c5 = (C) cVar.f827r;
        if (c5 == null) {
            throw new IllegalArgumentException("Must set a callback to create the configuration.");
        }
        Context context = this.f1954o;
        if (context == null) {
            throw new IllegalArgumentException("Must set a non-null context to create the configuration.");
        }
        String str = (String) cVar.q;
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Must set a non-null database name to a configuration that uses the no backup directory.");
        }
        c cVar2 = new c(context, str, c5, true);
        return new e((Context) cVar2.p, (String) cVar2.q, (C) cVar2.f827r, cVar2.f826o);
    }

    public PackageInfo c(int i5, String str) {
        return this.f1954o.getPackageManager().getPackageInfo(str, i5);
    }

    public boolean d() {
        String nameForUid;
        int callingUid = Binder.getCallingUid();
        int iMyUid = Process.myUid();
        Context context = this.f1954o;
        if (callingUid == iMyUid) {
            return a.y(context);
        }
        if (!Y1.b.h() || (nameForUid = context.getPackageManager().getNameForUid(Binder.getCallingUid())) == null) {
            return false;
        }
        return context.getPackageManager().isInstantApp(nameForUid);
    }
}
