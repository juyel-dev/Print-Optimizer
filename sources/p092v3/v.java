package p092v3;

import androidx.compose.ui.graphics.Fields;
import g4.p;
import java.io.File;
import java.io.FileInputStream;
import p003a2.a;
import p013c2.g;
import t4.InterfaceC2332h;

/* JADX INFO: loaded from: classes2.dex */
public final class v extends g {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final File f13583c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p f13584d;
    public final long e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f13585f;

    public v(File file, p pVar, long j5, long j6) {
        this.f13583c = file;
        this.f13584d = pVar;
        this.e = j5;
        this.f13585f = j6;
    }

    @Override // p013c2.g
    public final void B(InterfaceC2332h interfaceC2332h) throws Throwable {
        int i5;
        FileInputStream fileInputStream = new FileInputStream(this.f13583c);
        try {
            fileInputStream.skip(this.e);
            byte[] bArr = new byte[Fields.Shape];
            long j5 = this.f13585f;
            while (j5 > 0 && (i5 = fileInputStream.read(bArr, 0, (int) Math.min(Fields.Shape, j5))) != -1) {
                interfaceC2332h.o(bArr, 0, i5);
                j5 -= (long) i5;
            }
            try {
                fileInputStream.close();
                th = null;
            } catch (Throwable th) {
                th = th;
            }
        } catch (Throwable th2) {
            th = th2;
            try {
                fileInputStream.close();
            } catch (Throwable th3) {
                a.c(th, th3);
            }
        }
        if (th != null) {
            throw th;
        }
    }

    @Override // p013c2.g
    public final long f() {
        return this.f13585f;
    }

    @Override // p013c2.g
    public final p g() {
        return this.f13584d;
    }
}
