package p065o3;

import com.google.gson.reflect.TypeToken;
import java.util.Calendar;
import java.util.GregorianCalendar;
import p051l3.d;
import p051l3.p;
import p051l3.q;

/* JADX INFO: loaded from: classes2.dex */
public final class f implements q {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f12179o;
    public final /* synthetic */ p p;

    public /* synthetic */ f(p pVar, int i5) {
        this.f12179o = i5;
        this.p = pVar;
    }

    @Override // p051l3.q
    public final p a(d dVar, TypeToken typeToken) {
        switch (this.f12179o) {
            case 0:
                if (typeToken.getRawType() == Number.class) {
                    return (g) this.p;
                }
                return null;
            default:
                Class rawType = typeToken.getRawType();
                if (rawType == Calendar.class || rawType == GregorianCalendar.class) {
                    return (g) this.p;
                }
                return null;
        }
    }

    public String toString() {
        switch (this.f12179o) {
            case 1:
                return "Factory[type=" + Calendar.class.getName() + "+" + GregorianCalendar.class.getName() + ",adapter=" + ((g) this.p) + "]";
            default:
                return super.toString();
        }
    }
}
