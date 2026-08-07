package p111z2;

import android.content.Context;
import java.io.File;

/* JADX INFO: loaded from: classes2.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f16103a;

    public k(Context context) {
        this.f16103a = context;
    }

    public static long a(File file) {
        if (!file.isDirectory()) {
            return file.length();
        }
        File[] fileArrListFiles = file.listFiles();
        long jA = 0;
        if (fileArrListFiles != null) {
            for (File file2 : fileArrListFiles) {
                jA += a(file2);
            }
        }
        return jA;
    }
}
