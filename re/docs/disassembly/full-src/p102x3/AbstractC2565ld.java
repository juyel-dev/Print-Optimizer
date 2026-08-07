package p102x3;

import p087u3.i;

/* JADX INFO: renamed from: x3.ld, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class AbstractC2565ld {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f15297a;

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
        try {
            iArr[i.TEMPORARY.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f15297a = iArr;
    }
}
