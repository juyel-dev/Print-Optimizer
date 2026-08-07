package p083t3;

import N.b;
import androidx.lifecycle.InterfaceC0666e;
import androidx.lifecycle.InterfaceC0683w;
import com.notescrafter.MainActivity;
import kotlin.jvm.internal.o;
import p036i2.e;
import p092v3.y;
import p101x2.j;
import p111z2.c;
import p111z2.d;

/* JADX INFO: renamed from: t3.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2280d implements InterfaceC0666e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ MainActivity f13157o;

    public C2280d(MainActivity mainActivity) {
        this.f13157o = mainActivity;
    }

    @Override // androidx.lifecycle.InterfaceC0666e
    public final void onDestroy(InterfaceC0683w interfaceC0683w) {
        e eVar = this.f13157o.f10855H;
        if (eVar == null) {
            o.k("updateManager");
            throw null;
        }
        d dVar = (d) eVar.p;
        y yVar = (y) eVar.f11537r;
        synchronized (dVar) {
            c cVar = dVar.f16091b;
            synchronized (cVar) {
                cVar.f16086a.f("unregisterListener", new Object[0]);
                if (yVar == null) {
                    throw new NullPointerException("Unregistered Play Core listener should not be null.");
                }
                cVar.f16089d.remove(yVar);
                cVar.a();
            }
        }
    }

    @Override // androidx.lifecycle.InterfaceC0666e
    public final void onResume(InterfaceC0683w owner) {
        o.f(owner, "owner");
        e eVar = this.f13157o.f10855H;
        if (eVar == null) {
            o.k("updateManager");
            throw null;
        }
        p101x2.o oVarA = ((d) eVar.p).a();
        b bVar = new b(new P0.b(eVar, 3), 19);
        oVarA.getClass();
        oVarA.c(j.f13714a, bVar);
    }
}
