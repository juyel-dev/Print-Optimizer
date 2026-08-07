package p064o2;

import java.util.Comparator;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public abstract class U {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Comparator f12115a;

    static {
        Comparator comparator;
        try {
            Object[] enumConstants = Class.forName(U.class.getName().concat("$UnsafeComparator")).getEnumConstants();
            Objects.requireNonNull(enumConstants);
            comparator = (Comparator) enumConstants[0];
        } catch (Throwable unused) {
            comparator = T.f12114o;
        }
        f12115a = comparator;
    }
}
