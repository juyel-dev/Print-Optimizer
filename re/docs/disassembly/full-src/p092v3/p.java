package p092v3;

import p087u3.d;

/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f13554a;

    static {
        int[] iArr = new int[d.values().length];
        try {
            iArr[d.HIGH.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[d.MEDIUM.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[d.LOW.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f13554a = iArr;
    }
}
