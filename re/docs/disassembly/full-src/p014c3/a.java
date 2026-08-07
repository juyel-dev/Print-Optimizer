package p014c3;

import android.content.Context;
import com.google.android.gms.internal.ads.AbstractC0773Md;
import com.google.android.gms.internal.ads.AbstractC0803Rd;
import com.google.android.gms.internal.ads.C1134ga;
import com.google.android.gms.internal.ads.C1264ja;
import com.google.android.gms.internal.ads.C1308ka;
import com.google.android.gms.internal.ads.C1966zG;
import com.google.android.gms.internal.ads.E0;
import com.google.android.gms.internal.ads.Gv;
import com.google.android.gms.internal.ads.InterfaceC1545pr;
import com.google.android.gms.internal.ads.Xn;
import g4.m;
import g4.n;
import g4.t;
import g4.u;
import g4.w;
import g4.x;
import java.io.EOFException;
import java.io.IOException;
import java.net.Proxy;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import k4.k;
import kotlin.jvm.internal.o;
import l4.d;
import l4.e;
import m4.c;
import m4.f;
import p020e1.h;
import p105y1.B;
import p111z2.b;
import t4.D;
import t4.F;
import t4.y;
import t4.z;

/* JADX INFO: loaded from: classes2.dex */
public final class a implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f2568a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f2569b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f2570c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f2571d;
    public Object e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Object f2572f;
    public Object g;

    public a(t tVar, k connection, z source, y sink) {
        o.f(connection, "connection");
        o.f(source, "source");
        o.f(sink, "sink");
        this.f2568a = tVar;
        this.f2570c = connection;
        this.f2571d = source;
        this.e = sink;
        o.f(source, "source");
        E0 e3 = new E0();
        e3.p = source;
        e3.f3226o = 262144L;
        this.f2572f = e3;
    }

    @Override // l4.d
    public void a() {
        ((y) this.e).flush();
    }

    @Override // l4.d
    public w b(boolean z3) throws IOException {
        E0 e3 = (E0) this.f2572f;
        int i5 = this.f2569b;
        if (i5 != 1 && i5 != 2 && i5 != 3) {
            throw new IllegalStateException(("state: " + this.f2569b).toString());
        }
        try {
            String strA = ((z) e3.p).A(e3.f3226o);
            e3.f3226o -= (long) strA.length();
            W1.a aVarS = b.s(strA);
            int i6 = aVarS.f1697c;
            w wVar = new w();
            wVar.f11389b = (u) aVarS.f1698d;
            wVar.f11390c = i6;
            wVar.f11391d = aVarS.f1696b;
            wVar.f11392f = e3.f().k();
            if (z3 && i6 == 100) {
                return null;
            }
            if (i6 == 100) {
                this.f2569b = 3;
                return wVar;
            }
            if (102 > i6 || i6 >= 200) {
                this.f2569b = 4;
                return wVar;
            }
            this.f2569b = 3;
            return wVar;
        } catch (EOFException e) {
            throw new IOException("unexpected end of stream on ".concat(((k) this.f2570c).f11677b.f11411a.f11260h.f()), e);
        }
    }

    @Override // l4.d
    public void c(h request) {
        o.f(request, "request");
        Proxy.Type type = ((k) this.f2570c).f11677b.f11412b.type();
        o.e(type, "connection.route().proxy.type()");
        StringBuilder sb = new StringBuilder();
        sb.append((String) request.f11066b);
        sb.append(' ');
        n nVar = (n) request.f11067c;
        if (nVar.f11329i || type != Proxy.Type.HTTP) {
            String strB = nVar.b();
            String strD = nVar.d();
            if (strD != null) {
                strB = strB + '?' + strD;
            }
            sb.append(strB);
        } else {
            sb.append(nVar);
        }
        sb.append(" HTTP/1.1");
        String string = sb.toString();
        o.e(string, "StringBuilder().apply(builderAction).toString()");
        l((m) request.f11068d, string);
    }

    @Override // l4.d
    public void cancel() {
        Socket socket = ((k) this.f2570c).f11678c;
        if (socket != null) {
            h4.b.e(socket);
        }
    }

    @Override // l4.d
    public k d() {
        return (k) this.f2570c;
    }

    @Override // l4.d
    public F e(x xVar) {
        if (!e.a(xVar)) {
            return k(0L);
        }
        if ("chunked".equalsIgnoreCase(x.c(xVar, "Transfer-Encoding"))) {
            n nVar = (n) xVar.f11401o.f11067c;
            if (this.f2569b == 4) {
                this.f2569b = 5;
                return new c(this, nVar);
            }
            throw new IllegalStateException(("state: " + this.f2569b).toString());
        }
        long jK = h4.b.k(xVar);
        if (jK != -1) {
            return k(jK);
        }
        if (this.f2569b == 4) {
            this.f2569b = 5;
            ((k) this.f2570c).k();
            return new f(this);
        }
        throw new IllegalStateException(("state: " + this.f2569b).toString());
    }

    @Override // l4.d
    public D f(h request, long j5) {
        o.f(request, "request");
        if ("chunked".equalsIgnoreCase(((m) request.f11068d).g("Transfer-Encoding"))) {
            if (this.f2569b == 1) {
                this.f2569b = 2;
                return new m4.b(this);
            }
            throw new IllegalStateException(("state: " + this.f2569b).toString());
        }
        if (j5 == -1) {
            throw new IllegalStateException("Cannot stream a request body without chunked encoding or a known content length!");
        }
        if (this.f2569b == 1) {
            this.f2569b = 2;
            return new m4.e(this);
        }
        throw new IllegalStateException(("state: " + this.f2569b).toString());
    }

    @Override // l4.d
    public long g(x xVar) {
        if (!e.a(xVar)) {
            return 0L;
        }
        if ("chunked".equalsIgnoreCase(x.c(xVar, "Transfer-Encoding"))) {
            return -1L;
        }
        return h4.b.k(xVar);
    }

    @Override // l4.d
    public void h() {
        ((y) this.e).flush();
    }

    public b i() {
        String strL = this.f2569b == 0 ? " registrationStatus" : "";
        if (((Long) this.f2572f) == null) {
            strL = strL.concat(" expiresInSecs");
        }
        if (((Long) this.g) == null) {
            strL = androidx.compose.foundation.text.modifiers.a.l(strL, " tokenCreationEpochInSecs");
        }
        if (strL.isEmpty()) {
            return new b((String) this.f2568a, this.f2569b, (String) this.f2570c, (String) this.f2571d, ((Long) this.f2572f).longValue(), ((Long) this.g).longValue(), (String) this.e);
        }
        throw new IllegalStateException("Missing required properties:".concat(strL));
    }

    public boolean j() {
        return this.f2569b < ((List) this.e).size() || !((ArrayList) this.g).isEmpty();
    }

    public m4.d k(long j5) {
        if (this.f2569b == 4) {
            this.f2569b = 5;
            return new m4.d(this, j5);
        }
        throw new IllegalStateException(("state: " + this.f2569b).toString());
    }

    public void l(m mVar, String requestLine) {
        o.f(requestLine, "requestLine");
        if (this.f2569b != 0) {
            throw new IllegalStateException(("state: " + this.f2569b).toString());
        }
        y yVar = (y) this.e;
        yVar.k(requestLine);
        yVar.k("\r\n");
        int size = mVar.size();
        for (int i5 = 0; i5 < size; i5++) {
            yVar.k(mVar.i(i5));
            yVar.k(": ");
            yVar.k(mVar.l(i5));
            yVar.k("\r\n");
        }
        yVar.k("\r\n");
        this.f2569b = 1;
    }

    public C1264ja m() {
        B.w("getEngine: Trying to acquire lock");
        synchronized (this.f2570c) {
            try {
                B.w("getEngine: Lock acquired");
                B.w("refreshIfDestroyed: Trying to acquire lock");
                synchronized (this.f2570c) {
                    try {
                        B.w("refreshIfDestroyed: Lock acquired");
                        C1308ka c1308ka = (C1308ka) this.g;
                        if (c1308ka != null && this.f2569b == 0) {
                            c1308ka.e(new Xn(this, 14), C1966zG.f10349w);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                B.w("refreshIfDestroyed: Lock released");
                C1308ka c1308ka2 = (C1308ka) this.g;
                if (c1308ka2 != null && ((AtomicInteger) c1308ka2.f505b).get() != -1) {
                    int i5 = this.f2569b;
                    if (i5 == 0) {
                        B.w("getEngine (NO_UPDATE): Lock released");
                        return ((C1308ka) this.g).f();
                    }
                    if (i5 != 1) {
                        B.w("getEngine (UPDATING): Lock released");
                        return ((C1308ka) this.g).f();
                    }
                    this.f2569b = 2;
                    n();
                    B.w("getEngine (PENDING_UPDATE): Lock released");
                    return ((C1308ka) this.g).f();
                }
                this.f2569b = 2;
                this.g = n();
                B.w("getEngine (NULL or REJECTED): Lock released");
                return ((C1308ka) this.g).f();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public C1308ka n() {
        InterfaceC1545pr interfaceC1545prD = AbstractC0773Md.d((Context) this.f2571d, 6);
        interfaceC1545prD.d();
        C1308ka c1308ka = new C1308ka();
        B.w("loadJavascriptEngine > Before UI_THREAD_EXECUTOR");
        AbstractC0803Rd.e.execute(new Gv(14, this, c1308ka));
        B.w("loadNewJavascriptEngine: Promise created");
        c1308ka.e(new C1134ga(this, c1308ka, interfaceC1545prD), new C1134ga(this, c1308ka, interfaceC1545prD));
        return c1308ka;
    }
}
