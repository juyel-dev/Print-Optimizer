package p064o2;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.MessageDigest;

/* JADX INFO: loaded from: classes2.dex */
public final class L {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MessageDigest f12098a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f12099b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f12100c;

    public L(MessageDigest messageDigest, int i5) {
        ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN);
        this.f12098a = messageDigest;
        this.f12099b = i5;
    }
}
