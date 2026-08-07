package p065o3;

import com.google.gson.reflect.TypeToken;
import p051l3.d;
import p051l3.p;
import p051l3.q;

/* JADX INFO: loaded from: classes2.dex */
public final class o implements q {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f12206o;
    public final /* synthetic */ Class p;
    public final /* synthetic */ p q;

    public /* synthetic */ o(Class cls, p pVar, int i5) {
        this.f12206o = i5;
        this.p = cls;
        this.q = pVar;
    }

    @Override // p051l3.q
    public final p a(d dVar, TypeToken typeToken) {
        switch (this.f12206o) {
            case 0:
                if (typeToken.getRawType() == this.p) {
                    return this.q;
                }
                return null;
            default:
                Class<?> rawType = typeToken.getRawType();
                if (this.p.isAssignableFrom(rawType)) {
                    return new b(this, rawType);
                }
                return null;
        }
    }

    public final String toString() {
        switch (this.f12206o) {
            case 0:
                return "Factory[type=" + this.p.getName() + ",adapter=" + this.q + "]";
            default:
                return "Factory[typeHierarchy=" + this.p.getName() + ",adapter=" + this.q + "]";
        }
    }
}
