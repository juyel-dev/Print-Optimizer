package p102x3;

import p087u3.i;

/* JADX INFO: renamed from: x3.fd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class AbstractC2469fd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f15033a;

    static {
        int[] iArr = new int[i.values().length];
        try {
            iArr[i.HOME.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[i.WORK.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f15033a = iArr;
    }
}
