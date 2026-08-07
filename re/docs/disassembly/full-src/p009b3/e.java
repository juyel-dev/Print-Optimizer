package p009b3;

import T1.z;

/* JADX INFO: loaded from: classes2.dex */
public final class e extends Exception {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(String str) {
        super(str);
        z.f(str, "Detail message must not be empty");
    }
}
