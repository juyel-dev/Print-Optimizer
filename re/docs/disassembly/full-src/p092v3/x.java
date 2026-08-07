package p092v3;

import B3.k;
import O0.n;
import O3.c;
import g4.e;
import java.io.IOException;
import k4.i;
import kotlin.jvm.internal.o;
import o4.d;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class x implements e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f13587o;
    public final /* synthetic */ c p;

    public /* synthetic */ x(c cVar, int i5) {
        this.f13587o = i5;
        this.p = cVar;
    }

    @Override // g4.e
    public final void j(i call, IOException iOException) {
        switch (this.f13587o) {
            case 0:
                o.f(call, "call");
                this.p.invoke(new k(d.d(iOException)));
                break;
            default:
                o.f(call, "call");
                this.p.invoke(new k(d.d(iOException)));
                break;
        }
    }

    @Override // g4.e
    public final void l(i call, g4.x xVar) {
        switch (this.f13587o) {
            case 0:
                o.f(call, "call");
                n nVar = xVar.u;
                String strJ = nVar != null ? nVar.j() : "";
                boolean zG = xVar.g();
                c cVar = this.p;
                if (zG) {
                    cVar.invoke(new k(B3.o.f154a));
                } else {
                    try {
                        cVar.invoke(new k(d.d(new Exception(new JSONObject(strJ).optString("error", "Failed to send OTP")))));
                    } catch (Exception unused) {
                        cVar.invoke(new k(d.d(new Exception("Failed to send OTP: ".concat(strJ)))));
                        return;
                    }
                }
                break;
            default:
                o.f(call, "call");
                n nVar2 = xVar.u;
                String strJ2 = nVar2 != null ? nVar2.j() : "";
                boolean zG2 = xVar.g();
                c cVar2 = this.p;
                if (zG2) {
                    cVar2.invoke(new k(B3.o.f154a));
                } else {
                    try {
                        cVar2.invoke(new k(d.d(new Exception(new JSONObject(strJ2).optString("error", "Invalid OTP verification code")))));
                    } catch (Exception unused2) {
                        cVar2.invoke(new k(d.d(new Exception("Verification failed: ".concat(strJ2)))));
                    }
                }
                break;
        }
    }
}
