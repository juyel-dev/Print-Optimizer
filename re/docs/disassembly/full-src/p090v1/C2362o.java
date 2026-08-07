package p090v1;

import com.google.android.gms.internal.ads.C0743Hd;
import com.google.android.gms.internal.ads.C0785Od;
import com.google.android.gms.internal.ads.C1038e9;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Random;
import java.util.UUID;

/* JADX INFO: renamed from: v1.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2362o {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final C2362o f13474f = new C2362o();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0743Hd f13475a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C2358m f13476b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f13477c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C0785Od f13478d;
    public final Random e;

    public C2362o() {
        C0743Hd c0743Hd = new C0743Hd();
        c0743Hd.f3903a = -1.0f;
        C2358m c2358m = new C2358m(new C1038e9("com.google.android.gms.ads.AdManagerCreatorImpl", 3), new C1038e9("com.google.android.gms.ads.AdLoaderBuilderCreatorImpl", 2), new C1038e9("com.google.android.gms.ads.NativeAdViewDelegateCreatorImpl", 0), new C1038e9("com.google.android.gms.ads.AdOverlayCreatorImpl", 1));
        UUID uuidRandomUUID = UUID.randomUUID();
        byte[] byteArray = BigInteger.valueOf(uuidRandomUUID.getLeastSignificantBits()).toByteArray();
        byte[] byteArray2 = BigInteger.valueOf(uuidRandomUUID.getMostSignificantBits()).toByteArray();
        String string = new BigInteger(1, byteArray).toString();
        for (int i5 = 0; i5 < 2; i5++) {
            try {
                MessageDigest messageDigest = MessageDigest.getInstance("MD5");
                messageDigest.update(byteArray);
                messageDigest.update(byteArray2);
                byte[] bArr = new byte[8];
                System.arraycopy(messageDigest.digest(), 0, bArr, 0, 8);
                string = new BigInteger(1, bArr).toString();
            } catch (NoSuchAlgorithmException unused) {
            }
        }
        C0785Od c0785Od = new C0785Od(0, 240304000, true, false);
        Random random = new Random();
        this.f13475a = c0743Hd;
        this.f13476b = c2358m;
        this.f13477c = string;
        this.f13478d = c0785Od;
        this.e = random;
    }
}
