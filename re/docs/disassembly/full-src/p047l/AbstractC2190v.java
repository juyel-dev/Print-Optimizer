package p047l;

import java.util.ConcurrentModificationException;
import kotlin.jvm.internal.o;
import p052m.a;

/* JADX INFO: renamed from: l.v, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2190v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f11805a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Object[] f11806b = new Object[0];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f11807c = new Object();

    public static final void a(C2175f c2175f, int i5) {
        o.f(c2175f, "<this>");
        c2175f.f11777o = new int[i5];
        c2175f.p = new Object[i5];
    }

    public static long b(float f5, float f6) {
        return (((long) Float.floatToRawIntBits(f6)) & 4294967295L) | (Float.floatToRawIntBits(f5) << 32);
    }

    public static final int c(C2175f c2175f, Object obj, int i5) {
        o.f(c2175f, "<this>");
        int i6 = c2175f.q;
        if (i6 == 0) {
            return -1;
        }
        try {
            int iA = a.a(c2175f.f11777o, c2175f.q, i5);
            if (iA < 0 || o.b(obj, c2175f.p[iA])) {
                return iA;
            }
            int i7 = iA + 1;
            while (i7 < i6 && c2175f.f11777o[i7] == i5) {
                if (o.b(obj, c2175f.p[i7])) {
                    return i7;
                }
                i7++;
            }
            for (int i8 = iA - 1; i8 >= 0 && c2175f.f11777o[i8] == i5; i8--) {
                if (o.b(obj, c2175f.p[i8])) {
                    return i8;
                }
            }
            return ~i7;
        } catch (IndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }
}
