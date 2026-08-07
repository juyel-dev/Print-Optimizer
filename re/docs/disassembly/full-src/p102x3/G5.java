package p102x3;

import K2.b;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 x3.G5[], still in use, count: 1, list:
  (r0v1 x3.G5[]) from 0x002a: INVOKE (r0v1 x3.G5[]) STATIC call: K2.b.m(java.lang.Enum[]):I3.b A[MD:(java.lang.Enum[]):I3.b (m)] (LINE:43)
	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:257)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:187)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes2.dex */
public final class G5 {
    PORTRAIT("Portrait"),
    LANDSCAPE("Landscape"),
    AUTO("Auto");


    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final String f13983o;

    static {
        b.m(g5Arr);
    }

    public G5(String str) {
        super(str, i);
        this.f13983o = str;
    }

    public static G5 valueOf(String str) {
        return (G5) Enum.valueOf(G5.class, str);
    }

    public static G5[] values() {
        return (G5[]) f13982s.clone();
    }
}
