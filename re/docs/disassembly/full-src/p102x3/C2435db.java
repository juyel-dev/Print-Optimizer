package p102x3;

import B3.o;
import O3.c;
import W3.j;
import androidx.compose.runtime.MutableState;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;
import p087u3.q;

/* JADX INFO: renamed from: x3.db, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C2435db implements c {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f14933o;
    public final /* synthetic */ MutableState p;

    public /* synthetic */ C2435db(int i5, MutableState mutableState) {
        this.f14933o = i5;
        this.p = mutableState;
    }

    @Override // O3.c
    public final Object invoke(Object obj) {
        o oVar = o.f154a;
        MutableState mutableState = this.p;
        switch (this.f14933o) {
            case 0:
                String it = (String) obj;
                kotlin.jvm.internal.o.f(it, "it");
                mutableState.setValue(it);
                break;
            case 1:
                String it2 = (String) obj;
                kotlin.jvm.internal.o.f(it2, "it");
                Pattern patternCompile = Pattern.compile("\\D");
                kotlin.jvm.internal.o.e(patternCompile, "compile(...)");
                String strReplaceAll = patternCompile.matcher(it2).replaceAll("");
                kotlin.jvm.internal.o.e(strReplaceAll, "replaceAll(...)");
                mutableState.setValue(j.F0(10, strReplaceAll));
                break;
            case 2:
                String it3 = (String) obj;
                kotlin.jvm.internal.o.f(it3, "it");
                Pattern patternCompile2 = Pattern.compile("\\D");
                kotlin.jvm.internal.o.e(patternCompile2, "compile(...)");
                String strReplaceAll2 = patternCompile2.matcher(it3).replaceAll("");
                kotlin.jvm.internal.o.e(strReplaceAll2, "replaceAll(...)");
                mutableState.setValue(j.F0(6, strReplaceAll2));
                break;
            case 3:
                Integer num = (Integer) obj;
                num.intValue();
                mutableState.setValue(num);
                break;
            case 4:
                String it4 = (String) obj;
                kotlin.jvm.internal.o.f(it4, "it");
                String upperCase = it4.toUpperCase(Locale.ROOT);
                kotlin.jvm.internal.o.e(upperCase, "toUpperCase(...)");
                mutableState.setValue(upperCase);
                break;
            case 5:
                q it5 = (q) obj;
                kotlin.jvm.internal.o.f(it5, "it");
                mutableState.setValue(it5);
                break;
            case 6:
                Float f5 = (Float) obj;
                f5.floatValue();
                List list = Kd.f14143a;
                mutableState.setValue(f5);
                break;
            case 7:
                String it6 = (String) obj;
                kotlin.jvm.internal.o.f(it6, "it");
                mutableState.setValue(it6);
                break;
            case 8:
                String it7 = (String) obj;
                kotlin.jvm.internal.o.f(it7, "it");
                mutableState.setValue(it7);
                break;
            default:
                String it8 = (String) obj;
                kotlin.jvm.internal.o.f(it8, "it");
                mutableState.setValue(it8);
                break;
        }
        return oVar;
    }
}
