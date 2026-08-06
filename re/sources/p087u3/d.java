package p087u3;

import I3.a;
import K2.b;
import androidx.compose.animation.core.AnimationConstants;

/* JADX INFO: loaded from: classes2.dex */
public enum d {
    LOW(72),
    MEDIUM(150),
    HIGH(AnimationConstants.DefaultDurationMillis);

    private static final /* synthetic */ a $ENTRIES = b.m(values());
    private final int dpi;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    d(int i5) {
        this.dpi = i5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static a getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int getDpi() {
        return this.dpi;
    }
}
