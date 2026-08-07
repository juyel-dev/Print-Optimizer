package p111z2;

import B2.a;
import android.os.Bundle;
import p101x2.i;

/* JADX INFO: loaded from: classes2.dex */
public final class h extends g {
    @Override // p111z2.g, A2.i
    public final void D2(Bundle bundle) {
        super.D2(bundle);
        int i5 = bundle.getInt("error.code", -2);
        i iVar = this.q;
        if (i5 != 0) {
            iVar.c(new a(bundle.getInt("error.code", -2)));
        } else {
            iVar.d(null);
        }
    }
}
