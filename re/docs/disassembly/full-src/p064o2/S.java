package p064o2;

import java.math.RoundingMode;

/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class S {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f12113a;

    static {
        int[] iArr = new int[RoundingMode.values().length];
        f12113a = iArr;
        try {
            iArr[RoundingMode.UNNECESSARY.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f12113a[RoundingMode.DOWN.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f12113a[RoundingMode.FLOOR.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f12113a[RoundingMode.UP.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            f12113a[RoundingMode.CEILING.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            f12113a[RoundingMode.HALF_DOWN.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            f12113a[RoundingMode.HALF_UP.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            f12113a[RoundingMode.HALF_EVEN.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
    }
}
