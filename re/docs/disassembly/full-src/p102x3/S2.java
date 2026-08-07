package p102x3;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;

/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class S2 {
    public static final boolean a(int i5) {
        return i5 == 3 || i5 == 4 || i5 == 6;
    }

    public static boolean b(Composer composer) {
        composer.endNode();
        composer.endNode();
        composer.endNode();
        return ComposerKt.isTraceInProgress();
    }

    public static /* synthetic */ String c(int i5) {
        switch (i5) {
            case 1:
                return "NOT_REQUIRED";
            case 2:
                return "CONNECTED";
            case 3:
                return "UNMETERED";
            case 4:
                return "NOT_ROAMING";
            case 5:
                return "METERED";
            case 6:
                return "TEMPORARILY_UNMETERED";
            default:
                return "null";
        }
    }

    public static /* synthetic */ String d(int i5) {
        switch (i5) {
            case 1:
                return "ENQUEUED";
            case 2:
                return "RUNNING";
            case 3:
                return "SUCCEEDED";
            case 4:
                return "FAILED";
            case 5:
                return "BLOCKED";
            case 6:
                return "CANCELLED";
            default:
                return "null";
        }
    }
}
