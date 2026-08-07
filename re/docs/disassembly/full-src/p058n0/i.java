package p058n0;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import java.io.File;
import java.io.IOException;
import p046k2.h;
import p088v.k;

/* JADX INFO: loaded from: classes2.dex */
public abstract class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final k f11911a = new k();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Object f11912b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static h f11913c = null;

    public static long a(Context context) {
        PackageManager packageManager = context.getApplicationContext().getPackageManager();
        return Build.VERSION.SDK_INT >= 33 ? g.a(packageManager, context).lastUpdateTime : packageManager.getPackageInfo(context.getPackageName(), 0).lastUpdateTime;
    }

    public static h b() {
        h hVar = new h(7);
        f11913c = hVar;
        f11911a.j(hVar);
        return f11913c;
    }

    public static void c(Context context, boolean z3) {
        h hVarA;
        int i5;
        if (z3 || f11913c == null) {
            synchronized (f11912b) {
                if (!z3) {
                    try {
                        if (f11913c != null) {
                            return;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                int i6 = Build.VERSION.SDK_INT;
                if (i6 >= 28 && i6 != 30) {
                    File file = new File(new File("/data/misc/profiles/ref/", context.getPackageName()), "primary.prof");
                    long length = file.length();
                    int i7 = 0;
                    boolean z4 = file.exists() && length > 0;
                    File file2 = new File(new File("/data/misc/profiles/cur/0/", context.getPackageName()), "primary.prof");
                    long length2 = file2.length();
                    boolean z5 = file2.exists() && length2 > 0;
                    try {
                        long jA = a(context);
                        File file3 = new File(context.getFilesDir(), "profileInstalled");
                        if (file3.exists()) {
                            try {
                                hVarA = h.a(file3);
                            } catch (IOException unused) {
                                b();
                                return;
                            }
                        } else {
                            hVarA = null;
                        }
                        if (hVarA != null && hVarA.f11909c == jA && (i5 = hVarA.f11908b) != 2) {
                            i7 = i5;
                        } else if (z4) {
                            i7 = 1;
                        } else if (z5) {
                            i7 = 2;
                        }
                        if (z3 && z5 && i7 != 1) {
                            i7 = 2;
                        }
                        h hVar = new h(1, (hVarA == null || hVarA.f11908b != 2 || i7 != 1 || length >= hVarA.f11910d) ? i7 : 3, jA, length2);
                        if (hVarA == null || !hVarA.equals(hVar)) {
                            try {
                                hVar.b(file3);
                            } catch (IOException unused2) {
                            }
                        }
                        b();
                        return;
                    } catch (PackageManager.NameNotFoundException unused3) {
                        b();
                        return;
                    }
                }
                b();
            }
        }
    }
}
