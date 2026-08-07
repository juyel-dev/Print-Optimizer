package p041j2;

import android.util.Base64;
import java.security.SecureRandom;

/* JADX INFO: loaded from: classes2.dex */
public abstract class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final SecureRandom f11579a = new SecureRandom();

    public static String a() {
        byte[] bArr = new byte[16];
        f11579a.nextBytes(bArr);
        return Base64.encodeToString(bArr, 11);
    }
}
