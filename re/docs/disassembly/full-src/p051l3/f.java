package p051l3;

import java.io.IOException;
import java.io.StringWriter;
import p065o3.g;
import p065o3.o;
import p065o3.q;
import p079s3.b;

/* JADX INFO: loaded from: classes2.dex */
public abstract class f {
    public final String toString() {
        try {
            StringWriter stringWriter = new StringWriter();
            b bVar = new b(stringWriter);
            bVar.f12365s = true;
            o oVar = q.f12209a;
            g.d(bVar, this);
            return stringWriter.toString();
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }
}
