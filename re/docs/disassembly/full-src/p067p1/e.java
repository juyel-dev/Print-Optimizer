package p067p1;

import androidx.compose.animation.core.AnimationConstants;
import com.google.android.gms.internal.ads.AbstractC1421mz;

/* JADX INFO: loaded from: classes2.dex */
public final class e {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final e f12263h = new e(320, 50, "320x50_mb");

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final e f12264i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final e f12265j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f12266a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f12267b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f12268c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f12269d;
    public int e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f12270f;
    public int g;

    static {
        new e(468, 60, "468x60_as");
        new e(320, 100, "320x100_as");
        new e(728, 90, "728x90_as");
        new e(AnimationConstants.DefaultDurationMillis, 250, "300x250_as");
        new e(160, 600, "160x600_as");
        new e(-1, -2, "smart_banner");
        f12264i = new e(-3, -4, "fluid");
        f12265j = new e(0, 0, "invalid");
        new e(50, 50, "50x50_mb");
        new e(-3, 0, "search_v2");
    }

    public e(int i5, int i6) {
        this(i5, i6, (i5 == -1 ? "FULL" : String.valueOf(i5)) + "x" + (i6 == -2 ? "AUTO" : String.valueOf(i6)) + "_as");
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.f12266a == eVar.f12266a && this.f12267b == eVar.f12267b && this.f12268c.equals(eVar.f12268c);
    }

    public final int hashCode() {
        return this.f12268c.hashCode();
    }

    public final String toString() {
        return this.f12268c;
    }

    public e(int i5, int i6, String str) {
        if (i5 < 0 && i5 != -1 && i5 != -3) {
            throw new IllegalArgumentException(AbstractC1421mz.h(i5, "Invalid width for AdSize: "));
        }
        if (i6 < 0 && i6 != -2 && i6 != -4) {
            throw new IllegalArgumentException(AbstractC1421mz.h(i6, "Invalid height for AdSize: "));
        }
        this.f12266a = i5;
        this.f12267b = i6;
        this.f12268c = str;
    }
}
