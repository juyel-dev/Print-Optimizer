package p058n0;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f11907a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f11908b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f11909c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f11910d;

    public h(int i5, int i6, long j5, long j6) {
        this.f11907a = i5;
        this.f11908b = i6;
        this.f11909c = j5;
        this.f11910d = j6;
    }

    public static h a(File file) throws IOException {
        DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file));
        try {
            h hVar = new h(dataInputStream.readInt(), dataInputStream.readInt(), dataInputStream.readLong(), dataInputStream.readLong());
            dataInputStream.close();
            return hVar;
        } catch (Throwable th) {
            try {
                dataInputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final void b(File file) throws IOException {
        file.delete();
        DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(file));
        try {
            dataOutputStream.writeInt(this.f11907a);
            dataOutputStream.writeInt(this.f11908b);
            dataOutputStream.writeLong(this.f11909c);
            dataOutputStream.writeLong(this.f11910d);
            dataOutputStream.close();
        } catch (Throwable th) {
            try {
                dataOutputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return this.f11908b == hVar.f11908b && this.f11909c == hVar.f11909c && this.f11907a == hVar.f11907a && this.f11910d == hVar.f11910d;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f11908b), Long.valueOf(this.f11909c), Integer.valueOf(this.f11907a), Long.valueOf(this.f11910d));
    }
}
