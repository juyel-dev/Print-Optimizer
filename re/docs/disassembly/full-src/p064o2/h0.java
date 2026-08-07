package p064o2;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.Arrays;
import p076s.b;

/* JADX INFO: loaded from: classes2.dex */
public abstract class h0 implements Comparable {
    public static int d(byte b5) {
        return (b5 >> 5) & 7;
    }

    public static h0 e(byte... bArr) {
        bArr.getClass();
        j0 j0Var = new j0(new ByteArrayInputStream(Arrays.copyOf(bArr, bArr.length)));
        try {
            return AbstractC2198a.k(j0Var);
        } finally {
            try {
                j0Var.close();
            } catch (IOException unused) {
            }
        }
    }

    public abstract int a();

    public int b() {
        return 0;
    }

    public final h0 c(Class cls) throws g0 {
        if (cls.isInstance(this)) {
            return (h0) cls.cast(this);
        }
        throw new g0(b.l("Expected a ", cls.getName(), " value, but got ", getClass().getName()));
    }
}
