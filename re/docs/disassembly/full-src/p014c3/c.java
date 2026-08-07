package p014c3;

import K2.g;
import K2.j;
import android.content.SharedPreferences;
import android.util.Base64;
import android.util.Log;
import java.security.KeyFactory;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;

/* JADX INFO: loaded from: classes2.dex */
public final class c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String[] f2578c = {"*", "FCM", "GCM", ""};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SharedPreferences f2579a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f2580b;

    /* JADX WARN: Code duplicated, block: B:12:0x003c  */
    public c(g gVar) {
        gVar.a();
        this.f2579a = gVar.f607a.getSharedPreferences("com.google.android.gms.appid", 0);
        gVar.a();
        j jVar = gVar.f609c;
        String str = jVar.e;
        if (str == null) {
            gVar.a();
            str = jVar.f619b;
            if (str.startsWith("1:") || str.startsWith("2:")) {
                String[] strArrSplit = str.split(":");
                if (strArrSplit.length != 4) {
                    str = null;
                } else {
                    str = strArrSplit[1];
                    if (str.isEmpty()) {
                        str = null;
                    }
                }
            }
        }
        this.f2580b = str;
    }

    public final String a() {
        PublicKey publicKeyGeneratePublic;
        synchronized (this.f2579a) {
            String strEncodeToString = null;
            String string = this.f2579a.getString("|S||P|", null);
            if (string == null) {
                return null;
            }
            try {
                publicKeyGeneratePublic = KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(Base64.decode(string, 8)));
            } catch (IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException e) {
                Log.w("ContentValues", "Invalid key stored " + e);
                publicKeyGeneratePublic = null;
            }
            if (publicKeyGeneratePublic == null) {
                return null;
            }
            try {
                byte[] bArrDigest = MessageDigest.getInstance("SHA1").digest(publicKeyGeneratePublic.getEncoded());
                bArrDigest[0] = (byte) (((bArrDigest[0] & 15) + 112) & 255);
                strEncodeToString = Base64.encodeToString(bArrDigest, 0, 8, 11);
            } catch (NoSuchAlgorithmException unused) {
                Log.w("ContentValues", "Unexpected error, device missing required algorithms");
            }
            return strEncodeToString;
        }
    }
}
