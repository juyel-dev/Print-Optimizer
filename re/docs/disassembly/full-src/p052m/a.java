package p052m;

import kotlin.jvm.internal.o;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int[] f11870a = new int[0];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final long[] f11871b = new long[0];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object[] f11872c = new Object[0];

    public static final int a(int[] array, int i5, int i6) {
        o.f(array, "array");
        int i7 = i5 - 1;
        int i8 = 0;
        while (i8 <= i7) {
            int i9 = (i8 + i7) >>> 1;
            int i10 = array[i9];
            if (i10 < i6) {
                i8 = i9 + 1;
            } else {
                if (i10 <= i6) {
                    return i9;
                }
                i7 = i9 - 1;
            }
        }
        return ~i8;
    }

    public static final int b(long[] array, int i5, long j5) {
        o.f(array, "array");
        int i6 = i5 - 1;
        int i7 = 0;
        while (i7 <= i6) {
            int i8 = (i7 + i6) >>> 1;
            long j6 = array[i8];
            if (j6 < j5) {
                i7 = i8 + 1;
            } else {
                if (j6 <= j5) {
                    return i8;
                }
                i6 = i8 - 1;
            }
        }
        return ~i7;
    }

    public static final void c(String message) {
        o.f(message, "message");
        throw new IllegalArgumentException(message);
    }
}
