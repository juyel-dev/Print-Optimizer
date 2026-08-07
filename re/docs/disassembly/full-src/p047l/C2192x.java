package p047l;

import java.util.Arrays;
import kotlin.jvm.internal.o;

/* JADX INFO: renamed from: l.x, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2192x extends AbstractC2176g {
    public final void b(float f5) {
        int i5 = this.f11779b + 1;
        float[] fArr = this.f11778a;
        if (fArr.length < i5) {
            float[] fArrCopyOf = Arrays.copyOf(fArr, Math.max(i5, (fArr.length * 3) / 2));
            o.e(fArrCopyOf, "copyOf(this, newSize)");
            this.f11778a = fArrCopyOf;
        }
        float[] fArr2 = this.f11778a;
        int i6 = this.f11779b;
        fArr2[i6] = f5;
        this.f11779b = i6 + 1;
    }
}
