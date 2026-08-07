package p064o2;

import java.io.Serializable;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* JADX INFO: loaded from: classes2.dex */
public final class M extends G implements Serializable {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final MessageDigest f12101o;
    public final int p;
    public final boolean q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final String f12102r;

    public M() {
        boolean z3;
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            this.f12101o = messageDigest;
            this.p = messageDigest.getDigestLength();
            this.f12102r = "Hashing.sha256()";
            try {
                messageDigest.clone();
                z3 = true;
            } catch (CloneNotSupportedException unused) {
                z3 = false;
            }
            this.q = z3;
        } catch (NoSuchAlgorithmException e) {
            throw new AssertionError(e);
        }
    }

    public final String toString() {
        return this.f12102r;
    }
}
