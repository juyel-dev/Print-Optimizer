package p064o2;

import java.util.Comparator;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class T implements Comparator {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final T f12114o;
    public static final /* synthetic */ T[] p;

    static {
        T t = new T("INSTANCE", 0);
        f12114o = t;
        p = new T[]{t};
    }

    public static T[] values() {
        return (T[]) p.clone();
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        byte[] bArr = (byte[]) obj;
        byte[] bArr2 = (byte[]) obj2;
        int iMin = Math.min(bArr.length, bArr2.length);
        for (int i5 = 0; i5 < iMin; i5++) {
            int i6 = (bArr[i5] & 255) - (bArr2[i5] & 255);
            if (i6 != 0) {
                return i6;
            }
        }
        return bArr.length - bArr2.length;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "UnsignedBytes.lexicographicalComparator() (pure Java version)";
    }
}
