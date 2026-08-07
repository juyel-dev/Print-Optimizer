package p047l;

import kotlin.jvm.internal.o;

/* JADX INFO: loaded from: classes.dex */
public abstract class U {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final long[] f11754a = {-9187201950435737345L, -1};

    static {
        new J(0);
    }

    public static final void a(long[] metadata, int i5) {
        o.f(metadata, "metadata");
        int i6 = (i5 + 7) >> 3;
        for (int i7 = 0; i7 < i6; i7++) {
            long j5 = metadata[i7] & (-9187201950435737472L);
            metadata[i7] = (-72340172838076674L) & ((~j5) + (j5 >>> 7));
        }
        int length = metadata.length;
        int i8 = length - 1;
        int i9 = length - 2;
        metadata[i9] = (metadata[i9] & 72057594037927935L) | (-72057594037927936L);
        metadata[i8] = metadata[0];
    }

    public static final int b(long[] metadata, int i5, int i6) {
        o.f(metadata, "metadata");
        while (i5 < i6) {
            if (((metadata[i5 >> 3] >> ((i5 & 7) << 3)) & 255) == 128) {
                return i5;
            }
            i5++;
        }
        return -1;
    }

    public static final int c(int i5) {
        if (i5 == 7) {
            return 6;
        }
        return i5 - (i5 / 8);
    }

    public static final int d(int i5) {
        if (i5 == 0) {
            return 6;
        }
        return (i5 * 2) + 1;
    }

    public static final int e(int i5) {
        if (i5 > 0) {
            return (-1) >>> Integer.numberOfLeadingZeros(i5);
        }
        return 0;
    }

    public static final int f(int i5) {
        if (i5 == 7) {
            return 8;
        }
        return ((i5 - 1) / 7) + i5;
    }
}
